package br.com.carlosfernandes.core.us;

import br.com.carlosfernandes.core.domain.Client;
import br.com.carlosfernandes.core.ports.driven.repository.ClientRepositoryPort;
import br.com.carlosfernandes.core.ports.driver.FindAllClientPort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public record FindAllClientUS(
        ClientRepositoryPort repository
) implements FindAllClientPort {

    @Override
    public List<Client> apply() {
        return repository.findAll();
    }

}
