package lab5;

public class Task2 {
	private static final char EMPTY = ' ';
	private char[][] board;
	 public Task2() {
		// Initialize the Tic-Tac-Toe board with empty spaces
	        board = new char[3][3];
	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++) {
	                board[i][j] = EMPTY;
	            }
	        }
	    }

	/*
	 * This method checks all rows and returns true if any of them are marked with
	 * all of a single player's markers. Otherwise, returns false.
	 */
	public boolean checkRows() {
		// TODO
		for (int i = 0; i < 3; i++) {
			if (board[i][0] != EMPTY && allEqualRow(board[i])) {
				return true;
			}
		}
		return false;

	}
	// Check all elements in a row are equal 
	private boolean allEqualRow(char[] row) {
		// TODO Auto-generated method stub
	    char firstChar = row[0];
        for (char c : row) {
            if (c != firstChar) {
                return false;
            }
        }
        return true;
    }

	/*
	* This method checks all columns and returns true if any of them are marked
	* with all of a single player's.
	* Otherwise, returns false.
	*/
	public boolean checkColumns() {
	//TODO
		for (int i = 0; i < 3; i++) {
			if (board[0][i] != EMPTY && allEqualColumn(i)) {
				return true;
			}
		}
	return false;
	}
	// Check all elements in a column are equal 
	private boolean allEqualColumn(int n) { //n is column
		// TODO Auto-generated method stub
		 for (int i = 0; i < 3; i++) {
	            if (board[i][n] != board[0][n]) {
	                return false;
	            }
	        }
	        return true;


	        
	}

	/*
	* This method checks both diagonals and returns true if 
	any of them are marked
	* with all of a single player's markers. Otherwise, 
	returns false.
	*/
	public boolean checkDiagonals() {
	// Check top-left to bottom-right
		//TODO
		if (board[0][0] != EMPTY && allEqualDiagonal_main(3)) {
			return true;
		}

		// Check bottom-left to top-right
		//TODO
		if (board[0][2] != EMPTY && allEqualDiagonal(3)) {
			return true;
		}
		return false;
		}
	private boolean allEqualDiagonal(int n) {
		// TODO Auto-generated method stub
		 for (int i = 0; i < 2; i++) {
	            if (board[i][2 - i] != board[i + 1][1 - i]) {
	                return false;
	            }
	        }
	        return true;
	    }
	private boolean allEqualDiagonal_main(int n) {
		// TODO Auto-generated method stub
		for (int i = 0; i < n-1; i++) {
			if (board[i][i] != board[i + 1][i + 1]) {
				return false;
			}
		}
		return true;
	}

	 public static void main(String[] args) {
	        Task2 game = new Task2();

	       
	        game.board[0][0] = 'X';
	        game.board[0][1] = 'X';
	        game.board[0][2] = 'X';

	        boolean rowWin = game.checkRows();
	        boolean colWin = game.checkColumns();
	        boolean diagWin = game.checkDiagonals();

	        
	        if (rowWin || colWin || diagWin) {
	            System.out.println("There is a winner!");
	        } else {
	            System.out.println("No winner yet.");
	        }
	    }
	}	
	
	

