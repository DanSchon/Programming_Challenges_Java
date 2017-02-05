import java.util.Scanner;

public class RomanNumerals {

	private static Scanner scanner;

	public static void main(String[] args) {
	
		int userNumber;
		
		scanner = new Scanner( System.in );
		userNumber = scanner.nextInt();
		
		if( userNumber < 1 || userNumber > 10) {
			System.out.println("Incorrect input: Please run the program again and enter a number between 1 and 10");
		} else {
			if( userNumber == 1 ) {
				System.out.println( userNumber + " in roman numerals is I");
			} else if( userNumber == 2) {
				System.out.println( userNumber + " in roman numerals is II");
			} else if( userNumber == 3) {
				System.out.println( userNumber + " in roman numerals is III");
			} else if( userNumber == 4) {
				System.out.println( userNumber + " in roman numerals is IV");
			} else if( userNumber == 5) {
				System.out.println( userNumber + " in roman numerals is V");
			} else if( userNumber == 6) {
				System.out.println( userNumber + " in roman numerals is VI");
			} else if( userNumber == 7) {
				System.out.println( userNumber + " in roman numerals is VII");
			} else if( userNumber == 8) {
				System.out.println( userNumber + " in roman numerals is VIII");
			} else if( userNumber == 9) {
				System.out.println( userNumber + " in roman numerals is IX");
			} else if( userNumber == 10) {
				System.out.println( userNumber + " in roman numerals is X");
			}
		}

	}

}
