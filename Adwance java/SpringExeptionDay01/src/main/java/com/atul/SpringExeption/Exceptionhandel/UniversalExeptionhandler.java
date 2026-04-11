package com.atul.SpringExeption.Exceptionhandel;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class UniversalExeptionhandler extends ResponseEntityExceptionHandler{
	@ExceptionHandler(value = Exception.class)
	public ResponseEntity<Object> handleCostomException(Exception ex ,WebRequest req) {
		
		  String resp = "Something went wrong!";
		  
		  return handleExceptionInternal(ex, resp, new HttpHeaders(), HttpStatus.BAD_REQUEST, req);
	 }
}
