package basic;

import java.util.ArrayList;
import java.util.Collections;

public class AlSort {

	public static void main(String[] args) {
ArrayList<Krishna> arl=new ArrayList<Krishna>();
arl.add(new Krishna(91,"ty",51));
arl.add(new Krishna(31,"py",01));
arl.add(new Krishna(61,"ky",71));
arl.add(new Krishna(21,"qy",21));

  System.out.println(arl); 
 Collections.sort(arl); 
 System.out.print(arl);
 for (Krishna krishna1 : arl) {
	System.out.println(krishna1);
}
 
 



	}
}
