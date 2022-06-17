package utilQns;

import java.util.Comparator;

public class Salary implements Comparator<Manager>{

	@Override
	public int compare(Manager o1, Manager o2) {
		return o1.getSalary().compareTo(o2.getSalary());
	}

}
