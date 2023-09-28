package com.minhee.springbootstudy.config.exception;

import org.springframework.http.HttpStatus;

public class CustomException extends RuntimeException {

    private HttpStatus httpStatus;

    public CustomException() {
    }

    public CustomException(final String message) {
        super(message);
        this.httpStatus = HttpStatus.BAD_REQUEST;
    }

}
