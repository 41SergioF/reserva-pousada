package br.com.carlosfernandes.core.us;

import br.com.carlosfernandes.core.domain.Admin;
import br.com.carlosfernandes.core.ports.driven.email.SendEmailForTokenConfirmationPort;
import br.com.carlosfernandes.core.ports.driven.repository.AdminRepositoryPort;
import br.com.carlosfernandes.core.ports.driver.CreateAdminPort;
import org.springframework.stereotype.Service;

@Service
public record CreateAdminUS(
        AdminRepositoryPort repository,
        SendEmailForTokenConfirmationPort sendEmail
) implements CreateAdminPort {

    @Override
    public Admin apply(Admin admin){
        System.out.println("Verificar se esse email já existe no BD");
        admin = repository.save(admin);
        sendEmail.apply(admin.getEmail(), "123456987");

        return admin;
    }

}
