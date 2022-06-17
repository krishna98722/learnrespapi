package com.te.learnjava8.basic;

public class SimpleClass {
 public  SimpleClass() {
	System.out.println("Constructer of simple class is here!");
}
 int a=11;   //non-static single line initializer
 int b;
 {
	 b=21;
	 System.out.println("non static multi-line initializer");
 }
 static int c=31;
 static int d;  //static single line initializer
 static{
	 d=41;
	 System.out.println("static multi-line initializer");
 }
 public void m1() {
	System.out.println("non static ");
}
public static void m2() {
	System.out.println("static method called!");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("main method execution");
SimpleClass class1=new SimpleClass();
	}
	

}
