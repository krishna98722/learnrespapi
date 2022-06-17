package defaultMethod;

public interface Right {
	public static final Integer a=11;

	public abstract void m1();
	// for utility purpose only 
	public static void m2() {
		System.out.println("Right m2() static method");
	}
	//give optional add features either implemented or not 
	default void m3() {
		System.out.println("Right m3()  default implementation");
	}
}
