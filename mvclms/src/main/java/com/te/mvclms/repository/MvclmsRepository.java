package com.te.mvclms.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.stereotype.Repository;

import com.te.mvclms.entity.Employee;

@Repository
public class MvclmsRepository {
	private static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pu");
	private static EntityManager entityManager = entityManagerFactory.createEntityManager();

	public Employee register(Employee employee) {
		/* Logic to Save Data in database */
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(employee);
		entityTransaction.commit();
		return employee;
	}

	public  Employee findByEmployeeId(int employeeId) {
		/* Logic to get employee data from database */
		return entityManager.find(Employee.class, employeeId);

	}
}
