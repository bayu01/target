package com.jacques.target.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

import com.jacques.target.domain.ExceptionResponse;

@ControllerAdvice
@RestController
public class ExceptionHandlingController {

	@ExceptionHandler(Exception.class)
	public ResponseEntity<ExceptionResponse> productNotFound(Exception exception) {
		ExceptionResponse response = new ExceptionResponse();
		response.setErrorCode("Not Found");
		response.setErrorMessage(exception.getMessage());

		return new ResponseEntity<ExceptionResponse>(response, HttpStatus.NOT_FOUND);
	}
}
