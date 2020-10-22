package com.icicibank.apimgmt.exceptionHandle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.icicibank.apimgmt.model.ErrorResponse;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@Autowired
	ErrorResponse errorReponse;
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorResponse> handleJSonException(final Exception e){
		
		e.printStackTrace();
		 errorReponse.setStatus("FAIL");
		errorReponse.setErrorCode(HttpStatus.BAD_REQUEST.toString());
		errorReponse.setErrorMessage(e.getLocalizedMessage());
		
		return ResponseEntity.badRequest().body(errorReponse);
		
	}
}
