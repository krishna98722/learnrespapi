package com.te.learnspringrest.repository;

import com.te.learnspringrest.entity.Employee;

public interface AppRepository {
	Employee getEmployee(int employeeId);
	Employee saveEmployee(Employee employeeId);
	boolean deleteEmployee(int employeeId);
}
