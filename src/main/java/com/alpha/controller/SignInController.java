package com.alpha.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alpha.DAO.SignIn;
import com.alpha.services.SignInService;

@RestController
public class SignInController {
	
	@Autowired(required = true)
	SignInService service ;
	
	@RequestMapping(value="/saveuser",method = RequestMethod.POST)
	public ResponseEntity<Object> saveUser(@RequestBody SignIn signindto) {
		
		return service.saveUserService(signindto);
		
	}
	
	@RequestMapping(value = "/login",method = RequestMethod.POST)
	public ResponseEntity<Object> loginUser(@RequestBody SignIn singindto){
		
		return service.loginUserService(singindto);
	}
}
