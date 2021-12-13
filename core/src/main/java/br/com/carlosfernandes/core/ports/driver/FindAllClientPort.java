package br.com.carlosfernandes.core.ports.driver;

import br.com.carlosfernandes.core.domain.Client;

import java.util.List;

public interface FindAllClientPort {

    List<Client> apply();

}
