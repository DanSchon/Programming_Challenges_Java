package oopTicTacToe;

public class Board {
	
	public String[][] squares;

	public Board() {
		this.squares = new String[][]{{"_", "_", "_"},{"_", "_", "_"},{"_", "_", "_"}};
	}
	
	public void display() {
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				System.out.print(this.squares[i][j]);
				System.out.print("\t");
			}
			System.out.println("");
		}
	}
	
	public boolean isNotFull() {
		boolean result = false;
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				if(this.squares[i][j] == "_") {
					result = true;
				}
			}
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
