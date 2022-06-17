package com.te.learning_spring_rest.beans;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@AllArgsConstructor
@NoArgsConstructor
@Data
@Setter
@Getter
@ToString
public class Employee {
	private int employeeId;
	private String employeeName;
	private int employeeAge;

}
