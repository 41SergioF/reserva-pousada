package br.com.carlosfernandes.core.ports.driven.email;

public interface SendEmailForTokenConfirmationPort {
    void apply(String email, String token);
}
