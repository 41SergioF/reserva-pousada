package br.com.carlosfernandes.api.controller;

import br.com.carlosfernandes.api.controller.request.ReserveRequest;
import br.com.carlosfernandes.api.controller.response.ReserveResponse;
import br.com.carlosfernandes.core.domain.Reserve;
import br.com.carlosfernandes.core.ports.driver.CreateReservePort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping(value = "/reservas")
public class ReserveController {

    @Autowired
    CreateReservePort createReservePort;

    @PostMapping
    public ReserveResponse post(@RequestBody @Valid ReserveRequest reserveRequest){
        var reserve = createReservePort.apply(reserveRequest.toReserve());
        var reserveResponse = new ReserveResponse().fromReserve(reserve);

        return reserveResponse;

    }

}
