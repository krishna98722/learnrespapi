package prototypeDP;

public class Custom {

	public static void main(String[] args) {
		Employee str = null;
		Employee emp = new Employee(123, "aaaa", "vellore", 444.444, "kathriguppe");
		try {
			 str = (Employee) emp.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// Object obj=emp.clone();
		 System.out.println(str);
	}
}
