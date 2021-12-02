package br.com.carlosfernandes.core.ports.driver;

import br.com.carlosfernandes.core.domain.Bedroom;

public interface CreateBedroomPort {

    Bedroom apply(Bedroom bedroom);

}
