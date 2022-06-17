package random;

public class UserFactory {

	public User getUserFactory(String verify) {
		if(verify.equalsIgnoreCase("Admin")) {
			return new Admin();
		}
		if(verify.equalsIgnoreCase("Employee")) {
			return new Employee();
		}
		if(verify.equalsIgnoreCase("Mentor")) {
			return new Mentor();
		}
		return null;
	}

}
