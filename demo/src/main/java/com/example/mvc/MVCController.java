package com.example.mvc;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Employee;

@RestController
public class MVCController {
	
	@RequestMapping()
	public String greetingMessage(@RequestBody Employee employee) {
		
		
		return null;
	}

}
