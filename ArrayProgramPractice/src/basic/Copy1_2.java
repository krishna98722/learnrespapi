package basic;

public class Copy1_2 {

	public static void main(String[] args) {
		int[] ary1 = { 22, 44, 55, 66, 11, 001 };
		//create array of another array size
		int[] ary2 = new int[ary1.length]; 
		
		// copying one array elements to another
		for(int i=0;i<ary1.length;i++) {
              ary2[i]=ary1[i];
		}
		//Display elements of ary1 
		for(int i=0;i<ary1.length;i++) {
			System.out.println(ary1[i]);
		}
		System.out.println("~~~~~~~~~  ~~~~~~~~");
		// Display elements of a new array
		for(int i=0;i<ary2.length;i++) {
			System.out.println(ary2[i]);
		}
	}

}
