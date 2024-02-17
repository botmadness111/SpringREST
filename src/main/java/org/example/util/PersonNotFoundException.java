package org.example.util;

public class PersonNotFoundException extends RuntimeException{
    private final String message = "Not Found Person";

    @Override
    public String getMessage() {
        return message;
    }
}
