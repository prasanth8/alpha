package com.alpha;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@ComponentScan(basePackages = { "com.alpha.controller","com.alpha.services"} ) // if you want to add controller for another package add it in this base packages
@Configuration
@EnableJpaRepositories(basePackages ="com.alpha.repository")
public class alphaApplication extends SpringBootServletInitializer {
	
	@Override
    protected SpringApplicationBuilder configure(final SpringApplicationBuilder application) {
        return application.sources(alphaApplication.class);
    }
	
	public static void main(String[] args) {
		SpringApplication.run(alphaApplication.class, args);
		System.out.print("WELCOME TO ALPHA");
	}
		
		@RequestMapping(value = "/hello")
		@ResponseBody
		public String helloGFG()
	    {  
		/*	Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  
					"jdbc:mysql://localhost:3307/alpha","root","alpha");  
			Statement stmt=con.createStatement();  
			

			ResultSet rs=stmt.executeQuery("select * from alp_user"); 
			System.out.println("outside");
			while(rs.next())  {
				System.out.println("Inside");
				System.out.println("Data from DB:::"+rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
				
				} 
			con.close();
		*/	
		//	System.out.println("Count:"+testrepo.count());
	        return "Hello from Alpha"; 
	    }

	
		 		
}

