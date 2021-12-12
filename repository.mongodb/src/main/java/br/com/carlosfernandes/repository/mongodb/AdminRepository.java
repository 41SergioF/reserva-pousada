package br.com.carlosfernandes.repository.mongodb;

import br.com.carlosfernandes.core.domain.Admin;

import br.com.carlosfernandes.core.ports.driven.repository.AdminRepositoryPort;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AdminRepository extends MongoRepository<Admin, String>, AdminRepositoryPort {
}
