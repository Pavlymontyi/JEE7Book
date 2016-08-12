package com.kraynov.javaee7.contraints.impl;

import com.kraynov.javaee7.contraints.URL;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.net.MalformedURLException;

public class URLValidator implements ConstraintValidator<URL, String> {

    private String protocol;
    private String host;
    private int port;

    @Override
    public void initialize(URL url) {
        this.protocol = url.protocol(); this.host = url.host(); this.port = url.port();
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext constraintValidatorContext) {
        if (value == null || value.length() == 0) {
            return true;
        }
        java.net.URL url;
        try {
            // Преобразуем URL в java.net.URL для проверки того, имеет ли URL допустимый формат
            url = new java.net.URL(value);
        } catch (MalformedURLException e) {
            return false;
        }
        // Проверяет, имеет ли атрибут протокола допустимое значение
        if (protocol != null && protocol.length() > 0 && !url.getProtocol().equals(protocol)) {
            return false;
        }
        if (host != null && host.length() > 0 && !url.getHost().startsWith(host)) {
            return false;
        }
        if (port != -1 && url.getPort() != port) {
            return false;
        }
        return true;
    }
}
