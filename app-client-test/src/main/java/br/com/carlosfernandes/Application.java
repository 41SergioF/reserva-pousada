package br.com.carlosfernandes;

import br.com.carlosfernandes.core.domain.Client;
import br.com.carlosfernandes.core.ports.driver.CreateClientPort;
import br.com.carlosfernandes.core.us.CreateClientUS;

import br.com.carlosfernandes.email.adapters.SendForTokenConfirmation;
import br.com.carlosfernandes.repository.mongodb.adapters.SaveClientReposiory;

public class Application {
    public static void main(String[] args) {
        var client = new Client();
        client.setName("Carlos Sérgio");
        client.setEmail("carlossergio2401@outlook.com");
        client.setReserves(null);

        var sendEmail = new SendForTokenConfirmation();
        var repo = new SaveClientReposiory();

        var createClientPort = new CreateClientUS(sendEmail, repo);

        var id = createClientPort.apply(client);

        System.out.println("ID: " + id);
    }
}
