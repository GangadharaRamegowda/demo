package com.example.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class TestController {
	
	public static Map<String, Employee> map = new HashMap<>();
	
	@Autowired
	public RepositoryLayer repositoryLayer;
	
	@PostMapping("/insert")
	public ResponseEntity<Employee> createEmployee(@RequestBody Employee emp) {
		
		if (null == map.get(emp.getEmployeeId() + "")) {
			map.put(emp.getEmployeeId() + "", emp);
		}
		
		
		MultiValueMap<String, String> headers = new HttpHeaders();
		headers.set("Response Message", "Succes one");
		return new ResponseEntity<Employee>(emp, headers, HttpStatus.CREATED);
		
	}
	
	@GetMapping("/{employeeId}")
	public ResponseEntity<Object> createEmployee(@PathVariable String employeeId) {
		
		Employee emp = map.get(employeeId);
		ResponseStatus status = null;
		MultiValueMap<String, String> headers = new HttpHeaders();
		
		if (null == emp) {
			status = new ResponseStatus();
			status.setCode("Bus404");
			status.setErrorMessage("Employee Not Found");
			return new ResponseEntity<Object>(status, headers, HttpStatus.NOT_FOUND);
		}
		
		
		headers.set("Response Message", "Succes one");
		return new ResponseEntity<Object>(emp, headers, HttpStatus.FOUND);
		
	}
	
	@GetMapping("/list")
	public ResponseEntity<List<Employee>> getEmployees() {
		
		Set<String> set = map.keySet();
		List<Employee> list = new ArrayList<>();
		
		set.stream().forEach(param -> {
			Employee value = map.get(param);
			list.add(value)	;	
		});
		MultiValueMap<String, String> headers = new HttpHeaders();
		headers.set("Response Message", "Succes one");
		return new ResponseEntity<List<Employee>>(list, HttpStatus.FOUND);
	}
	

}
