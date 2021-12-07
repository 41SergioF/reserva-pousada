package br.com.carlosfernandes.core.ports.driven.repository;

import br.com.carlosfernandes.core.domain.Reserve;

public interface ReserveRepositoryPort {

    Reserve save(Reserve reserve);

}
