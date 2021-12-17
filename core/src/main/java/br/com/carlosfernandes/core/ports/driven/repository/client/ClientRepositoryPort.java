package br.com.carlosfernandes.core.ports.driven.repository.client;

import br.com.carlosfernandes.core.domain.Client;

import java.util.List;

public interface ClientRepositoryPort {

    Client save(Client client);

    List<Client> findAll();

}
