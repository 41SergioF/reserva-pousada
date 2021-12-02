package br.com.carlosfernandes.repository.mongodb.adapters;

import br.com.carlosfernandes.core.domain.Client;
import br.com.carlosfernandes.core.ports.driven.repository.SaveClientRepositoryPort;
import com.mongodb.client.MongoClients;
import org.springframework.data.mongodb.core.MongoClientFactoryBean;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;

import java.util.UUID;

import static org.springframework.data.mongodb.core.query.Query.query;

public class SaveClientReposiory implements SaveClientRepositoryPort{

    private final MongoOperations operation;

    public SaveClientReposiory(){
        // Esse trexo cria a conecxão com o bando de dados
        var clint = MongoClients.create("mongodb://localhost:27017/reserva_mongo");
        // Chama o banco de dados
        operation = new MongoTemplate(clint, "reserva_mongo");
    }

    @Override
    public String apply(Client client) {
        return operation.insert(client).getId();
    }

    @Override
    public String apply(String id, Client client) {
        operation.updateFirst(query(where(id).is(id), update("name", client.getName()), Client.class));
        return id;
    }
}

