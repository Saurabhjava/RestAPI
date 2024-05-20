package com.saurabh;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.saurabh.model.Employee;
import com.saurabh.service.EmployeeService;

@SpringBootTest
class EmployeeRestApplicationTests {
	@Autowired
	private EmployeeService eService;
	@Test
	void contextLoads() {
		Employee emp=eService.getEmployee(1002);
		assertEquals("Chirag", emp.getName());
	}

}
