package interviewProblems;

public class MultidimensionalArraysDeclarationAndLoop {

	public static void main(String[] args) {
		// array literal
		int[][] a = {{1,2,3}, {1,2,3}};
		
		// initialize an array
		int[][] arr = new int[2][3];   // 2 rows 3 columns
		arr[0][0] = 1;
		arr[0][1] = 2;
		arr[0][2] = 3;
		arr[1][0] = 1;
		arr[1][1] = 2;
		arr[1][2] = 3;		
		
		
		for(int i = 0; i < 2; i++) { // rows
			for (int j = 0; j < 3; j++) { // columns
				System.out.println(arr[i][j]);
			}
		}
	}
}
