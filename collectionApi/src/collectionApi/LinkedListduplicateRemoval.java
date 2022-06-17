package collectionApi;

import java.util.LinkedHashSet;

public class LinkedListduplicateRemoval {

	public static void main(String[] args) {
		String str = " hi, this sring has  duplicate characters";

		LinkedHashSet<Character> input = new LinkedHashSet();
		for (int i = 0; i < str.length(); i++) {
			input.add(str.charAt(i));
		}
		
		
		for (Character character : input) {
			System.out.print(character);
		}
	}

}
