package com.te.springcorea.beans;

import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
@EqualsAndHashCode
public class Employee {
	private String employeeName;
	private Integer employeeId;
	private int employeeAge;
	private Set<String> employeeCollegues;
	private Map<String, Integer> subjectRating;
	
	@Autowired
	@Qualifier("address22")
	private Address address;

	
}
