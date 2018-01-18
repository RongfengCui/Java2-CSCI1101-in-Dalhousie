package com.cui.csci1101.assignment4;

public class Node2 {
	private User u;
	private Node2 next;

	public Node2(User u, Node2 n) {
		this.u = u;
		next = n;
	}

	public User getUser() {
		return u;
	}

	public Node2 getNext() {
		return next;
	}

	public void setNext(Node2 n) {
		next = n;
	}

	public String toString() {
		return u.getName() + "-->";
	}
}