package com.yoon.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;

@ControllerAdvice
public class Exception {
 
	@ExceptionHandler(ArithmeticException.class)
	public String handleArithmeticException(Model m, Exception e) {
		m.addAttribute("exception", e);
		return "exception";
	}
	
	@ExceptionHandler(RuntimeException.class)
	public String handleRuntimeException(Model m, Exception e) {
		m.addAttribute("exception", e);
		return "exception";
	}
}
