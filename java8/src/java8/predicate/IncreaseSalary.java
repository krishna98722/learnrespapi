package java8.predicate;

import java.util.HashSet;

public class IncreaseSalary {

	public static void main(String[] args) {
		HashSet<Employee> employees11 = new HashSet<>();
		employees11.add(new Employee("te11", "asa", 22.22));
		employees11.add(new Employee("te21", "bsa", 42.22));
		employees11.add(new Employee("te31", "csa", 62.22));
     
		employees11.stream().forEach(e -> e.setEmployeeSalary(e.getEmployeeSalary() * 1.25));

	//	Consumer<Employee> consumer = e ->{ e.setEmployeeSalary(e.getEmployeeSalary() * 1.25);
	
		//List<Employee> collect2 = employees.stream().filter(e -> e.get)
			
		};
	}


