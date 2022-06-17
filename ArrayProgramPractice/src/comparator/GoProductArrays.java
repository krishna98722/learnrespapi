package comparator;

import java.util.Scanner;

public class GoProductArrays {

	public static void main(String[] args) {
		Product[] products = { new Product(1, "product001", 23.32, 5), new Product(2, "product002", 53.32, 2),
				new Product(3, "product003", 13.32, 8), new Product(4, "product004", 73.32, 6),
				new Product(5, "product005", 63.32, 7) };

		Scanner scanner = new Scanner(System.in);
		System.out.println("Eneter an integer");
		int sortOn = scanner.nextInt();
		//Comparator<Product> comparatorproductId

	}

}
