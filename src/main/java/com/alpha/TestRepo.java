package com.alpha;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.alpha.DTO.Test;

@Repository
public interface TestRepo extends JpaRepository<Test,Integer>{

}
