package com.example.product.controllers;

import com.example.product.exception.NotFoundException;
import com.example.product.models.error.Error;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler extends Throwable {

    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<Error> notFoundExceptionHandler(NotFoundException exception){
        Error errorModel = new Error();
        errorModel.setCode(exception.getErrorCode());
        errorModel.setDescription(exception.getErrorDescription());
        return new ResponseEntity<>(errorModel, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity exceptionHandler(Exception exception){
        return new ResponseEntity<>(exception.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
    }
}