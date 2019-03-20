package interviewProblems;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
	
//	public static void main(String[] args) {
//		String string = "aaaaavvvvvccbbbbbn";
//		char[] chars = string.toCharArray();
//		
//		Map<Character, Integer> map = new HashMap<Character,Integer>();
//		
//		for(char c : chars) {
//			if(!map.containsKey(c)) {
//				map.put(c, 1);
//			} else {
//				map.put(c, map.get(c) + 1);
//			}
//		}
//		
//		for(Map.Entry<Character, Integer> entry : map.entrySet()) {
//			System.out.println(entry.getKey() + " : " + entry.getValue());
//		}
//		
//	}
	
	public static void main(String[] args) {
		String x = "aaaabfddddddddb";
		char[] chars = x.toCharArray();
		
		Map<Character,Integer> map = new HashMap<Character, Integer>();
		
		for(char c : chars) {
			if(!map.containsKey(c)) {
				map.put(c, 1);
			} else {
				map.put(c, map.get(c) + 1);
			}
		}
		
		for(Map.Entry<Character, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}
	
}
