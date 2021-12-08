package br.com.carlosfernandes.core.us;

import br.com.carlosfernandes.core.domain.Bedroom;
import br.com.carlosfernandes.core.domain.Client;
import br.com.carlosfernandes.core.ports.driven.repository.AdminRepositoryPort;
import br.com.carlosfernandes.core.ports.driven.repository.BedroomRepositoryPort;
import br.com.carlosfernandes.core.ports.driver.CreateBedroomPort;
import org.springframework.stereotype.Service;

@Service
public record CreateAdminUS(
        AdminRepositoryPort repository
) implements CreateAdminPort {

    @Override
    public Admin apply(Admin admin){
        System.out.println("Verificar se esse email já existe no BD");
        admin = repository.save(admin);
        sendEmail.apply(admin.getEmail(), "123456987");

        return admin;
    }

}
