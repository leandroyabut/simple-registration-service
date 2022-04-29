package com.leandroyabut.registrationservice.exception;

public class UsernameExistsException extends BadRequestException {
    public UsernameExistsException() {
        super("Username already exists.");
    }
}
