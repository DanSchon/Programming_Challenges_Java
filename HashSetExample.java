package interviewProblems;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
	
	public static void main(String[] args) {
		// find duplicates
		String a = "hello";
		char[] aToChar = a.toCharArray();
		
		Set<Character> s = new HashSet<Character>();
		
		for(int i = 0; i < aToChar.length; i++) {
			if (!s.add(aToChar[i])) {
				System.out.println(aToChar[i] + " is a duplicate!");
			}
		}
		
	}
	
}
