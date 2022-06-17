package collectionApi;

import java.util.HashMap;
import java.util.Map;

public class HashMapEnum {
	public static void main(String[] args) {

		HashMap<Student, Percentage> hashmap = new HashMap<>();
		hashmap.put(new Student("kkr", "Ty0111", 89,Standard.fIfth), new Percentage("popop", "99"));
		hashmap.put(new Student("pkr", "Ty0211", 99,Standard.fIfth), new Percentage("sopop", "29"));
		hashmap.put(new Student("ckr", "Ty0311", 79,Standard.fIfth), new Percentage("topop", "39"));
		hashmap.put(new Student("tkr", "Ty0411", 69,Standard.fIfth), new Percentage("lopop", "69"));
		hashmap.put(new Student("gkr", "Ty0511", 59,Standard.fIfth), new Percentage("jopop", "79"));
		System.out.print(hashmap);

//Iterating map using for each loop
		for (Map.Entry entry : hashmap.entrySet()) {
			entry.getKey();
			System.out.println(entry);
		}

	}

}
