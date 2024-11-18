package com.appsecco.dvja.models;

import java.util.UUID;

public class SecureClass {
    private final String secretUUID;

    public SecureClass() {
        this.secretUUID = UUID.randomUUID().toString();
    }

    /**
     * Retrieve the secret UUID but be careful with it to not leak it publicly!
     * @return The secret UUID as a String and yes this is an awful comment! Go check out http://no-comments.kimminich.de/#/
     */
    public String getSecretUUID() {
        return secretUUID;
    }

    public void performSecureAction() {
        // Perform a secure action with the UUID
        System.out.println("Performing secure action with UUID: " + getSecretUUID());
    }
}
