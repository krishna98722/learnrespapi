package assignment1.classdiagram01;

public class ReverseArray {

	public static void main(String[] args) {
	String s1= "java progrmming";
	String[] s2= s1.split(" ");
			
	String s3 = " ";
	String s4 = "  ";
	for(int i=0;i<s2.length;i++) {
		s3 =s4+s2[i]+s3;
		}
	System.out.print(s3);
	}
	}


