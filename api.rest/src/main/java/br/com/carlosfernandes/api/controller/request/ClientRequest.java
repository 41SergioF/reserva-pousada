package br.com.carlosfernandes.api.controller.request;

import br.com.carlosfernandes.core.domain.Client;

public class ClientRequest {

    private String name;
    private String email;
    private String password;

    public Client toClient(){
        var client = new Client();
        client.setName(name);
        client.setEmail(email);
        client.setPassword(password);

        return client;
    }


}
