package com.te.jacksonapi;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.te.jacksonapi.beans.Address;
import com.te.jacksonapi.beans.Employee;

public class Marshalling {

	public static void main(String[] args) {
		System.out.println("Hello Json");
		Employee employee = new Employee();
		employee.setEmployeeId(21);
		employee.setEmployeeName("Name 001");
		employee.setEmployeeAge(76);

		Address address = new Address();
		address.setAddressLine01("Line 01");
		address.setAddressLine02("Line 02");
		employee.setAddress(address);

		ObjectMapper objectMapper = new ObjectMapper();

		try {
			String json = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(employee);
			System.out.println("JSON: \n" + json);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
