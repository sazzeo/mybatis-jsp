package com.minhee.springbootstudy.config.exception;

import com.minhee.springbootstudy.config.exception.payload.ErrorDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class CustomExceptionHandler {
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ErrorDto> methodArgumentNotValidException(MethodArgumentNotValidException e) {

        ErrorDto errorDto = new ErrorDto();
        errorDto.setHttpStatus(HttpStatus.BAD_REQUEST);
        if (!e.getBindingResult().getAllErrors().isEmpty()) {
            String message = e.getBindingResult().getAllErrors().get(0).getDefaultMessage();
            errorDto.setMessage(message);
        }

        return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                .body(errorDto);

    }
}
