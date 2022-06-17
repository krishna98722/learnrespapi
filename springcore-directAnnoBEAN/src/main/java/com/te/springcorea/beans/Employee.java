package com.te.springcorea.beans;
import java.util.Map;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
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
@Component
public class Employee {
	@Value("jelly")
	private String employeeName;
	@Value("11")
	private Integer employeeId;
	@Value("31")
	private int employeeAge;
	
	
	@Autowired
	
	private Address address;

	
}
