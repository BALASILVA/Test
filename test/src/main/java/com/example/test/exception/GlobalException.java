package com.example.test.exception;

import com.example.test.bene.Error;
import static org.springframework.http.HttpStatus.*;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalException {

	@ExceptionHandler(CustomException.class)
	public ResponseEntity<Error> customException(String errorMessage) {
		Error error = new Error(500, errorMessage);
		return new ResponseEntity(error, INTERNAL_SERVER_ERROR);
	}

}
