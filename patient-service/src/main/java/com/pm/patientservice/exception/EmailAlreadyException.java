package com.pm.patientservice.exception;

public class EmailAlreadyException extends RuntimeException{
    public EmailAlreadyException(String message) {
        super(message);
    }
}
