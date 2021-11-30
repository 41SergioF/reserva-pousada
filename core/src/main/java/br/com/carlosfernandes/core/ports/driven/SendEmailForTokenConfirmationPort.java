package br.com.carlosfernandes.core.ports.driven;

public interface SendEmailForTokenConfirmationPort {
    void apply(String email, String token);
}
