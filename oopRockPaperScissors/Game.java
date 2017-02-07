package oopRockPaperScissors;

import java.util.Random;
import java.util.Scanner;

public class Game {

	private Computer computer;
	private Human player;
	private Scanner scanner;
	private Random random;

	public Game() {
		this.computer = new Computer();
		this.player = new Human();
		
		this.scanner = new Scanner(System.in);
		this.random = new Random();
	}
	
	public void determineWinner(String computerChoiceGiven, String playerChoiceGiven) {
		String result = "";
		if( (computerChoiceGiven == "Rock" && playerChoiceGiven == "Scissors")  ||
			(computerChoiceGiven == "Scissors" && playerChoiceGiven == "Paper") ||
			(computerChoiceGiven == "Paper" && playerChoiceGiven == "Rock") ) {
			result = "Sorry, you lost... try again";
		} else if( (computerChoiceGiven == "Scissors" && playerChoiceGiven == "Rock")  ||
				   (computerChoiceGiven == "Paper" && playerChoiceGiven == "Scissors") ||
				   (computerChoiceGiven == "Rock" && playerChoiceGiven == "Paper") ) {
			result = "Congrats! you won :)";
		} else if( (computerChoiceGiven == "Scissors" && playerChoiceGiven == "Scissors")  ||
				   (computerChoiceGiven == "Paper" && playerChoiceGiven == "Paper") ||
				   (computerChoiceGiven == "Rock" && playerChoiceGiven == "Rock") ) {
			result = "It's a tie!";
		}
		System.out.println(result);
	}
	
	public void play() {
		this.player.makeChoice(this.scanner);
		this.computer.generateChoice(this.random);
		System.out.println("Computer chose: " + this.computer.getChoice());
		determineWinner(this.computer.getChoice(), this.player.getChoice());
	}

}
