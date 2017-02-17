
public class NameSorter {

	public static void sortNames(String names[]) {
		String temp;
		
		for(int i=0; i<names.length; i++) {
			for(int j=i+1; j<names.length; j++) {
				if(names[i].compareToIgnoreCase(names[j]) > 0) {
					temp = names[i];
					names[i] = names[j];
					names[j] = temp;
				}
			}
		}
		for(int k=0;k<names.length;k++) {
			System.out.print(names[k] + " ");
		}		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String namesGiven[] = {"Bethoven", "Adam", "Daniel", "Charlie"};
		sortNames(namesGiven); // => Adam Bethoven Charlie Daniel 
	}

}
