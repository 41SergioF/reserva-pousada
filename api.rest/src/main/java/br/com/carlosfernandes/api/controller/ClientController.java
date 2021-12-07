package br.com.carlosfernandes.api.controller;

import br.com.carlosfernandes.api.controller.request.ClientRequest;
import br.com.carlosfernandes.core.domain.Client;
import br.com.carlosfernandes.core.ports.driver.CreateClientPort;
import br.com.carlosfernandes.core.us.CreateClientUS;
import br.com.carlosfernandes.email.adapters.SendForTokenConfirmation;
import br.com.carlosfernandes.repository.mongodb.adapters.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/clientes")
public class ClientController {

    @Autowired
    private CreateClientPort createClientPort;

    @PostMapping
    public Client post(@RequestBody ClientRequest client){
        return createClientPort.apply(client.toClient());
    }

}
