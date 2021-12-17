package br.com.carlosfernandes.api.controller;

import br.com.carlosfernandes.api.controller.request.BedroomRequest;
import br.com.carlosfernandes.api.controller.response.BedroomResponse;
import br.com.carlosfernandes.core.domain.Bedroom;
import br.com.carlosfernandes.core.domain.Status;
import br.com.carlosfernandes.core.ports.driven.repository.bedroom.BedroomFilter;
import br.com.carlosfernandes.core.ports.driver.bedroom.AlterStatusPort;
import br.com.carlosfernandes.core.ports.driver.bedroom.CreateBedroomPort;
import br.com.carlosfernandes.core.ports.driver.bedroom.DeleteBedroomByFilterPort;
import br.com.carlosfernandes.core.ports.driver.bedroom.FindAllBedroomByFilterPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/quartos")
public class BedroomController {

    @Autowired
    CreateBedroomPort createBedroomPort;

    @Autowired
    FindAllBedroomByFilterPort findAllBedroomByFilterPort;

    @Autowired
    DeleteBedroomByFilterPort deleteBedroomByFilterPort;

    @Autowired
    AlterStatusPort alterStatusPort

    @PostMapping /// Create
    public BedroomResponse post(@RequestBody BedroomRequest bedroomRequest) {
        var bedroom = createBedroomPort.apply(bedroomRequest.toBedroom());
        var bedroomResponse = new BedroomResponse().fromBedroom(bedroom);

        return bedroomResponse;

    }

    @GetMapping /// Read -- Retorna todos os quartos
    public List<BedroomResponse> get(@RequestBody BedroomFilter filter) {
        return findAllBedroomByFilterPort.apply(filter, BedroomResponse.class);
    }

    @PutMapping
    public BedroomResponse update(@RequestBody BedroomRequest bedroomRequest){
        var bedroom = bedroomRequest.toBedroom();

        return alterStatusPort.apply(bedroom.getNumber(), bedroom.getStatus());
    }

    @DeleteMapping
    public void delete(@RequestBody BedroomFilter filter) {
        deleteBedroomByFilterPort.apply(filter);
    }
}