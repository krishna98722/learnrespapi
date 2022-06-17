package langPackage;

public class Employee {
	private int EmployeeId;
	private String EmployeeName;
	private Integer Age;
	// No-args constructor is for initializing all non static members at class loading time
		public Employee() {
			super();
		}
	

		// Argumented constructor for initializing class level non static variables,method
		public Employee(int employeeId, String employeeName, Integer age) {
			super();
			EmployeeId = employeeId;
			EmployeeName = employeeName;
			Age = age;
		}
		
	//To provide indirect access to user via these methods i.e acheving data hiding
	public int getEmployeeId() {
		return EmployeeId;
	}
	public void setEmployeeId(int employeeId) {
		EmployeeId = employeeId;
	}
	public String getEmployeeName() {
		return EmployeeName;
	}
	public void setEmployeeName(String employeeName) {
		EmployeeName = employeeName;
	}
	public Integer getAge() {
		return Age;
	}
	public void setAge(Integer age) {
		Age = age;
	}
	
	@Override  // To provide own implementation
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Age == null) ? 0 : Age.hashCode());
		result = prime * result + EmployeeId;
		result = prime * result + ((EmployeeName == null) ? 0 : EmployeeName.hashCode());
		return result;
	}
	@Override  // To compare the properties of an Object
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (Age == null) {
			if (other.Age != null)
				return false;
		} else if (!Age.equals(other.Age))
			return false;
		if (EmployeeId != other.EmployeeId)
			return false;
		if (EmployeeName == null) {
			if (other.EmployeeName != null)
				return false;
		} else if (!EmployeeName.equals(other.EmployeeName))
			return false;
		return true;
	}
	@Override  // to print the content or state of an Object
	public String toString() {
		return "Employee [EmployeeId=" + EmployeeId + ", EmployeeName=" + EmployeeName + ", Age=" + Age + "]";
	}
}
