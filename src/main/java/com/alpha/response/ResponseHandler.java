package com.alpha.response;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class ResponseHandler {

	public static ResponseEntity<Object> generateResponse(String message,Object responseObj,HttpStatus status) {
		
		Map<String, Object> map = new HashMap<String, Object>();
		
		map.put("message", message);
		map.put("data", responseObj);
		map.put("status", status);
		
		return new ResponseEntity<Object>(map,status);
	}
	
}
