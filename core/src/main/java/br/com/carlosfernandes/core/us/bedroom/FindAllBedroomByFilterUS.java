package br.com.carlosfernandes.core.us.bedroom;

import br.com.carlosfernandes.core.ports.driven.repository.bedroom.BedroomFilter;
import br.com.carlosfernandes.core.ports.driven.repository.bedroom.FindAllBedroomByFilterPort;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public record FindAllBedroomByFilterUS(
      FindAllBedroomByFilterPort findBedroomByFilterPort
) implements br.com.carlosfernandes.core.ports.driver.bedroom.FindAllBedroomByFilterPort {

    @Override
    public <T> List<T> apply(BedroomFilter filter, Class<T> projection) {
        return findBedroomByFilterPort.apply(filter, projection);
    }
}
