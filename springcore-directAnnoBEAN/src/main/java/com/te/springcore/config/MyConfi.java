package com.te.springcore.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.te.springcorea.beans.Address;
import com.te.springcorea.beans.Employee;

@Configuration
@ComponentScan(basePackages = "com.te.springcorea.beans")
public class MyConfi {

	public Employee getEmployeeObj() {
		Employee employee = new Employee();
		employee.getAddress();
		employee.getEmployeeAge();
		employee.getEmployeeId();
		employee.getEmployeeName();
		return employee;
	}

	public Address getAddress() {
		Address address = new Address();
		address.setAddress1("line 1");
		address.setAddress2("line 2");

		return address;
	}

}
