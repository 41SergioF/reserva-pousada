package br.com.carlosfernandes.email.adapters;

import br.com.carlosfernandes.core.ports.driven.email.SendEmailForTokenConfirmationPort;
import org.springframework.stereotype.Service;

@Service
public class SendForTokenConfirmation implements SendEmailForTokenConfirmationPort{
    @Override
    public void apply(String email, String token) {
        System.out.println("Send email.....");
        System.out.println("Toker: " + token);
    }
}
