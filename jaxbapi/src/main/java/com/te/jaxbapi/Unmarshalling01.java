package com.te.jaxbapi;

import java.io.StringReader;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import com.te.jacksonapi.beans.Employee;

public class Unmarshalling01 {
	public static void main(String[] args) {
		String xmlCode = "<employee>\r\n" + "    <address>\r\n" + "        <addressLine01>Line 01</addressLine01>\r\n"
				+ "        <addressLine02>Line 02</addressLine02>\r\n"
				+ "        <addressLine03>Line 03</addressLine03>\r\n" + "    </address>\r\n"
				+ "    <employee_age>21</employee_age>\r\n" + "    <employee_id>11</employee_id>\r\n"
				+ "    <employee_name>Shambhu</employee_name>\r\n" + "</employee>\r\n" + "\r\n" + "";
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(Employee.class);
			Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
			StringReader reader = new StringReader(xmlCode);
			Employee employee = (Employee) unmarshaller.unmarshal(reader);
			System.out.println("Java :\n" + employee);
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
