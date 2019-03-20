package interviewProblems;

public class ArrayDeclarations {

	public static void main(String[] args) {
		// array literal
		String[] arr = {"1","2","3","4","5"};
		
		// initialize an array - remember to allocate space
		int[] arr2 = new int[5];
		arr2[0] = 1;
		arr2[1] = 2;
		arr2[2] = 3;
		arr2[3] = 4;
		
		// length is a property of an array, not a method
		for(int i = 0; i < arr2.length; i++) {
			System.out.println(arr[i]);
		}
		
	}
	
	
}
