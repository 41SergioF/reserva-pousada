package br.com.carlosfernandes.core.ports.driver.bedroom;

import br.com.carlosfernandes.core.ports.driven.repository.bedroom.BedroomFilter;

import java.util.List;

public interface FindAllBedroomByFilterPort {

    <T> List<T> apply(BedroomFilter filter, Class<T> projection);

}
