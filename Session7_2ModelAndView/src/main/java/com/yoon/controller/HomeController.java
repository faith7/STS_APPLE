package com.yoon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.yoon.model.Alien;

@Controller			//multi action controller
public class HomeController {
	
	@RequestMapping("/")
	public String home() {
		
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
	
/*	@PostMapping("addAlien")
	public ModelAndView addAlien(@RequestParam int aid, @RequestParam String aname, @RequestParam int age) {

		ModelAndView mv = new ModelAndView("result");
		
		Alien alien = new Alien();
		alien.setAid(aid);
		alien.setAname(aname);
		alien.setAge(age);
		
		mv.addObject("alien", alien);
		
		return mv;
	}
*/
	
	@PostMapping("addAlien")
	public ModelAndView addAlien(@ModelAttribute("alien1") Alien alien) {

		ModelAndView mv = new ModelAndView("result");
		
//		mv.addObject("alien", alien);
		
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
