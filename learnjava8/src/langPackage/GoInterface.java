package langPackage;

public interface GoInterface {
	/*
	 * Variables are always final, static, so initialization happens at the time of
	 * class loading
	 */
	public static final Integer a=11;

	/* Abstract method must be overridden in child class */
	public abstract void m3(); // No need to load it because no implementation is there!

	/* static methods are not overridden in child class */
	public static void m1() {
		System.out.println("Go Implementation of m1() Static method here!");
	}
	
	default void m2() {
		System.out.println("implementation of m2() default method is here");
	}
	default void m4() {
		
	}
}
//In java9 there is a feature of private method for breaking the code in sub parts 
//i.e for better understanding of code