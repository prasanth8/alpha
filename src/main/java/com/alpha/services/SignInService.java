package com.alpha.services;

import java.sql.ResultSet;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;	

import com.alpha.DTO.SignInDTO;
import com.alpha.DTO.Test;
import com.alpha.repository.SignInRepository;


@Service 
public class SignInService {
	
	
	@Autowired()
	private SignInRepository signin;
	
//	public List<SignInDTO> getUserList(){
	
	 public String getUserList() {
//		String sql = "select * from alp_user";
		
		//System.out.println("Sign in :"+jdbcTemplate.queryForObject(sql,SignInDTO.class));
		Test test = new Test();
		System.out.println("Inside Service...");
		test.setName("Sami ");
		//System.out.println("Inside getuser list....");
		signin.save(test);
		return "Successfully inserted record...";
	}

}
