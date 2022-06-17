package collectionApi;

import java.util.HashSet;

public class StringDuplicateRemoval {

	public static void main(String[] args) {
		String str = " hi, this sring has  duplicate characters";

		HashSet<Character> input = new HashSet();
		for (int i = 0; i < str.length(); i++) {
			input.add(str.charAt(i));
		}
		
		for (Character character : input) {
			System.out.print(character);
		}
	}

}
