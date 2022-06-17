package com.te.jacksonapi;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.te.jacksonapi.beans.Employee;

public class Unmarshalling {

	public static void main(String[] args) {
		String jsonCode = "{\r\n" + "  \"employeeId\" : 21,\r\n" + "  \"employeeName\" : \"Name 001\",\r\n"
				+ "  \"employeeAge\" : 76,\r\n" + "  \"address\" : {\r\n" + "    \"addressLine01\" : \"Line 01\",\r\n"
				+ "    \"addressLine02\" : \"Line 02\"\r\n" + "  }\r\n" + "}";

		ObjectMapper objectMapper = new ObjectMapper();

		try {
			Employee employee = objectMapper.readValue(jsonCode, Employee.class);
			System.out.println("Java : \n" + employee);
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}

	}

}
