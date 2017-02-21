package oopTwentyOne;

public class Player {
	
	private int totalScore;
	private Dice dice1;
	private Dice dice2;

	public Player() {
		this.setTotalScore(0);
		dice1 = new Dice();
		dice2 = new Dice();
	}
	
	public void rollDice() {
		int diceTotal;
		diceTotal = dice1.roll() + dice2.roll();
		
		this.setTotalScore(diceTotal);
	}

	public int getTotalScore() {
		return totalScore;
	}

	public void setTotalScore(int totalScore) {
		this.totalScore = totalScore;
	}

}
