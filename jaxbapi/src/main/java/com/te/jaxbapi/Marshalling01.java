package com.te.jaxbapi;

import java.io.StringWriter;

import javax.xml.bind.JAXB;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import com.te.jacksonapi.beans.Address;
import com.te.jacksonapi.beans.Employee;

public class Marshalling01 {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		Employee employee = new Employee();
		employee.setEmployeeId(11);
		employee.setEmployeeName("Shambhu");
		employee.setEmployeeAge(21);
		
		Address address=new Address();
		address.setAddressLine01("Line 01");
		address.setAddressLine02("Line 02");
		address.setAddressLine03("Line 03");
		employee.setAddress(address);
		
	
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(Employee.class);
			Marshaller marshaller = jaxbContext.createMarshaller();
			marshaller.setProperty(marshaller.JAXB_FORMATTED_OUTPUT, true);
			StringWriter handler = new StringWriter();
			marshaller.marshal(employee, handler);
			System.out.println("XML : " + handler);

		} catch (JAXBException e) {
			e.printStackTrace();
		}

	}
}
