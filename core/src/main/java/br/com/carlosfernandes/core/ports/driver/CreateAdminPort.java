package br.com.carlosfernandes.core.ports.driver;

import br.com.carlosfernandes.core.domain.Admin;

public interface CreateAdminPort {

    Admin apply(Admin admin);

}
