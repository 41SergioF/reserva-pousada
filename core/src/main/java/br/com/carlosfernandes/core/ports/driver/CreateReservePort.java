package br.com.carlosfernandes.core.ports.driver;

import br.com.carlosfernandes.core.domain.Reserve;

public interface CreateReservePort {

    Reserve apply(Reserve reserve);

}
