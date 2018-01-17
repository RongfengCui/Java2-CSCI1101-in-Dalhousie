package com.cui.csci1101.assignment2;

public class XO {
	private String name;
	private static int turn = 1;
	public XO() {
		if (turn % 2 == 1) // if turn cannot be divided by 2, and name is x
			name = "X";
		else
			name = "O";
	}
	public void setName(String n) {
		name = n;
	}
	public static void setTurn(int t) {
		turn = t;
	}
	public String getName() {
		return name;
	}
	public static int getTurn() {
		return turn;
	}
	public boolean equals(XO another) {
		if (this.name.equals(another.getName())) //comparing the name from two objects 
			return true;
		else
			return false;
	}
	public String toString() { //toString method to return the name
		return name;
	}
}
