package collectionApi;
import java.util.ArrayList;

class AddElementArrayList {


	public static void main(String[] args)
	{
		
		ArrayList<String> list = new ArrayList<>();

		list.add("A");
		list.add("B");
		list.add("C");
		// gets added to the 1st position
		list.add(1, "D");

		//gets added to the 2nd(position)
		list.add(2, "E");

		// Displaying elements in ArrayList
		System.out.println(list);
	}
}
