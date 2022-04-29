package com.leandroyabut.registrationservice.exception;

public class EmailExistsException extends BadRequestException {
    public EmailExistsException() {
        super("Email already exists.");
    }
}
