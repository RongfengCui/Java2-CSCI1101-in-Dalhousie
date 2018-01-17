package com.cui.csci1101.assignment2;

import java.util.Scanner;
public class Play {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.print("Player 1 name: "); // enter the name of first player
		String player11 = kb.nextLine(); 
		System.out.print("Player 2 name: ");
		String player22 = kb.nextLine();
		TicTacToeBoard Tboard = new TicTacToeBoard(3, 3);
		XO xo = new XO();
		System.out.println(player11 + " - you are X's and you go first");
		Tboard.printBoard(); // print the whole board
		int p, q;
		while (Tboard.getTurnCnt() < 9 && Tboard.winner() == false) {
			if (XO.getTurn() == 1) {
				System.out.print("Please input a row# between 1-3 and column# between 1-3: "); // enter two numbers which is the number of row and column that you want to add
				p = kb.nextInt() - 1;
				q = kb.nextInt() - 1;
				while (p > 2 || q > 2) { // if the input number is larger than 3, user should input again
					System.out.print("Sorry! Wrong number. Please input a row# between 1-3 and column# between 1-3: ");
					p = kb.nextInt() - 1;
					q = kb.nextInt() - 1;
				}
				Tboard.add(p, q, xo); // add the object to the array, and the name is X in the object of xo
				Tboard.printBoard(); // print the board in this situation
				XO.setTurn(XO.getTurn() + 1); // turn add 1
				Tboard.setTurnCnt(Tboard.getTurnCnt() + 1); // turnCnt add 1
			}
			else if (XO.getTurn() % 2 == 0) {
				XO x = new XO();// make a new XO
				System.out.print(player22 + " please input a row# between 1-3 and column# between 1-3: ");
				p = kb.nextInt() - 1;
				q = kb.nextInt() - 1;
				while (p > 2 || q > 2) {
					System.out.print("Sorry! Wrong number. Please input a row# between 1-3 and column# between 1-3: ");
					p = kb.nextInt() - 1;
					q = kb.nextInt() - 1;
				}
				Tboard.add(p, q, x); // add the object to the array, and the name is O in the object of x
				Tboard.printBoard();
				XO.setTurn(XO.getTurn() + 1);
				Tboard.setTurnCnt(Tboard.getTurnCnt() + 1);
			} 
			else {
				System.out.print(player11 + " please input a row# between 1-3 and column# between 1-3: ");
				p = kb.nextInt() - 1;
				q = kb.nextInt() - 1;
				while (p > 2 || q > 2) {
					System.out.print("Sorry! Wrong number. Please input a row# between 1-3 and column# between 1-3: ");
					p = kb.nextInt() - 1;
					q = kb.nextInt() - 1;
				}
				Tboard.add(p, q, xo);
				Tboard.printBoard();
				XO.setTurn(XO.getTurn() + 1);
				Tboard.setTurnCnt(Tboard.getTurnCnt() + 1);
			}
		}
		if (Tboard.winner() == false) // if turnCnt is larger than 9 and the method of winner is false, it means there is no winner
			System.out.println("No winner.");
		else if (Tboard.winner() == true && XO.getTurn() % 2 == 0) // if turn can be divided by 2, first player is winner
			System.out.println(player11 + " you win!!");
		else if (Tboard.winner() == true && XO.getTurn() % 2 == 1) // else second player is winner
			System.out.println(player22 + " you win!!");
	}
}