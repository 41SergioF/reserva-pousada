package br.com.carlosfernandes.api.controller;

import br.com.carlosfernandes.core.domain.Client;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/clientes")
public class ClienteController {

    @PostMapping
    public Client post(@RequestBody  Client client){
        
    }

}
