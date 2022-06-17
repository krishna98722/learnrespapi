package utilQns;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class KeyHm {
	public static void main(String[] args) {
		Map<Integer, String> hmap = new HashMap<Integer, String>();
		hmap.put(5, "kk");
		hmap.put(11, "C");
		hmap.put(4, "Z");
		hmap.put(66, "Q");
		hmap.put(0, "R");
		System.out.println("Before Sorting");
		System.out.print(hmap);
		for (Map.Entry<Integer, String> itr : hmap.entrySet()) {
			Integer key = itr.getKey();
			String value = itr.getValue();
			System.out.println(key + " " + value);
		}
		Map<Integer, String> mtr = new TreeMap<Integer, String>(hmap);
		System.out.println("sorted value : ");
		for (Map.Entry<Integer, String> titr : mtr.entrySet()) {
			Integer key = titr.getKey();
			String value = titr.getValue();
			System.out.println(key + " " + value);
		}
	}

}
