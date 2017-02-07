package oopRockPaperScissors;

import java.util.Scanner;

public class Human {
	
	private String choice;
	
	public String getChoice() {
		return choice;
	}

	public void setChoice(String choice) {
		this.choice = choice;
	}

	public Human() {
		this.setChoice("");
	}
	
	public void makeChoice(Scanner scanner) {
		int intChoice;
		System.out.println("Choose one: Rock (1), Paper (2), Scissors (3)");
		intChoice = scanner.nextInt();
		if(intChoice == 1) {
			this.setChoice("Rock");
		} else if(intChoice == 2) {
			this.setChoice("Paper");
		} else if(intChoice == 3) {
			this.setChoice("Scissors");
		}
	}
	
}
