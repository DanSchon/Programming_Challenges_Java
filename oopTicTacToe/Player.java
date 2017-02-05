package oopTicTacToe;

import java.util.Scanner;

public class Player {
	public String name;
	public String symbol;
	private Scanner scanner;
	
	public Player(String name, String symbol) {
		this.name = name;
		this.symbol = symbol;
	}
	
	public Board makeMove(Board board) {
		if( this.name == "Player") {
			scanner = new Scanner( System.in );
			System.out.println( "Enter the row of the square you want to choose (1, 2, or 3):" );
			int column = scanner.nextInt( ) - 1;
			System.out.println( "Enter the column of the square you want to choose (1, 2, or 3):" );
			int row = scanner.nextInt() - 1;
			board.squares[column][row] = this.symbol;
		} else if( this.name == "Computer" ) {
			boolean computerMadeMove = false;
			for(int i=0; i<3; i++) {
				for(int j=0; j<3; j++) {
					if(board.squares[i][j] == "_") {
						board.squares[i][j] = this.symbol;
						computerMadeMove = true;
						break;
					}
				}
				if( computerMadeMove == true ) {
					break;
				}
			}
		}
		return board;
	}
	
	public boolean won(Board board) {
		boolean result = false;
		
		if( this.name == "Player" ) {
			if( board.squares[0][0] == "X" && board.squares[1][0] == "X" && board.squares[2][0] == "X" ||
				board.squares[0][1] == "X" && board.squares[1][1] == "X" && board.squares[2][1] == "X" ||
				board.squares[0][2] == "X" && board.squares[1][2] == "X" && board.squares[2][2] == "X" ||
				board.squares[0][0] == "X" && board.squares[0][1] == "X" && board.squares[0][2] == "X" ||
				board.squares[1][0] == "X" && board.squares[1][1] == "X" && board.squares[1][2] == "X" ||
				board.squares[2][0] == "X" && board.squares[2][1] == "X" && board.squares[2][2] == "X" ||
				board.squares[0][0] == "X" && board.squares[1][1] == "X" && board.squares[2][2] == "X" ||
				board.squares[0][2] == "X" && board.squares[1][1] == "X" && board.squares[0][0] == "X") {
				result = true;
			}
		} else if( this.name == "Computer" ) {
			if( board.squares[0][0] == "O" && board.squares[1][0] == "O" && board.squares[2][0] == "O" ||
				board.squares[0][1] == "O" && board.squares[1][1] == "O" && board.squares[2][1] == "O" ||
				board.squares[0][2] == "O" && board.squares[1][2] == "O" && board.squares[2][2] == "O" ||
				board.squares[0][0] == "O" && board.squares[0][1] == "O" && board.squares[0][2] == "O" ||
				board.squares[1][0] == "O" && board.squares[1][1] == "O" && board.squares[1][2] == "O" ||
				board.squares[2][0] == "O" && board.squares[2][1] == "O" && board.squares[2][2] == "O" ||
				board.squares[0][0] == "O" && board.squares[1][1] == "O" && board.squares[2][2] == "O" ||
				board.squares[0][2] == "O" && board.squares[1][1] == "O" && board.squares[0][0] == "O") {
				result = true;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
