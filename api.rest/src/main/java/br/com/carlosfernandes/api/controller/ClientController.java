package br.com.carlosfernandes.api.controller;

import br.com.carlosfernandes.api.controller.request.ClientRequest;
import br.com.carlosfernandes.api.controller.response.ClientResponse;
import br.com.carlosfernandes.core.ports.driver.CreateClientPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/clientes")
public class ClientController {

    @Autowired
    private CreateClientPort createClientPort;

    @PostMapping ///Create
    public ClientResponse post(@RequestBody ClientRequest clientRequest){
        var client = createClientPort.apply(clientRequest.toClient());
        var clientResponse = new ClientResponse().fromClient(client);

        return clientResponse;
    }
/*
    @GetMapping
    public List<ClientResponse> get(){
        var clientList = findAllClientPort.apply(new Filter());

        var clientResponseList = clientList
                .stream()
                .map((e) -> new ClientResponse().fromClient(e))
                .collect(Collectors.toList());
        return  clientResponseList;
    }

    @GetMapping
    public List<ClientResponse> get(@RequestBody Status status){
        var clientList = findClientPort.apply(name);

        var clientResponseList = clientList
                .stream()
                .map((e) -> new ClientResponse().fromClient(e))
                .collect(Collectors.toList());
        return  clientResponseList;
    }
*/
}
