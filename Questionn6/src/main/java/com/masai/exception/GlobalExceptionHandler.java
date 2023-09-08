package com.masai.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import java.time.LocalDate;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(EmployeeException.class)
    public ResponseEntity<MyErrorDetails> userExceptionHandler(EmployeeException ex, WebRequest wb){

        MyErrorDetails err = new MyErrorDetails();
        err.setTimestamp(LocalDate.now());
        err.setMessage(ex.getMessage());
        err.setDetails(wb.getDescription(false));

        return new ResponseEntity<>(err, HttpStatus.BAD_REQUEST);
    }

    
    @ExceptionHandler(Exception.class)
    public ResponseEntity<MyErrorDetails> otherExceptionHandler(Exception ex, WebRequest wb){

        MyErrorDetails err = new MyErrorDetails();
        err.setTimestamp(LocalDate.now());
        err.setMessage(ex.getMessage());
        err.setDetails(wb.getDescription(false));

        return new ResponseEntity<>(err, HttpStatus.BAD_REQUEST);
    }
}
