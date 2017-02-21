import java.util.Scanner;

public class DistanceTravelled {

	private static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner( System.in );
		double speed = -1;
		double time = 0;
		double distance;
		
		while( speed < 1 ) {
			System.out.println("Please enter the speed (in miles per hour)");
			speed = scanner.nextDouble();
		}
		
		while( time < 1 ) {
			System.out.println("Please enter the time (in hours)");
			time = scanner.nextDouble();
		}
		
		System.out.println("Hour\tDistance Travelled\n----\t------------------");
		for(int hour = 1; hour <= time; hour++) {
			distance = (hour * speed);
			System.out.println(hour + "\t" + distance);
		}	
	}
}
