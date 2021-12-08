package br.com.carlosfernandes.api.controller;

import br.com.carlosfernandes.api.controller.request.BedroomRequest;
import br.com.carlosfernandes.api.controller.response.BedroomResponse;
import br.com.carlosfernandes.core.domain.Bedroom;
import br.com.carlosfernandes.core.domain.Reserve;
import br.com.carlosfernandes.core.ports.driver.CreateBedroomPort;
import br.com.carlosfernandes.core.ports.driver.CreateReservePort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotNull;

@RestController
@RequestMapping(value = "/quartos")
public class BedroomController {

    @Autowired
    CreateBedroomPort createBedroomPort;

    @PostMapping
    public BedroomResponse post(@RequestBody BedroomRequest bedroomRequest){
        var bedroom = createBedroomPort.apply(bedroomRequest.toBedroom());
        var bedroomResponse = new BedroomResponse().fromBedroom(bedroom);

        return bedroomResponse;

    }

}
