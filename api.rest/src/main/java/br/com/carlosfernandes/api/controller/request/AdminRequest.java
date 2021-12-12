package br.com.carlosfernandes.api.controller.request;

import br.com.carlosfernandes.core.domain.Admin;

public class AdminRequest {

    private String name;
    private String email;
    private String password;

    public Admin toAdmin(){
        var admin = new Admin();
        admin.setName(name);
        admin.setEmail(email);
        admin.setPassword(password);

        return admin;
    }

}
