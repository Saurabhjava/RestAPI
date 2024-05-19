package com.saurabh.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.saurabh.model.Employee;
import com.saurabh.service.EmployeeService;

@RestController
@RequestMapping("employees")
public class HelloController {
	@Autowired
	private EmployeeService service;
	
	@GetMapping
	public List<Employee> getEmployees(){
		return service.getAllEmployees();
	}
	@GetMapping("/{eid}")
	public ResponseEntity<Employee> getEmployee(@PathVariable int eid){
		Employee e=service.getEmployee(eid);
		if(e!=null)
			return new ResponseEntity<Employee>(e, HttpStatus.ACCEPTED);
		else
			return new ResponseEntity("Employee Not Available", HttpStatus.NOT_FOUND);
	}
}
