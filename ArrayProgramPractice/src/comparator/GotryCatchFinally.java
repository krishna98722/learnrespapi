package comparator;

import java.util.Scanner;

public class GotryCatchFinally {

	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.println("If you want to marry, Enter age !");
int age =scanner.nextInt();
if(age >=18) {
	
	System.out.println("ha ! yo allow to marry with some ass");
}else {
	throw new AgeNotAllowedException("bada ho jao thora orr ");
}
	}

}
