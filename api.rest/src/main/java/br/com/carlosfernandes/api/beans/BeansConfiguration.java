package br.com.carlosfernandes.api.beans;

import br.com.carlosfernandes.core.ports.driver.CreateClientPort;
import br.com.carlosfernandes.core.us.CreateClientUS;
import br.com.carlosfernandes.email.adapters.SendForTokenConfirmation;
import br.com.carlosfernandes.repository.mongodb.adapters.ClientRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeansConfiguration {

    @Bean
    public CreateClientPort createClientPort(){
        var sendEmail = new SendForTokenConfirmation();
        var repository = new ClientRepository();
        return new CreateClientUS(sendEmail, repository);
    }

}
