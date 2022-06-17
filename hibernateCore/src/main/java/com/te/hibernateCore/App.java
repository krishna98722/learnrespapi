package com.te.hibernateCore;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import com.te.hibernateCore.entity.Employee;
import com.te.hibernateCore.repositoryDAO.MyRepository;

public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		MyRepository myRepository = new MyRepository();
		Employee employee = new Employee();
		employee.setEmployeeName("Name022");
		employee.setEmployeeAge(21);

		// 1. save employee
		myRepository.saveEmployee(employee);
		// 2. Read Employee
		Employee employeeByFind = myRepository.getEmployeeByFind(1);
		System.out.println("Using find() Method : " + employeeByFind);
		System.out.println("=============");
		Employee employeeRefrence = myRepository.getEmployeeByRefrence(1);
		System.out.println("Using Refrence90 Method : " + employeeRefrence);
		// 3. UPDATE EMPLOYEE !
//		Employee employee2=new Employee();
//		employee2.setEmployeeName("new Name");
//		employee2.setEmployeeAge(33);
//
//		Employee updatedEmployee= myRepository.updateEmployee(1, employee2);
//		System.out.println("updated : "+updatedEmployee);
		
		//4.Delete Employee!
		boolean deleteEmployee=myRepository.deleteEmployee(1);
		System.out.println("is deleted : "+deleteEmployee);
	}
}
