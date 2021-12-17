package br.com.carlosfernandes.core.ports.driven.repository.bedroom;

import br.com.carlosfernandes.core.domain.Bedroom;
import org.springframework.data.domain.Example;

import java.util.List;

public interface BedroomRepositoryPort {

    public Bedroom save(Bedroom bedroom);

    public void deleteByNumber(String number);

    public void deleteAll();

    Bedroom findByNumber(String number);
}
