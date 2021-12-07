package br.com.carlosfernandes.repository.mongodb.adapters;

import br.com.carlosfernandes.core.domain.Client;
import br.com.carlosfernandes.core.domain.Reserve;
import br.com.carlosfernandes.core.ports.driven.repository.ClientRepositoryPort;
import br.com.carlosfernandes.core.ports.driven.repository.ReserveRepositoryPort;
import br.com.carlosfernandes.repository.mongodb.connections.MongoTemplateSingleton;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.stereotype.Service;

@Service
public class ReserveRepository implements ReserveRepositoryPort {

    private final MongoOperations operation;

    public ReserveRepository(){
        operation = MongoTemplateSingleton.operations;
    }

    @Override
    public Reserve save(Reserve reserve) {
        return operation.save(reserve);
    }

}

