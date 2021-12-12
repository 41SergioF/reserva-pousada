package br.com.carlosfernandes.repository.mongodb.adapters;

import br.com.carlosfernandes.core.domain.Admin;
import br.com.carlosfernandes.core.ports.driven.repository.AdminRepositoryPort;
import br.com.carlosfernandes.repository.mongodb.connections.MongoTemplateSingleton;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.stereotype.Service;

@Service
public class AdminRepository implements AdminRepositoryPort {

    private final MongoOperations operations;

    public AdminRepository() {
        operations = MongoTemplateSingleton.operations;
    }

    @Override
    public Admin save(Admin admin) {
        return operations.save(admin);
    }
}
