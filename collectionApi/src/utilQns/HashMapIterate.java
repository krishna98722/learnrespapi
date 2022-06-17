package utilQns;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class HashMapIterate {
	public static void main(String[] args) {
		Map<Integer, String> maps = new HashMap<Integer, String>();
		maps.put(9, "zero");
		maps.put(7, "sero");
		maps.put(2, "aero");
		maps.put(8, "bero");
		System.out.println(maps);
		for (Map.Entry<Integer, String> str : maps.entrySet()) {
			Integer key = str.getKey();
			String value = str.getValue();
			System.out.println("key : " + key + ",= Value :" + value);
		
			// Comparator<String>comparatorOnValue = (s1,s2)-> s1.hashCode()-s2.hashCode();
//
//			Map<String, String> tremaps=new TreeMap<String, String>();
//		System.out.println(tremaps);
		}
	}
}
