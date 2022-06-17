package com.te.exception;

public class ThreadLambda implements Runnable{

	public static void main(String[] args) {
ThreadLambda threadlambda=new ThreadLambda();
Thread thread= -> System.out.println(thread);

	}

	@Override
	public void run() {
for(int i=0;i<10;i++) {
	System.out.println("values are :"+i);
	Thread
}		
	}

}
