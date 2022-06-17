package utilQns;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class HmSortValue {

	static Map<String, String> maps = new HashMap<String, String>();

	public static void main(String[] args) {

		maps.put("41", "mangli");
		maps.put("21", "bangli");
		maps.put("99", "langli");
		maps.put("1", "zangli");
		System.out.println(maps);
		sortByValue();
	}

	private static void sortByValue() {
		TreeMap<String, String> tms = new TreeMap<String, String>();
		tms.putAll(maps);
	
	for (Map.Entry<String, String> iterable_element : tms.entrySet()) {
		System.out.println(iterable_element.getKey()+", : "+iterable_element.getValue());
	}
	
	
	
	
	
	}

}
