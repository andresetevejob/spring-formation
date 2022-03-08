package com.afspring.app.withdi.provider;

public class HelloMessageProvider implements MessageProvider{
    @Override
    public String getMessage() {
        return "Hello world";
    }
}
