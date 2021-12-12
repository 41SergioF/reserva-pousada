package br.com.carlosfernandes.core.us;

import br.com.carlosfernandes.core.domain.Client;
import br.com.carlosfernandes.core.ports.driven.repository.ClientRepositoryPort;
import br.com.carlosfernandes.core.ports.driver.FindClientByFilterPort;

import java.util.List;

public class FindClientByFilterUS implements FindClientByFilterPort {

    @Override
    public List<Client> apply(Filter filter) {
        return null;
    }
}
