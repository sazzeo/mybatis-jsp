package com.minhee.springbootstudy.config.exception.payload;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@NoArgsConstructor
@Getter
@Setter
public class ErrorDto {

    private String message;
    private HttpStatus httpStatus;

    public boolean isError() {
        return httpStatus.isError();
    }

    public int getStatus() {
        return httpStatus.value();
    }
}
