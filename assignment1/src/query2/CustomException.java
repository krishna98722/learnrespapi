package query2;

public class CustomException {

	public static void main(String[] args) {
		int age = 11;
		if (age > 18) {
			System.out.println("You are eligible for vote");
		} else {
			throw new AgeNotFoundException("your agr is not valid");
		}
	}

}
