
public class Car {
	
	private String yearModel;
	private String make;
	private int speed;
	
	public void accelerate() {
		this.speed += 20;
	}
	
	public void brake() {
		this.speed -= 20;
	}

	public Car(String yearModelGiven, String makeGiven) {
		setYearModel(yearModelGiven);
		setMake(makeGiven);
		setSpeed(0);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car("2007", "Ford Mustang");
		
		System.out.println("Going 0 to 100 real quick...");
		for(int seconds = 1; seconds <= 5; seconds++) {
			car.accelerate();
			System.out.println("The " + car.getYearModel() + " " + car.getMake() + " is going " + car.getSpeed() + " miles per hour after " + seconds + " seconds");
		}
		
		System.out.println("Going back to 0 real quick...");
		for(int seconds = 1; seconds <= 5; seconds++) {
			car.brake();
			System.out.println("The " + car.getYearModel() + " " + car.getMake() + " is going " + car.getSpeed() + " miles per hour after " + seconds + " seconds");
		}


	}

	public String getYearModel() {
		return yearModel;
	}

	public void setYearModel(String yearModel) {
		this.yearModel = yearModel;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

}
