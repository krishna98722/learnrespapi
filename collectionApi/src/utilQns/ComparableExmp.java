package utilQns;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableExmp {
	public static void main(String[] args) {
		ArrayList<Trainee> als = new ArrayList<>();
		als.add(new Trainee(81, "shiva", 10000.22));
		als.add(new Trainee(41, "ram", 990000.22));
		als.add(new Trainee(91, "sita", 82900.22));
		als.add(new Trainee(21, "hanuman", 29800.22));
		System.out.println(als);
		Collections.sort(als);
		System.out.println(als);
	}
}
