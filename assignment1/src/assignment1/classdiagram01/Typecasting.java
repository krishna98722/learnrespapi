package assignment1.classdiagram01;

public class Typecasting {

	public static void main(String[] args) {
        Parent p=new Child();
	//System.out.println(p);
	p.m1();
	Child ch=(Child)new Parent();
	ch.m2();
	ch.m1();
	}

}
