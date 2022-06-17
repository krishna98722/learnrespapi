package assignment1.classdiagram01;

public class Array1 {

	public static void main(String[] args) {
int[] marks= new int[5];
marks[0]=100;
marks[1]=121;
marks[2]=212;
marks[3]=312;
marks[4]=112;
//marks[5]=212;   arrayindexOutOfBound Exception
/*
 * for (int i = 0; i < marks.length; i++) { System.out.print(marks[i]); }
 */
for (int i : marks) {
	System.out.println(i);
}
	}
}
