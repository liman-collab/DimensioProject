package com.brotherssweets.bsmanagement.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class PorosiaIdException extends RuntimeException{

    public PorosiaIdException(String message) {
        super(message);
    }
}
