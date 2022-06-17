package inheritece.ref;

class SomeClass {
	private int a;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public SomeClass() {
		super();
		this.a = a;
	}
}

public class RefrenceDemo {
	public static void main(String[] args) {
		SomeClass someclass = new SomeClass();
		someclass.setA(111);
		SomeClass ssmm2 = someclass;
		ssmm2.setA(222);
		SomeClass ssmm3 = someclass;
		ssmm2.setA(444);
		System.out.println(someclass.getA());

	}
}
