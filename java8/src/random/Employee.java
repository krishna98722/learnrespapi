package random;

public class Employee implements User {
public String employeeName;
public int employeeId;

	
	public void getUserName() {
System.out.println(employeeName);	
	}

	public void getPassword() {
System.out.println(employeeId);		
	}

}
