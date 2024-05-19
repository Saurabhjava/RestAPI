package com.saurabh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.saurabh.model.Employee;
import com.saurabh.repository.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository repo;
	public List<Employee> getAllEmployees(){
		return repo.getAll();
	}
	public Employee getEmployee(int empid){
		return repo.getOne(empid);
	}
}
