package oopTicTacToe;

public class Game {
	public Board board;
	public Player player;
	public Player computer;
	
	public Game() {
	    this.board = new Board();
		this.player = new Player("Player", "X");
		this.computer = new Player("Computer", "O");
	}
	
	public void play() {
		while( board.isNotFull() ) {
			board.display();
			
			this.player.makeMove(this.board);
			if( this.player.won(this.board) ) {
				System.out.println( this.player.name + " won!" );
				break;
			}
			
			this.computer.makeMove(this.board);
			if( this.computer.won(this.board) ) {
				System.out.println("sorry " + this.computer.name + " won... try again");
				break;
			}
		}
		if( this.board.isNotFull() == false ) {
			System.out.println("it's a tie...");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
