package br.com.carlosfernandes.core.us.bedroom;

import br.com.carlosfernandes.core.ports.driven.repository.bedroom.BedroomFilter;
import br.com.carlosfernandes.core.ports.driven.repository.bedroom.BedroomRepositoryPort;
import br.com.carlosfernandes.core.ports.driver.bedroom.DeleteBedroomByFilterPort;
import org.springframework.stereotype.Service;

@Service
public record DeleteBedroomByFilterUS(
        BedroomRepositoryPort repository
) implements DeleteBedroomByFilterPort {

    @Override
    public void apply(BedroomFilter filter) {

        if (filter.getNumber() != null && !filter.getNumber().isEmpty()){
            repository.deleteByNumber(filter.getNumber());
        }else {
            repository.deleteAll();
        }

    }
}
