package com.yoon.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.yoon.model.Alien;

@Controller			//multi action controller
public class HomeController {
	
	@RequestMapping("/")
	public String home(Model m) {
		Alien alien = new Alien();
		alien.setAid(0);
		alien.setAname("Navin");
		alien.setAge(20);
		
		m.addAttribute("alien", alien);
		
		return "home";
	}
	
	//introduced Spring4.3 @PostMapping
	@PostMapping(value="add")
	public ModelAndView add(@RequestParam("t1") int num1, @RequestParam("t2") int num2, ModelAndView mv) {
		
		int result = num1 + num2; 
		mv.addObject("result", result);
		mv.setViewName("result");
	
		return mv; 
	}
		
	
	@GetMapping(value="divide")
	public ModelAndView divide(@RequestParam("t1") int num1, @RequestParam("t2") int num2, ModelAndView mv) {
		
		int result = num1/num2; 
		mv.addObject("result", result);
		mv.setViewName("result");
	
		return mv; 
	}
	
/*	@ExceptionHandler(ArithmeticException.class)
	public String handleArithmeticException() {
		System.out.println("something went wrong");
		return "exception";
	}*/
	
	/*//to print out the object of exception
	@ExceptionHandler(ArithmeticException.class)
	public String handleArithmeticException(Model m, Exception e) {
	
		m.addAttribute("exception", e);
		return "exception";
	}*/
	
	
	@PostMapping("addAlien")
	public ModelAndView addAlien(@ModelAttribute("alien1") Alien alien) {

		ModelAndView mv = new ModelAndView("result");
		
		return mv;
	}
	
	@ModelAttribute("alien0")
	public Alien getAlien() {
		Alien alien = new Alien();
		alien.setAid(101);
		alien.setAname("A");
		alien.setAge(20);
		
		return alien;
	}
	
	

	
}
