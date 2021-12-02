package br.com.carlosfernandes.core.ports.driver;

import br.com.carlosfernandes.core.domain.Client;

public interface CreateClientPort {

    Client apply(Client client);

}
