package interviewProblems;

public class Palindrome {

//	public static void main(String[] args) {
//		
//		String word = "madam";
//		String reversedWord = "";
//		
//		for(int i = word.length() - 1; i >= 0; i--) { // length for strings is a method
//			reversedWord += word.charAt(i);
//		}
//		
//		if (word.equals(reversedWord)) {
//			System.out.println("palindrome!");
//		}
//		
//		// NOTE: The .equals() method will check if the two strings have the same value
//		// == checks if they are the same object - so don't use it!
//	}
	
	public static void main(String[] args) {
		String word = "madam";
		String reversedWord = "";
		
		for(int i = word.length() - 1; i >= 0; i--) {
			reversedWord += word.charAt(i);
		}
		
		if(word.equals(reversedWord)) {
			System.out.println("palindrome!");
		}
		
	}
	
	
}
