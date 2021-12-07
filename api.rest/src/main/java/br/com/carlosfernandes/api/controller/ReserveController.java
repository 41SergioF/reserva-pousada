package br.com.carlosfernandes.api.controller;

import br.com.carlosfernandes.api.controller.request.ReserveRequest;
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
    Reserve post(@RequestBody @Valid ReserveRequest reserve){
        return createReservePort.apply(reserve.toReserve());
    }

}
