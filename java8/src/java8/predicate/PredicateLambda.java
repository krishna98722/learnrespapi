package java8.predicate;

import java.util.function.Predicate;

public class PredicateLambda {
	public static void main(String[] args) {
//1.
		Predicate<Student> predicateOnAge = s -> {
			return s.getStudentAge() <= 20;
		};
		System.out.println("is student less than 20!" + predicateOnAge.test(new Student("plp", 11, "pole")));
// 2.
		Predicate<Student> predicateOnAge2 = s -> s.getStudentAge() <= 20;

		System.out.println("is student less than 20!" + predicateOnAge2.test(new Student("plp", 11, "pole")));
//3. 
		Predicate<Student> predicateOnAge3 = s -> s.getStudentAge() <= 20;

//4. 
		Predicate<Student> predicateOnAge4 = new Predicate<Student>() {
			@Override
			public boolean test(Student t) {
				return t.getStudentAge() <= 20;
			}
		};
		
		System.out.println(predicateOnAge2.test(new Student("plp", 11, "popole")));
		System.out.println(predicateOnAge3.test(new Student("plp", 11, "popole")));
		System.out.println(predicateOnAge4.test(new Student("plp", 11, "popole")));

	}

}