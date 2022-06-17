package encapsulation.relationship;

public class EncapTest {

	public static void main(String[] args) {
		Employee emp=new Employee();
		emp.setEmployeeId("TY001");
		emp.setEmployeeAge(22);
		emp.setPhone(592922);
		
		emp.getBatch().createMentorObject();
		System.out.println(emp);
		

	}

}
