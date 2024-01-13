package com.alpha.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alpha.DTO.SignInDTO;
import com.alpha.services.SignInService;

@RestController
public class SignInController {
	
	@Autowired(required = true)
	SignInService service ;
	
	@RequestMapping(value = "/getuser" , method = RequestMethod.GET)
	//public List<SignInDTO> getWelcomeMessage() {
	public String get() {	
	System.out.println("Inside Controller..");
		return service.getUserList();
		//return service.getUserList();
	}
}
