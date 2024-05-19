package com.saurabh.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import com.saurabh.model.Employee;

@Repository
public class EmployeeRepository {
	private List<Employee> employees;
	
	public EmployeeRepository() {
		employees=new ArrayList<Employee>();
		employees.add(new Employee(1001, "Mark", "mark@gmail.com"));
		employees.add(new Employee(1002, "Mark1", "mark1@gmail.com"));
		employees.add(new Employee(1003, "Mark2", "mark2@gmail.com"));
		employees.add(new Employee(1004, "Mark3", "mark3@gmail.com"));
	}
	public List<Employee> getAll(){
		return employees;
	}
	public Employee getOne(int empid) {
		Optional<Employee> op=employees.stream().filter(e->e.getEmpid()==empid).findFirst();
		if(op.isPresent())
			return op.get();
		else
			return null;
	}
}
