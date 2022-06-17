package assignment1.classdiagram01;

public class Employee extends Person{
private int salary;

public Employee(String personName, int salary) {
	super(personName);
	this.salary = salary;
}

@Override
public String toString() {
	return "Employee [salary=" + salary + "]";
}

public int getSalary() {
	return salary;
}



}
