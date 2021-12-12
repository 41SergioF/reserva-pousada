package br.com.carlosfernandes.api.controller;

import br.com.carlosfernandes.api.controller.request.ClientRequest;
import br.com.carlosfernandes.api.controller.response.ClientResponse;
import br.com.carlosfernandes.core.domain.Client;
import br.com.carlosfernandes.core.ports.driver.CreateClientPort;
import br.com.carlosfernandes.core.ports.driver.FindClientByFilterPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import static br.com.carlosfernandes.core.ports.driver.FindClientByFilterPort.Filter;

import java.util.List;

@RestController
@RequestMapping(value = "/clientes")
public class ClientController {

    @Autowired
    private CreateClientPort createClientPort;

    @PostMapping
    public ClientResponse post(@RequestBody ClientRequest clientRequest){
        var client = createClientPort.apply(clientRequest.toClient());
        var clientResponse = new ClientResponse().fromClient(client);

        return clientResponse;
    }

}
