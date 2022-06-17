package collectionApi;

import java.util.ArrayList;
import java.util.Iterator;

public class Gocollection {

	public static void main(String[] args) {
		ArrayList<Teacher> arylist = new ArrayList<>();
		arylist.add(new Teacher("ty001","kkr",0101));
		arylist.add(new Teacher("ty002","bkr",0201));
		arylist.add(new Teacher("ty003","tkr",0301));
		arylist.add(new Teacher("ty004","wkr",0401));
		//1. Just print the ArrayList Object
		System.out.println(arylist);
		System.out.println();
		
		//2. for each loop
for (Teacher teacher : arylist) {
	System.out.println(teacher);
	}
System.out.println();


//3. Iterator!
Iterator<Teacher> iterator=arylist.listIterator();
while(iterator.hasNext()) {
	Teacher teacher=iterator.next();
	System.out.println(teacher );
	teacher=iterator.next();
	System.out.println(teacher);
}
System.out.println();

//4. ListIterator
//ListIterator<> listIteraor=arylist.listIterator();
	
	}
}
