package com.appsecco.dvja.services;

import java.util.Base64;

public class CookieService {
    private String cookie;

    public void storeCookie(String base64Cookie) {
        byte[] decodedBytes = Base64.getDecoder().decode(base64Cookie);
        this.cookie = new String(decodedBytes);
    }

    public String getCookie() {
        return this.cookie;
    }
}
