package br.com.carlosfernandes.core.us.bedroom;

import br.com.carlosfernandes.core.domain.Bedroom;
import br.com.carlosfernandes.core.ports.driven.repository.bedroom.BedroomRepositoryPort;
import br.com.carlosfernandes.core.ports.driver.bedroom.CreateBedroomPort;
import org.springframework.stereotype.Service;

@Service
public record CreateBedroomUS(
        BedroomRepositoryPort repository
) implements CreateBedroomPort {

    @Override
    public Bedroom apply(Bedroom bedroom){
        return repository.save(bedroom);
    }

}
