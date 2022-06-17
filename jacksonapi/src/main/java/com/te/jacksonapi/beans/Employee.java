package com.te.jacksonapi.beans;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@XmlRootElement
public class Employee {
	private int employeeId;
	private String employeeName;
	private int employeeAge;

	public int getEmployeeId() {
		return employeeId;
	}

	@XmlAttribute(name="emp_id")
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	@XmlElement(name = "employee_name")
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public int getEmployeeAge() {
		return employeeAge;
	}

	@XmlElement(name = "employee_age")
	public void setEmployeeAge(int employeeAge) {
		this.employeeAge = employeeAge;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	private Address address;
}
