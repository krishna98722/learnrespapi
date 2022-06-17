package defaultMethod;

public class Implementation implements Left,Right {

	@Override
	public void m1() {
		System.out.println("impl.. ");
	}

	@Override
	public void m3() {
		Left.super.m3();
		System.out.println("default ka impl..");
	}

}
