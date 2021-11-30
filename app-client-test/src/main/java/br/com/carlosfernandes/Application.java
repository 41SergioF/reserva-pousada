package br.com.carlosfernandes;

import br.com.carlosfernandes.core.domain.Client;
import br.com.carlosfernandes.core.ports.driver.CreateClientPort;
import br.com.carlosfernandes.core.us.CreateClientUS;

import br.com.carlosfernandes.email.adapters.SendForTokenConfirmation;

public class Application {
    public static void main(String[] args) {
        var client = new Client();
        client.setName("Carlos Sérgio");
        client.setEmail("carlossergio2401@outlook.com");
        var sendEmail = new SendForTokenConfirmation();
        var createClientPort = new CreateClientUS(sendEmail);

        var id = createClientPort.apply(client);

        System.out.println("ID: " + id);
    }
}
