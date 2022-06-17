package collectionAssifnment;

import java.util.Scanner;

public class CustomException {

	public static void main(String[] args) throws IllegalAgeException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your Response Here");
		int a = scanner.nextInt();

		if (a<18) {
			throw new IllegalAgeException(" invalid age found !");
		} else {
		System.out.println("your welcomebro:->");
		
		}

	}

}
