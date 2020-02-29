/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rest.RestFullServices;

import java.util.Date;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

/**
 *
 * @author vijay
 */
@ControllerAdvice
@RestController
public class ResponseExceptionHandler  extends ResponseEntityExceptionHandler{
    
        @ExceptionHandler(Exception.class)
        public final ResponseEntity<Object> handleAllExceptions(Exception ex, WebRequest request)   {
            
          ResponseException responseException = new ResponseException (new Date(), ex.getMessage(), request.getDescription(false));
          return new ResponseEntity(responseException,HttpStatus.INTERNAL_SERVER_ERROR);
        }
         
        
        @ExceptionHandler(UserNotFoundException.class)
        public final ResponseEntity<Object> handleUserNotFoundException(UserNotFoundException ex, WebRequest request)   {
            
          ResponseException responseException = new ResponseException (new Date(), ex.getMessage(), request.getDescription(false));
          return new ResponseEntity(responseException,HttpStatus.NOT_FOUND);
        }
  
}
