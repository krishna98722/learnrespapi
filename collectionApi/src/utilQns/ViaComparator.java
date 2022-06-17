package utilQns;

import java.util.ArrayList;
import java.util.Collections;

public class ViaComparator {

	public static void main(String[] args) {
		ArrayList<Manager> als = new ArrayList<Manager>();
		als.add(new Manager("te059", "shree", 202020.22));
		als.add(new Manager("te045", "ashree", 20.22));
		als.add(new Manager("te091", "pahree", 12020.22));
		Collections.sort(als, new IdComparator());
		System.out.println(als);
		Collections.sort(als, new Salary());
		System.out.println(als);
	}

}
