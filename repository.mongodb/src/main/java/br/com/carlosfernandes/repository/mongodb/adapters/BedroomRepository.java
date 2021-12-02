package br.com.carlosfernandes.repository.mongodb.adapters;

import br.com.carlosfernandes.core.domain.Bedroom;
import br.com.carlosfernandes.core.ports.driven.repository.BedroomRepositoryPort;
import br.com.carlosfernandes.repository.mongodb.connections.MongoTemplateSingleton;
import com.mongodb.client.MongoClients;
import org.springframework.data.mongodb.core.MongoTemplate;

public class BedroomRepository implements BedroomRepositoryPort {

    private final MongoTemplate operation;

    public BedroomRepository(){
        operation = MongoTemplateSingleton.operations;
    }

    @Override
    public Bedroom save(Bedroom bedroom) {
        return operation.save(bedroom);
    }
}
