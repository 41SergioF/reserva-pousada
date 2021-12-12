package br.com.carlosfernandes.api.controller.response;

import br.com.carlosfernandes.core.domain.Admin;

public class AdminResponse {

    private String name;

    public AdminResponse fromAdmin(Admin admin){
        this.name = admin.getName();

        return this;
    }

}
