package utilQns;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class InitializeAl {
	public static void main(String[] args) {
		ArrayList<String> arrylist = new ArrayList<String>();
		arrylist.add("jvm");
		arrylist.add("ons");
		arrylist.add("jai ho");
		System.out.println(arrylist.size());

		// convert Array To List
		String[] array1 = { "aa", "bb", "cc", "dd" };
		System.out.println("print the Array :" + Arrays.toString(array1));
		List<String> list = ArrayToListConversion(array1);
		System.out.println(list);
	}

	static List<String> ArrayToListConversion(String[] array1) {
		List<String> list = new ArrayList<>();
		Collections.addAll(list, array1);
		return list;
	}
}
