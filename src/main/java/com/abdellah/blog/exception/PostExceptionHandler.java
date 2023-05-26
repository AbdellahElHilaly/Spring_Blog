package com.abdellah.blog.exception;

import java.util.NoSuchElementException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class PostExceptionHandler {

  @ExceptionHandler(NoSuchElementException.class)
  public ResponseEntity<String> handleNoSuchElementException(NoSuchElementException ex) {
    String errorMessage = "Post not found";
    return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorMessage);
  }
}


// waht is the best practest for valide the data in the post, update request add code in the controller or in the service or add new class for validation? -> add new class for validation and call it in the controller 
// best directory for the validation class? -> src\main\java\com\abdellah\blog\validation








