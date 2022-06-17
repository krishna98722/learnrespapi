package assignment1.classdiagram01;

public class SumArray {

	public static void main(String[] args) {
		int[] arr = { 55, 44, 66, 55 };
		int sum = 0;
        for (int i = 0; i < arr.length; i++) {
			sum=sum+arr[i];
		}
        System.out.println(sum);
	}

}
