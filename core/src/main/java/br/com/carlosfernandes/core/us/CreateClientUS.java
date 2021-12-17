package br.com.carlosfernandes.core.us;

import br.com.carlosfernandes.core.domain.Client;
import br.com.carlosfernandes.core.ports.driven.email.SendEmailForTokenConfirmationPort;
import br.com.carlosfernandes.core.ports.driven.repository.client.ClientRepositoryPort;
import br.com.carlosfernandes.core.ports.driver.CreateClientPort;
import org.springframework.stereotype.Service;

@Service
public record CreateClientUS(
    SendEmailForTokenConfirmationPort sendEmail,
    ClientRepositoryPort repository
) implements CreateClientPort {

    @Override
    public Client apply(Client client) {
        System.out.println("Verificar se esse email já existe no BD");
        client = repository.save(client);
        sendEmail.apply(client.getEmail(), "123456987");
        return client;
    }

}
