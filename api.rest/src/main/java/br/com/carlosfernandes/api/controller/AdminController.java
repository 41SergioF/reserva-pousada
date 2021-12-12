package br.com.carlosfernandes.api.controller;

import br.com.carlosfernandes.api.controller.request.AdminRequest;
import br.com.carlosfernandes.api.controller.response.AdminResponse;
import br.com.carlosfernandes.core.domain.Admin;
import br.com.carlosfernandes.core.ports.driver.CreateAdminPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/administradores")
public class AdminController {

    @Autowired
    private CreateAdminPort createAdminPort;

    @PostMapping
    public AdminResponse post(@RequestBody AdminRequest adminRequest){
        var admin = createAdminPort.apply(adminRequest.toAdmin());
        var adminResponse = new AdminResponse().fromAdmin(admin);

        return adminResponse;
    }

}
