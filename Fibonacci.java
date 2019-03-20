package interviewProblems;

public class Fibonacci {
//In fibonacci series, next number is the sum of previous two numbers
// for example 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 etc. 
//The first two numbers of fibonacci series are 0 and 1.
//	
//	public static void main(String[] args) {
//		// 0, 1, 1, 2, 3, 5, 8, 13, 21, 34
//		
//		int n1 = 0;
//		int n2 = 1;
//		int n3;
//		
//		System.out.print(n1 + " " + n2);
//		
//		int i = 2;
//		int count = 10;
//		while(i<=10) {
//			n3 = n1 + n2;  //next number is sum of two previous numbers
//			System.out.print(" " + n3);
//			n1 = n2;
//			n2 = n3;
//			i++;
//		}
//	}
	
	
	
//	public static void main(String[] args) {
//		int n1 = 0;
//		int n2 = 1;
//		int n3;
//		
//		System.out.print(n1 + " " + n2);
//		
//		int i = 2;
//		int count = 10;
//		while(i<=10) {
//			//next number is the sum of previous two numbers
//			n3 = n1 + n2;
//			System.out.print(" " + n3);
//			n1 = n2;
//			n2 = n3;
//			i++;
//		}
//	}
	
	public static void main(String[] args) {
		int n1 = 0;
		int n2 = 1;
		System.out.print(n1 + " " + n2);
		
		int n3; // n3 is the sum of n1 and n2
		
		int n = 2;
		int count = 10;
		while(n<=count) {
			n3 = n1 + n2;
			System.out.print(" " + n3);
			n1 = n2;
			n2 = n3;
			n++;
		}
	}

	
	
	
}
