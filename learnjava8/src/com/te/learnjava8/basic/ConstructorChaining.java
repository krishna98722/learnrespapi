package com.te.learnjava8.basic;
class Parent{
	int a;
	int b;
	
	Parent(){
		super();
		System.out.println("PArent()  cnstructor called");
	}
	Parent(int a){
		this();
		this.a=a;
		System.out.println("");
	}
	Parent(int a,int b){
		this(a);
		this.b=b;
		System.out.println("");
	}
}

class child extends Parent{
	int c;
	int d;
	child(){
		super(10,20);
		System.out.println(" Child constructor called");
	}
	child(int c){
		this();
		this.c=c;
	System.out.println("...");
	}
	
}
public class ConstructorChaining {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
