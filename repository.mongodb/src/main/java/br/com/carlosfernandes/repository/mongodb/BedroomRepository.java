package br.com.carlosfernandes.repository.mongodb;

import br.com.carlosfernandes.core.domain.Bedroom;
import br.com.carlosfernandes.core.ports.driven.repository.BedroomRepositoryPort;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BedroomRepository extends MongoRepository<Bedroom, String>, BedroomRepositoryPort {
}
