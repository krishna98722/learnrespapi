package com.te.hibernateCore;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.te.hibernateCore.entity.Address;
import com.te.hibernateCore.entity.Employee;
import com.te.hibernateCore.entity.MaritialStatus;
import com.te.hibernateCore.entity.ScondaryInfo;

public class App {
	public static void main(String[] args) {
		EntityTransaction transaction = null;
		Employee employee = new Employee();
		employee.setEmployeeName("Krishna");
		employee.setEmployeeAge(23);

		// permanent address
		Address address = new Address();
		address.setAddressType("Permanent");
		address.setDoorNo("123/A");
		address.setLocality("Banshankhari");
		address.setPincode(560085);
		address.setStreet("14th main");

		// temporary address
		Address address1 = new Address();
		address1.setAddressType("Temporary");
		address1.setDoorNo("455/A");
		address1.setLocality("sector 16");
		address1.setPincode(560050);
		address1.setStreet("4th cross");
		
		ScondaryInfo scondaryInfo= new ScondaryInfo();
		scondaryInfo.setMaritalStatus(MaritialStatus.Married);

		List<Address> addresses = new ArrayList<Address>();
		addresses.add(address);
		addresses.add(address1);
		
		employee.setAddress(addresses);

		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pu");
			EntityManager manager = entityManagerFactory.createEntityManager();
			transaction = manager.getTransaction();
			transaction.begin();
			manager.persist(employee);
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
		}
	}
}
