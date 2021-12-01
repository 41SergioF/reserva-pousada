package br.com.carlosfernandes.core.ports.driven.repository;

import br.com.carlosfernandes.core.domain.Client;

public interface SaveClientRepositoryPort {

    String apply(Client client);

    String apply(String id, Client client);

}
