package com.te.hibernateCore.repositoryDAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.te.hibernateCore.entity.Employee;

public class MyRepository {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pu");
	EntityManager entityManager = entityManagerFactory.createEntityManager();

	public void saveEmployee(Employee employee) {
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(employee);
		entityTransaction.commit();
	}

	public Employee getEmployeeByFind(int id) {
		return entityManager.getReference(Employee.class, id);
	}

	public Employee getEmployeeByRefrence(int id) {
		return entityManager.getReference(Employee.class, id);
	}

	public Employee updateEmployee(int id, Employee employee) {
		EntityTransaction entityTransaction = entityManager.getTransaction();
		Employee foundEmployee = entityManager.find(Employee.class, id);
		if (foundEmployee != null) {
			foundEmployee.setEmployeeName(employee.getEmployeeName());
			foundEmployee.setEmployeeAge(employee.getEmployeeAge());
			entityTransaction.begin();
			entityManager.persist(foundEmployee);
		}
		return foundEmployee;
	}

	public boolean deleteEmployee(int id) {
		EntityTransaction entityTransaction = entityManager.getTransaction();
		Employee foundEmployee = entityManager.find(Employee.class, id);
		if (foundEmployee != null) {

			entityTransaction.begin();
			entityManager.remove(foundEmployee);
			entityTransaction.commit();
			return true;
		}
		return false;
	}

}
