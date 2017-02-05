import java.util.Scanner;

public class SumOfNumbers {

	private static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner( System.in );
		int userNumber = -1;
		int sum = 0;
		
		while( userNumber < 1 ) {
			System.out.println("Please enter a positive non-zero integer");
			userNumber = scanner.nextInt();
		}
		
		for( int number = 1; number <= userNumber; number++ ) {
			sum += number;
		}
		System.out.println("The sum of numbers between 1 and " + userNumber + " is " + sum);

	}

}
