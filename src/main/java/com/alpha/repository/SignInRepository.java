package com.alpha.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.alpha.DTO.SignInDTO;
import com.alpha.DTO.Test; 

@Repository
public interface SignInRepository extends JpaRepository<Test, Long>{

	
	
}
