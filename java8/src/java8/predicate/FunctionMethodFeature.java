package java8.predicate;

import java.util.function.Function;

public class FunctionMethodFeature {

	public static void main(String[] args) {
		Function<Student, Boolean> functionRef = s -> {
			if (s.getStudentAge() < 25)
				return true;

			return false;
		};
		System.out.println("Is Student age less"+functionRef.apply(new Student("funny", 21, "yoyo")));
	}

}
