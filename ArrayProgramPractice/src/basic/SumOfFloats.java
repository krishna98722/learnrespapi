package basic;

public class SumOfFloats {

	public static void main(String[] args) {
   //float[] fl= {44.4f, 555.3f, 112.2f, 21.3f}; 
   int[] inr={98, 23, 67, 45, 54, 77};
   System.out.println(inr.length);
   System.out.println("*****************");
   for(int i=0;i<inr.length;i++) {
	   System.out.println(inr[i]);
   }
   System.out.println("===================");
   // print array in reverse order
   for(int i=inr.length -1;i>=0;i--) {
	   System.out.println(inr[i]);
   }
   //for-each loop is just create new refrence and put previous refrence in front of :
   System.out.println("^^^^^^  ^^^^^^^^^");
   for(int ref : inr) {
	   System.out.println(ref);
   }
//   Quiz :copy all elements of one array into another array
   
    	}
}
