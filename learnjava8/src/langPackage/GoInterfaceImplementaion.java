package langPackage;

public class GoInterfaceImplementaion implements GoInterface{

	@Override
	public void m3() {
System.out.println("impl of m3() in ");		
	}
	
	public void m4() {
System.out.println("default impl in new class is optional");
}

/* overriding a default method is Optional */
	public void m2() {
		System.out.println("implementation of m2() default method is here");
	}
}