package br.com.carlosfernandes;

import br.com.carlosfernandes.core.domain.Bedroom;
import br.com.carlosfernandes.core.domain.Client;
import br.com.carlosfernandes.core.us.CreateBedroomUS;
import br.com.carlosfernandes.core.us.CreateClientUS;

import br.com.carlosfernandes.email.adapters.SendForTokenConfirmation;
import br.com.carlosfernandes.repository.mongodb.adapters.BedroomRepository;
import br.com.carlosfernandes.repository.mongodb.adapters.ClientRepository;

public class Application {
    public static void main(String[] args) {

        /// Cliente teste
        var client = new Client();
        client.setName("teste");
        client.setEmail("teste@gmail.com.br");

        /// Quarto teste
        var bedroom = new Bedroom();
        bedroom.setNumber("1");

        /// Objeto para criação de Client
        var createClientPort = new CreateClientUS(
                new SendForTokenConfirmation(),
                new ClientRepository()
        );

        /// Objeto para criação de Bedroom
        var createBedroomPort = new CreateBedroomUS(
                new BedroomRepository()
        );

        /// Nesse linha mandamos criar o Cliente
        var neonClient = createClientPort.apply(client);
        var neonBedroom = createBedroomPort.apply(bedroom);

    }
}
