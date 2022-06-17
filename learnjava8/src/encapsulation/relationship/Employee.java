package encapsulation.relationship;

import java.time.LocalDate;

public class Employee {

	private String EmployeeId;
	private String EmployeeName;
	private long EmployeeAge;
	private long phone;
	// early instantiation
	private Batch batch = new Batch("moo1", LocalDate.MIN, LocalDate.MAX);

	public Employee() {
		super();
	}

	public Employee(String employeeId, String employeeName, long employeeAge, long phone) {
		super();
		this.EmployeeId = employeeId;
		this.EmployeeName = employeeName;
		this.EmployeeAge = employeeAge;
		this.phone = phone;
	}

	public String getEmployeeId() {
		return EmployeeId;
	}

	public void setEmployeeId(String employeeId) {
		EmployeeId = employeeId;
	}

	public String getEmployeeName() {
		return EmployeeName;
	}

	public void setEmployeeName(String employeeName) {
		EmployeeName = employeeName;
	}

	public long getEmployeeAge() {
		return EmployeeAge;
	}

	public void setEmployeeAge(long employeeAge) {
		if (employeeAge <= 0) {
			System.out.println("Age is not Correct !");
		} else {
			this.EmployeeAge = employeeAge;

		}

	}

	@Override
	public String toString() {
		return "Employee [EmployeeId=" + EmployeeId + ", EmployeeName=" + EmployeeName + ", EmployeeAge=" + EmployeeAge
				+ ", phone=" + phone + ", batch=" + batch + "]";
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public Batch getBatch() {
		return batch;
	}

}
