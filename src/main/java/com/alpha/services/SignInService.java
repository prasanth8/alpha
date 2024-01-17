package com.alpha.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.alpha.DAO.SignIn;
import com.alpha.repository.SignInRepository;
import com.alpha.response.ResponseHandler;


@Service 
public class SignInService {
	
	
	@Autowired()
	private SignInRepository signinRepo;
		
	 
	//Register User into database
	 public ResponseEntity<Object> saveUserService(SignIn signindto) {
		 
		 //Checking whether user already exist  
		 if(signinRepo.findByEmailid(signindto.getEmailid()).isEmpty()) {
			 signinRepo.save(signindto);
			 return ResponseHandler.generateResponse("User details inserted successfully", null,HttpStatus.OK);
		 }else {
			 return ResponseHandler.generateResponse("User already exist", null,HttpStatus.CONFLICT);
		 }
		 
	 }
	 
	 //Check user existence for login
	 public ResponseEntity<Object> loginUserService(SignIn signindto){
		 
		 //Finding user based on email and password match
		 List<SignIn> result = signinRepo.findByEmailidAndPassword(signindto.getEmailid(), signindto.getPassword());
		 
		 if(!result.isEmpty()) {
			 return ResponseHandler.generateResponse("User", result, HttpStatus.OK);
		 }else {
			 return ResponseHandler.generateResponse("User not found", null, HttpStatus.NOT_FOUND);
			 
		 }
		 
	 }
	 
}