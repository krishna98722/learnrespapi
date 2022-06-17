package com.te.learnjava8.basic;

public class StaticInitialzerSeqvence {

	public StaticInitialzerSeqvence() {
		//1. Non-static members of the class gets loaded!
		//2. non-static initialer get executed from top to bottom
		//3. Programmer written instructions gets executed
		System.out.println("  Constructer Of this class executed !");
	}
	public StaticInitialzerSeqvence(int a) {
		this();
		//3. Programmer written instructions gets executed
		System.out.println("  Constructer Of this class executed !");
	}

	static int a = 10;
	int b;
	{
		b = 20;
		System.out.println("non-static multi line initializer!" + this.b);
	}

	static int c = 31;
	static int d;
	static {
		d = 41;
		System.out.println("static Multi -line initilazer" + StaticInitialzerSeqvence.e);
	}
	static int e = 51;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main method executed!");

		System.out.println("using static variable in main().." + StaticInitialzerSeqvence.a);
		StaticInitialzerSeqvence class1 = new StaticInitialzerSeqvence();
		System.out.println("Using No Staic variable b in main(..)" + class1.b);

	}

	static {
		d = 41;
		System.out.println("static Multi -line initilazer" + StaticInitialzerSeqvence.e);
	}

}
