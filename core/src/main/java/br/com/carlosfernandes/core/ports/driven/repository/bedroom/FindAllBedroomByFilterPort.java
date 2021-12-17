package br.com.carlosfernandes.core.ports.driven.repository.bedroom;

import java.util.List;

public interface FindAllBedroomByFilterPort {

    public <T> List<T> apply(BedroomFilter filter, Class<T> projection);

}
