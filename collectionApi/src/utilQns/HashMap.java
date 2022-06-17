package utilQns;

import java.util.*;

public class HashMap {
	static Map<String, String> map = new java.util.HashMap<String, String>();

	public static void sortByKey() {
		TreeMap<String, String> sorted = new TreeMap<String, String>();
		sorted.putAll(map);
		for (Map.Entry<String, String> entry : sorted.entrySet()) {
			System.out.println("keys : " + entry.getKey() + ", Value : " + entry.getValue());
		}
	}

	public static void main(String[] args) {
		map.put("te01", "krishna");
		map.put("te02", "kant");
		map.put("te03", "rawat");
		sortByKey();
		//System.out.println(map.isEmpty());
		

	}

}
