package br.com.carlosfernandes.core.us;

import br.com.carlosfernandes.core.domain.Bedroom;
import br.com.carlosfernandes.core.ports.driven.repository.BedroomRepositoryPort;
import br.com.carlosfernandes.core.ports.driver.CreateBedroomPort;

public record CreateBedroomUS(
        BedroomRepositoryPort repository
) implements CreateBedroomPort {

    @Override
    public Bedroom apply(Bedroom bedroom){
        return repository.save(bedroom);
    }

}
