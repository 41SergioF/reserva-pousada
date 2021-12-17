package br.com.carlosfernandes.repository.mongodb.bedroom;

import br.com.carlosfernandes.core.domain.Bedroom;
import br.com.carlosfernandes.core.ports.driven.repository.bedroom.BedroomRepositoryPort;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BedroomRepository extends MongoRepository<Bedroom, String>, BedroomRepositoryPort {

    void deleteByNumber(String number);

    Bedroom findByNumber(String number);

}
