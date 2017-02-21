package oopTwentyOne;

import java.util.Scanner;

public class Game {
	
	private Player player;
	private Player computer;
	private Scanner scanner;

	public Game() {
		player = new Player();
		computer = new Player();
		scanner = new Scanner(System.in);
	}
	
	public void play() {
		char continuePlaying = 'y';
		
		while(continuePlaying == 'y' && player.getTotalScore() < 21 && computer.getTotalScore() < 21 ) {
			player.rollDice();
			computer.rollDice();
			System.out.println("Your score = " + player.getTotalScore() + "\nComputer Score = " + computer.getTotalScore());
			if(player.getTotalScore() >= 21 || computer.getTotalScore() >= 21) {
				break;
			} else {
				System.out.println("Would you like to roll again? (y or n)");
				continuePlaying = scanner.nextLine().charAt(0);
			}
		}
		
		if( player.getTotalScore() == 21 ) {
			System.out.println("Congrats! You Won!");
		} else if ( computer.getTotalScore() == 21 ) {
			System.out.println("Sorry, you lost...");
		} else if (player.getTotalScore() > computer.getTotalScore() && player.getTotalScore() <= 21 ) {
			System.out.println("Congrats! You Won!");
		} else if (player.getTotalScore() < computer.getTotalScore() && computer.getTotalScore() <= 21 ) {
			System.out.println("Sorry, you lost...");
		} else if (player.getTotalScore() == computer.getTotalScore()) {
			System.out.println("it's a tie...");
		} else if (player.getTotalScore() > 21 && computer.getTotalScore() < 21) {
			System.out.println("Sorry, you lost...");
		} else if (player.getTotalScore() < 21 && computer.getTotalScore() > 21) {
			System.out.println("Congrats! You Won!");
		} else if (player.getTotalScore() > 21 && computer.getTotalScore() > 21) {
			System.out.println("Nobody won...");
		}
	}
	
}
