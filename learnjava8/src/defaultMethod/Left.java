package defaultMethod;

public interface Left {
	
	public static final Integer a=11;

	public abstract void m1();
	
	public static void m2() {
		System.out.println("Left m3() static method");
	}
	default void m3() {
		System.out.println("Left m3()  default implementation");
	}
	// ye method area me load ho jayega or isse bs inherit kar saktey hain , 
	//koi reference se call nhi kr saktey
	//>>> iska call krne ka way bilkul different hai InterfaceNAme.super.methodName

}
