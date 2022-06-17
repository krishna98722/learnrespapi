package java8.predicate;

import java.util.function.Predicate;


public class Predicate1 {

	public static boolean isEvent(int value) {
		return value % 2 == 0;
	}
	public static void main(String[] args) {
Predicate<Integer> predicate=i ->{ return i%2== 0;
};
System.out.println(predicate.test(10));	
System.out.println(predicate.test(11));
	}

}
