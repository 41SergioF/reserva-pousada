package br.com.carlosfernandes.core.ports.driver.bedroom;

import br.com.carlosfernandes.core.ports.driven.repository.bedroom.BedroomFilter;

public interface DeleteBedroomByFilterPort {

    public void apply(BedroomFilter filter);

}
