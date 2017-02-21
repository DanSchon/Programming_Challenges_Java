package oopTwentyOne;

import java.util.Random;

public class Dice {
	
	private int numberOfSides;
	private int score;

	public Dice() {
		this.numberOfSides = 6;
		this.score = 0;
	}
	
	public int roll() {
		Random random = new Random();
		this.score += random.nextInt(this.numberOfSides + 1); // (1 - 6)
		return this.score;
	}

}
