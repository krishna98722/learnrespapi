package applicationDP;

import java.util.Scanner;

public class Controller {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter service name :");
		String vars = sc.next();
		ServiceFactory cons = new ServiceFactory();
		ApplicationService apls = cons.getService(vars);
		apls.service1();
		apls.service2();

	}

}
