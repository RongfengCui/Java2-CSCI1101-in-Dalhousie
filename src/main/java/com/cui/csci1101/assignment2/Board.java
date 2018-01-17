package com.cui.csci1101.assignment2;

public class Board {
	private int rows;// instance variable
	private int cols;
	public Board(int r, int c) {
		rows = r;
		cols = c;
	}
	public void setRows(int r) { //mutator method
		rows = r;
	}
	public void setCols(int c) {
		cols = c;
	}
	public int getRows() { //accessor method
		return rows;
	}
	public int getCols() {
		return cols;
	}
}
