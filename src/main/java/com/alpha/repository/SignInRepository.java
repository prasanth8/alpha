package com.alpha.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.alpha.DAO.SignIn;

@Repository
public interface SignInRepository extends JpaRepository<SignIn, Integer>{

	List<SignIn> findByEmailid(String emailId);
	
	List<SignIn> findByEmailidAndPassword(String emailId,String Password);
		
}
