package inheritece;

 class A{
	public void m1() {
		System.out.println("A  class M1 method");
	}
	public static void m2() {
		System.out.println("A class M2 method");
	}
	}
class B extends A{
	
	public void m1() {
		System.out.println("B class M1 method");
	}
	public static void m2() {
		System.out.println(" it is a B class M2 method");
	}	
}
class Methodhiding{
	public static void main(String[] args) {
		B b=new B();
		//b.m2();
		b.m1();
	}
	
}