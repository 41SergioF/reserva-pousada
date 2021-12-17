package br.com.carlosfernandes.repository.mongodb;

import br.com.carlosfernandes.core.domain.Reserve;
import br.com.carlosfernandes.core.ports.driven.repository.reserve.ReserveRepositoryPort;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ReserveRepository extends MongoRepository<Reserve, String>, ReserveRepositoryPort {
}
