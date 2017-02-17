
public class FallingDistance {
	
	public static double fallingDistance(int time) {
		double distance;
		double gravity = 9.8;
		distance = ((double)1 / 2) * gravity * Math.pow(time, 2);
		return distance;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int seconds = 1; seconds <= 10; seconds++) {
			System.out.printf("%.2f", fallingDistance(seconds));
			System.out.println("");
		}
	}

}
