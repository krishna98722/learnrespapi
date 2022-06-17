package com.te.learnjava8.basic;

public class LargestfiveNumber {

	public static void main(String[] args) {
		int a=10, b=20, c=6, d=22, e=44;
		int res= (a>b && a>c && a>d && a>e)
				?a:(b>c && b>d && b>e)
						?b:(c>d && c>e)
								?c:(d>e )? d:e;
		System.out.println(res);
									

	}
	
	public void sum() {
		
		return ; //it is just transferring control to caller method
	}

}
