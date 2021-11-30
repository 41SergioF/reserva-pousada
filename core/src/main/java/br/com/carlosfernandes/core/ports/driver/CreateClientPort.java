package br.com.carlosfernandes.core.ports.driver;

import br.com.carlosfernandes.core.domain.Client;

public interface CreateClientPort {

    String apply(Client client);

}
