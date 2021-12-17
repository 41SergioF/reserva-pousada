package br.com.carlosfernandes.core.ports.driver.bedroom;

import br.com.carlosfernandes.core.domain.Status;

public interface AlterStatusPort {

    public void apply(String number, Status status);

}
