package utilQns;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class SortHashmapByKey {

	public static void main(String[] args) {
		Map<String, Integer> hmap=new HashMap<>();
		hmap.put("zap", 21);
		hmap.put("rap", 41);
		hmap.put("aap", 51);
		hmap.put("dap", 11);
		for(Map.Entry<String, Integer> entry:hmap.entrySet()) {
			System.out.println("usorted values are : "+entry.getKey());
			//System.out.println("vales aa : "+entry.getValue());
		}
		Map<String, Integer> tremap=new TreeMap<>(hmap);
		for(Map.Entry<String, Integer> entry1:tremap.entrySet()) {
			System.out.println("Sorted values are : "+entry1.getKey());
			//System.out.println("vales aa : "+entry.getValue());
		}
	}

}
