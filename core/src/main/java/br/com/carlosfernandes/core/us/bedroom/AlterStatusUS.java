package br.com.carlosfernandes.core.us.bedroom;

import br.com.carlosfernandes.core.domain.Bedroom;
import br.com.carlosfernandes.core.domain.Status;
import br.com.carlosfernandes.core.ports.driven.repository.bedroom.BedroomRepositoryPort;
import br.com.carlosfernandes.core.ports.driver.bedroom.AlterStatusPort;
import org.springframework.stereotype.Service;

@Service
public record AlterStatusUS(
        BedroomRepositoryPort repository
) implements AlterStatusPort {

    public Bedroom apply(String number, Status status) {
        var bedroom = repository.findByNumber(number);
        bedroom.setStatus(status);

        return repository.save(bedroom);
    }
}
