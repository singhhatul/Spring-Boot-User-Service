package com.stackroute.exception;

public class UserAlreadyExistException extends Exception {
    //Declared message variable for exception message
    private String message;

    public UserAlreadyExistException() {
    }

    public UserAlreadyExistException(String message) {
        super(message);
        this.message = message;
    }
}
