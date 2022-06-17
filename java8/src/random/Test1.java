package random;

import java.util.Scanner;

import applicationDP.ServiceFactory;

public class Test1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("pls Enter for verification");
		String vars = sc.next();

		
		UserFactory sf = new UserFactory();
		User obj = sf.getUserFactory(vars);
		obj.getPassword();
        obj.getUserName();
	}

}
