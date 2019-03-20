package interviewProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListExample {

//	public static void main(String[] args) {
//		String[] a = {"a", "b", "c", "d"};
//		String[] b = {"d", "a"};
//		
//		List<String> lista = new ArrayList<String>(Arrays.asList(a));
//		List<String> listb = new ArrayList<String>(Arrays.asList(b));
//		
//		lista.removeAll(listb);
//		
//		String[] c = lista.toArray(new String[lista.size()]);
//		System.out.println(Arrays.toString(c));
//	}
	
	
	public static void main(String[] args) {
		String[] a = {"a", "b", "c", "d"};
		List<String> lista = new ArrayList<String>(Arrays.asList(a));
		String[] b = lista.toArray(new String[lista.size()]);
	}
}
