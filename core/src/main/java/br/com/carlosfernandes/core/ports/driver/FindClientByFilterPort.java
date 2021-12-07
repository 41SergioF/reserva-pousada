package br.com.carlosfernandes.core.ports.driver;

import br.com.carlosfernandes.core.domain.Client;

import java.util.List;

public interface FindClientByFilterPort {

    class Filter{
        private String name;
        private String email;
    }

    List<Client> apply(Filter filter);

}
