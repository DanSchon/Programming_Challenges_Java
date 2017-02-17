
public class LetterCounter {
	
	public static int letterCounter(String word, char letter) {
		int count = 0;
		for(int i = 0; i < word.length(); i++) {
			if(word.charAt(i) == letter) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(letterCounter("hello", 'l'));
	}

}
