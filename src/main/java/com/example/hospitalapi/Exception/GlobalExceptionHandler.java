package com.example.hospitalapi.Exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler  {

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<Map<String,Object>>handleResourceNotFoundException(ResourceNotFoundException ex){
        log.error("Error  : {}", ex.getMessage());
        return buildResponse(HttpStatus.NOT_FOUND, ex.getMessage());


    }@ExceptionHandler(BusinessException.class)
    public ResponseEntity<Map<String,Object>>handleBusinessException(BusinessException ex){
        log.error("Business Error : {}", ex.getMessage());
        return buildResponse(HttpStatus.CONFLICT, ex.getMessage());

    }


    @ExceptionHandler(InvalidRequestException.class)
    public ResponseEntity<Map<String,Object>>handleInvalidRequestException(InvalidRequestException ex){
        log.error("Petition not valid: {}", ex.getMessage());
        return buildResponse(HttpStatus.BAD_REQUEST, ex.getMessage());


    }

    //---
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<Map<String,Object>>handleValidationErrors(MethodArgumentNotValidException ex){
        log.error("Validation Error: {}", ex.getMessage());

        Map<String, String> validationErrors = new HashMap<>();
        ex.getBindingResult().getFieldErrors()
                        .forEach(error -> validationErrors.put(error.getField(), error.getDefaultMessage()));



        Map<String, Object> body = new HashMap<>();
        body.put("timestamp", LocalDateTime.now());
        body.put("status", HttpStatus.BAD_REQUEST.value());
        body.put("error", "validation Error");
        body.put("message", validationErrors);


        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(body);
    }


    @ExceptionHandler(Exception.class)
    public ResponseEntity<Map<String,Object>>handleGeneralException(Exception ex){
        log.error("Unexpected Error: {}", ex.getMessage());
        return buildResponse(HttpStatus.INTERNAL_SERVER_ERROR, "An internal error ocurred, please contact support");
    }






    public ResponseEntity<Map<String,Object>>buildResponse(HttpStatus status, String message){

        Map<String, Object> body = new HashMap<>();
        body.put("timestamp", LocalDateTime.now());
        body.put("status", status.value());
        body.put("error", status.getReasonPhrase());
        body.put("message", message);
        return ResponseEntity.status(status).body(body);


    }



}
