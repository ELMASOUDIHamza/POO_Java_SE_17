package com.hospital.exceptions;

public class PersonNotFoundException extends Exception {

    public PersonNotFoundException() {

    }

    public PersonNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public PersonNotFoundException(String s) {
        super(s);
    }
}
