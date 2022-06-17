package com.te.springcorea.beans;

import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode

public class Employee  {
	private String employeeName;
	private Integer employeeId;
	private int employeeAge;
	private Set<String> employeeCollegues;
	private Map<String, Integer> subjectRating;
	
	
	private Address address;
	@Autowired
	private Car car;

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	public void setEmployeeAge(int employeeAge) {
		this.employeeAge = employeeAge;
	}

	public void setEmployeeCollegues(Set<String> employeeCollegues) {
		this.employeeCollegues = employeeCollegues;
	}

	public void setSubjectRating(Map<String, Integer> subjectRating) {
		this.subjectRating = subjectRating;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	
}
