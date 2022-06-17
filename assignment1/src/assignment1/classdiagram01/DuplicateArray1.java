package assignment1.classdiagram01;

public class DuplicateArray1 {

	public static void main(String[] args) {
		
		String[] arr = { "pad", "haroe", "haro", "desh", "me", "pad" };
		boolean flag=false;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.println("Dulicate element  is :" + arr[i]);
				flag=true;
				}
			}
		}
		if(flag==false) {
			System.out.println("Duplicate Not found");
		}
	}

}
