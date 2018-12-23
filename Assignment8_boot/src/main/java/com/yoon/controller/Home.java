package com.yoon.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.yoon.model.Alien;
import com.yoon.model.Aliens;

@Controller
public class Home {
	
	@RequestMapping("/")
	public String home(){
		return "addAliens";
	}
	
	@ModelAttribute("alien0")
	public Alien getAlien()
	{
		Alien alien = new Alien();
		alien.setId(1);
		alien.setName("A");
		alien.setAge(30);
		alien.setCountry("USA");
		return alien;
	}
	
	@PostMapping("/addAliens")
	public ModelAndView addAlien(@ModelAttribute("alien") Alien alien, ModelAndView mv, HttpSession session) {
				
		Aliens aliens;
		if(session.getAttribute("aliens") == null) 
			aliens = new Aliens();
		else 
			aliens = (Aliens)session.getAttribute("aliens");
		
		aliens.addAliens(alien);	
		session.setAttribute("aliens", aliens);
		mv.setViewName("addAliens");
		return mv;
	}
}
