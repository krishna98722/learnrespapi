package java8.predicate;

import java.util.ArrayList;

public class Consumer {

	public static void main(String[] args) {

		ArrayList<Student> students = new ArrayList<>();
		students.add(new Student("10aa", 44, "aa"));
		students.add(new Student("20ba", 44, "aa"));
		students.add(new Student("30ca", 44, "aa"));
		
	//	Consumer<Student> consumer1= s -> System.out.println(s);
	//	students.stream().forEach(consumer1);

	}

		
}
