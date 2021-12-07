package br.com.carlosfernandes.repository.mongodb.adapters;

import br.com.carlosfernandes.core.domain.Client;
import br.com.carlosfernandes.core.ports.driven.repository.ClientRepositoryPort;
import br.com.carlosfernandes.repository.mongodb.connections.MongoTemplateSingleton;
import com.mongodb.client.MongoClients;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;

public class ClientRepository implements ClientRepositoryPort {

    private final MongoOperations operation;

    public ClientRepository(){
        operation = MongoTemplateSingleton.operations;
    }

    @Override
    public Client save(Client client) {
        return operation.save(client);
    }

}

