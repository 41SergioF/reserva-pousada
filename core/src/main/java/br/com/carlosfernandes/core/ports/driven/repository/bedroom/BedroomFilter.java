package br.com.carlosfernandes.core.ports.driven.repository.bedroom;

import br.com.carlosfernandes.core.domain.Status;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BedroomFilter {

    private Status status;
    private String number;

}
