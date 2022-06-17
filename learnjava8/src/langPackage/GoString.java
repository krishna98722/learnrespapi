package langPackage;

public class GoString {
	/*
	 * String str1 ="Hello"; => This line is created an object in String Constant
	 * Pool, because we are making use of String Literal.
	 * 
	 * String str2=new String("Hello"); => This line will create a new object in
	 * heap area because we are making use of new keyword. And to create the new
	 * Object we are using String literal "Hello", and so a new memory block will
	 * not be created in String constant Pool, instead same memory block will be
	 * reused.
	 * 
	 * str1.toLowerCase and str2.toUpperCase(); => Both the above statements will
	 * create a new Objects with all lower case characters and with all Upper case
	 * characters.
	 */
	
public static void main(String[] args) {
	String str1="Hello";
	String str2=new String("Hello");
	str1.toLowerCase();
	str2.toUpperCase();
	System.out.println(str1);
	System.out.println(str2);
}
}
