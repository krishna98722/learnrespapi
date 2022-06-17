package inheritece.ref;

class A{
	
}
class B extends A{
	
}
class C extends B{
	
}
public class GenerateClassCasteException{
public static void main(String[] args) {
	
	A aa = new B();
	C c= (C)aa;
	// B class does not know about c class implementation
}
}
