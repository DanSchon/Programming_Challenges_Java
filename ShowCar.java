
public class ShowCar {
	
	public static void showCar( String stringGiven, int intGiven) {
		if( (intGiven < 0) || (intGiven > stringGiven.length() - 1) ) {
			System.out.println("Please enter an integer between 1 and " + (stringGiven.length() - 1));
		} else {
			System.out.println("The char at index " + intGiven + " in " + stringGiven + " is " + stringGiven.charAt( intGiven ));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		showCar( "New York", 5);

	}

}
