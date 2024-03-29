package com.alpha.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alpha.DAO.HomePage;

@RestController
public class HomePageController {
	
	HomePage homepage = new HomePage();
	
	@RequestMapping(value = "/welcome" , method = RequestMethod.GET)
	public String getWelcomeMessage(@RequestParam("name") String name) {
		
		
		
		return name.substring(0,1).toUpperCase()+name.substring(1, name.length())+" "+homepage.getWelcomeMessage();
	}
	
}
