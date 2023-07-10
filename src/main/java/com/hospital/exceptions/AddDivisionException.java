package com.hospital.exceptions;

public class AddDivisionException extends Exception {
    public AddDivisionException(String message) {
        super(message);

    }

    public AddDivisionException(String message, Throwable cause) {
        super(message, cause);
    }

}
