package com.yoon.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionController {


		//to print out the object of exception
		@ExceptionHandler(ArithmeticException.class)
		public String handleArithmeticException(Model m, Exception e) {
		
			m.addAttribute("exception", e);
			return "exception";
		}
		
		//to check exception hierarchy
		@ExceptionHandler(RuntimeException.class)
		public String handlerRuntimeException(Model m, Exception e) {
			
			m.addAttribute("exception", e);
			return "exception";
		}
}
