package br.com.carlosfernandes.core.ports.driven.repository;

import br.com.carlosfernandes.core.domain.Client;

public interface ClientRepositoryPort {

    Client save(Client client);

}
