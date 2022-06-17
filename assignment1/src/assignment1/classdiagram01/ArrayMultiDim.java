package assignment1.classdiagram01;
public class ArrayMultiDim {
	public static void main(String[] args) {
 int[][] marks1=new int[4][4];
marks1[0][0]=121;
marks1[0][1]=122;
marks1[0][2]=123;
marks1[1][0]=211;
marks1[1][1]=212;
marks1[1][2]=213;

	for (int i = 0; i < marks1.length; i++) {
		for(int j=0;j<marks1.length;j++)
		System.out.print(marks1[i][j]);
	}
	}
}
