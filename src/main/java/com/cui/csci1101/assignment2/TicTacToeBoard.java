package com.cui.csci1101.assignment2;

public class TicTacToeBoard extends Board { 
	private XO[][] board;
	private int turnCnt;

	public TicTacToeBoard(int r, int c) {
		super(r,c);
		turnCnt = 0;
		board = new XO[getRows()][getCols()]; // create a 2D array called board
	}
	public void setTurnCnt(int t) {
		turnCnt = t;
	}
	public int getTurnCnt() {
		return turnCnt;
	}
	public void add(int r, int c, XO x) {
		if (board[r][c] == null && r <= 3 && c <= 3)
			board[r][c] = x; // add an object to the array
		else {
			System.out.println("You can not do that!"); // if it already has an object in that place, another object cannot take place this place
			XO.setTurn(XO.getTurn() - 1); //turn has to minus 1 because turn always add 1 in play.class 
		}
	}
	public boolean winner() {
		boolean answer = false;
		for (int i = 0; i < super.getRows(); i++) { // To check if there are all x or o in one column
			if (board[i][0] != null && board[i][1] != null 
					&& board[i][2] != null) {
				if (board[i][0].equals(board[i][1])) {
					if (board[i][1].equals(board[i][2]))
						answer = true;
				}
			}
		}
		for (int j = 0; j < super.getCols(); j++) { // To check if there are all three x or o in one row
			if (board[0][j] != null && board[1][j] != null 
					&& board[2][j] != null) {
				if (board[0][j].equals(board[1][j])) {
					if (board[1][j].equals(board[2][j]))
						answer = true;
				}
			}
		}
		if (board[1][1] != null && board[0][2] != null && board[2][0] != null) { // To check if there are all three x or o in one diagonal from right to left
			if (board[0][2].equals(board[1][1])) {
				if (board[1][1].equals(board[2][0]))
					answer = true;
			}
		}
		if (board[0][0] != null && board[1][1] != null && board[2][2] != null) { // To check if three x or o in one diagonal from left to right
			if (board[0][0].equals(board[1][1])) {
				if (board[1][1].equals(board[2][2]))
					answer = true;
			}
		}
		return answer;
	}
	public void printBoard() {
		int x = 1;
		System.out.print("\t\t\tCol\n"); // create a TocTacToe board
		System.out.print("\t\t\t");
		for (int i = 0; i < getCols(); i++) {
			System.out.print(x + "\t");
			x++;
		}
		int y = 1;
		System.out.print("\nRow");
		for (int i = 0; i < getRows(); i++) {
			if(y == 1) {
			System.out.print("\t" + y);
			y++;
			for (int j = 0; j < getCols(); j++) {
				if (board[i][j] == null) // if array is null, print \t\t 
					System.out.print("\t ");
				else // else print \t\t and the name in the array
					System.out.print("\t" + board[i][j].getName());
			}	
			System.out.print("\n\n");
			}
			else if(y >= 2) {
					System.out.print("   \t" + y);
					y++;
					for (int j = 0; j < getCols(); j++) {
						if (board[i][j] == null) // if array is null, print \t\t 
							System.out.print("\t ");
						else // else print \t\t and the name in the array
							System.out.print("\t" + board[i][j].getName());
					}	
					System.out.print("\n\n");
			}				
		}
	}
}
