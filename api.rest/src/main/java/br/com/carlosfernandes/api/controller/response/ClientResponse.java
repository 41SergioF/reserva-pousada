package br.com.carlosfernandes.api.controller.response;

import br.com.carlosfernandes.core.domain.Client;

public class ClientResponse {

    private String name;

    public ClientResponse fromClient(Client client){
        this.name = client.getName();

        return this;
    }

}
