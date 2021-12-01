package br.com.carlosfernandes.repository.mongodb.adapters;

import br.com.carlosfernandes.core.domain.Client;
import br.com.carlosfernandes.core.ports.driven.repository.SaveClientRepositoryPort;
import com.mongodb.client.MongoClients;
import org.springframework.data.mongodb.core.MongoClientFactoryBean;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;

import java.util.UUID;

public class SaveClientReposiory implements SaveClientRepositoryPort{

    private final MongoOperations operation;

    public SaveClientReposiory(){
        // Esse trexo cria a conecxão com o bando de dados
        var clint = new MongoClients.create("mongodb://localhost:27017/reserva_mongo");
        // Chama o banco de dados
        operation = new MongoTemplate(clint, "reserva_mongo");
    }

    @Override
    public String apply(Client client) {
        return  operation.insert(client);
    }

    @Override
    public String apply(String id, Client client) {
        return null;
    }
}
