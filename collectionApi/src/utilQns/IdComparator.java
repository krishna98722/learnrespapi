package utilQns;

import java.util.Comparator;

public class IdComparator implements Comparator<Manager>{

	@Override
	public int compare(Manager o1, Manager o2) {
		return o1.getName().compareTo(o2.getName());
	}

}
