package br.com.carlosfernandes.core.us;

import br.com.carlosfernandes.core.domain.Client;
import br.com.carlosfernandes.core.ports.driven.email.SendEmailForTokenConfirmationPort;
import br.com.carlosfernandes.core.ports.driven.repository.SaveClientRepositoryPort;
import br.com.carlosfernandes.core.ports.driver.CreateClientPort;

import java.util.UUID;

public record CreateClientUS(
    SendEmailForTokenConfirmationPort sendEmailForTokenConfirmationPort,
    SaveClientRepositoryPort saveClientRepositoryPort
) implements CreateClientPort {

    @Override
    public String apply(Client client) {
        System.out.println("Verificar se esse email já existe no BD");
        var id = saveClientRepositoryPort.apply(client);
        sendEmailForTokenConfirmationPort.apply(client.getEmail(), "123456987");
        return id;
    }

}
