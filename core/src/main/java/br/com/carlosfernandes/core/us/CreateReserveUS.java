package br.com.carlosfernandes.core.us;

import br.com.carlosfernandes.core.domain.Reserve;
import br.com.carlosfernandes.core.ports.driven.repository.reserve.ReserveRepositoryPort;
import br.com.carlosfernandes.core.ports.driver.CreateReservePort;
import org.springframework.stereotype.Service;

@Service
public record CreateReserveUS(
        ReserveRepositoryPort repository
) implements CreateReservePort {

    @Override
    public Reserve apply(Reserve reserve) {
        return repository.save(reserve);
    }
}
