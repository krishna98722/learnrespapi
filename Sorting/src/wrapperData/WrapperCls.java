package wrapperData;

public class WrapperCls {

	public static void main(String[] args) {
		int a = 10;

//1. Integer.valueOf(int)
		Integer integer = Integer.valueOf(a);
		System.out.println(integer);

//new Integer(int)
		Integer integer2 = new Integer(a);
		System.out.println(integer2);

//3. Integer(String)
		Integer integer3 = Integer.valueOf("1234");
		System.out.println(integer3);

//4. new Integer("123")
		Integer integer4 = new Integer("122345");
		System.out.println(integer4);

		// 5. Integer.parseInt("123")
		Integer integer5 = Integer.parseInt("122");
		System.out.println(integer5);

		// integer5.intValue()
		int intValue = integer5.intValue();
		System.out.println(intValue);
// Auto-Boxing
		Integer integer6 = a;
		System.out.println(integer6);
// Auto-Unboxing 
		int b= integer6;
		System.out.println(b);
		
		// Addition
// Auto-boxing = Auto-Unboxing + Auto-Unboxing
		Integer integer7 = integer3 + integer4;
		System.out.println(integer7);

	}
}
