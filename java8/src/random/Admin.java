package random;

public class Admin implements User {
	public String adminName;
	public int adminId;

	@Override
	public void getUserName() {
		System.out.println(adminName);
	}

	@Override
	public void getPassword() {
		System.out.println(adminId);
	}

}
