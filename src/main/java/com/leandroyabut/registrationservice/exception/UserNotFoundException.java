package com.leandroyabut.registrationservice.exception;

public class UserNotFoundException extends NotFoundException {
    public UserNotFoundException() {
        super("User does not exist.");
    }
}
