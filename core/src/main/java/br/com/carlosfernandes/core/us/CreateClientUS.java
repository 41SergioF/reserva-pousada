package br.com.carlosfernandes.core.us;

import br.com.carlosfernandes.core.domain.Client;
import br.com.carlosfernandes.core.ports.driven.SendEmailForTokenConfirmationPort;
import br.com.carlosfernandes.core.ports.driver.CreateClientPort;

import java.util.UUID;

public record CreateClientUS(
    SendEmailForTokenConfirmationPort sendEmailForTokenConfirmationPort
) implements CreateClientPort {

    @Override
    public String apply(Client client) {
        System.out.println("Verificar se esse email já existe no BD");
        System.out.println("Salvar no banco de dados");
        sendEmailForTokenConfirmationPort.apply(client.getEmail(), "123456987");

        return UUID.randomUUID().toString();
    }
}
