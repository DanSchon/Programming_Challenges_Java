package oopRockPaperScissors;

import java.util.Random;

public class Computer {
	
	private String choice;
	
	public String getChoice() {
		return choice;
	}

	public void setChoice(String choice) {
		this.choice = choice;
	}

	public Computer() {
		this.setChoice("");
	}
	
	public void generateChoice( Random random ) {
		int randomInt;
		
		randomInt = random.nextInt(3);
		
		if(randomInt == 0) {
			this.setChoice("Rock");
		} else if( randomInt == 1) {
			this.setChoice("Paper");
		} else {
			this.setChoice("Scissors");
		}
	}

}
