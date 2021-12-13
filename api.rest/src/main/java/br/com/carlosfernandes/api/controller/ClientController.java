package br.com.carlosfernandes.api.controller;

import br.com.carlosfernandes.api.controller.request.ClientRequest;
import br.com.carlosfernandes.api.controller.response.ClientResponse;
import br.com.carlosfernandes.core.domain.Client;
import br.com.carlosfernandes.core.ports.driver.CreateClientPort;
import br.com.carlosfernandes.core.ports.driver.FindAllClientPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import static br.com.carlosfernandes.core.ports.driver.FindClientByFilterPort.Filter;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/clientes")
public class ClientController {

    @Autowired
    private CreateClientPort createClientPort;

    @Autowired
    private FindAllClientPort findAllClientPort;

    @PostMapping ///Create
    public ClientResponse post(@RequestBody ClientRequest clientRequest){
        var client = createClientPort.apply(clientRequest.toClient());
        var clientResponse = new ClientResponse().fromClient(client);

        return clientResponse;
    }

    @GetMapping
    public List<ClientResponse> get(){
        var clientList = findAllClientPort.apply();

        var clientResponseList = clientList
                .stream()
                .map((e) -> new ClientResponse().fromClient(e))
                .collect(Collectors.toList());
        return  clientResponseList;
    }

}
