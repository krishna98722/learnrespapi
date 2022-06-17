package java8.predicate;

import java.util.function.Predicate;

public class PredicateLengthFind {

	public static void main(String[] args) {
		Predicate<Student> predicateLength = s -> {
			if (s.getStudentName().length() >= 5) {
				return true;
			}
			return false;
		};
		System.out.println(predicateLength.test(new Student("plp", 11, "pole")));

	}
}