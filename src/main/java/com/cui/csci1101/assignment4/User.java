package com.cui.csci1101.assignment4;

public class User {
	private String name;
	private String location;
	private int birthYear;
	private LinkedList2 friends;

	public User(String name, String location, int birthYear) {
		this.name = name;
		this.location = location;
		this.birthYear = birthYear;
		friends = new LinkedList2();
	}

	public String getName() {
		return name;
	}

	public String getLocation() {
		return location;
	}

	public int getBirthYear() {
		return birthYear;
	}

	public LinkedList2 getFriends() {
		return friends;
	}

    public boolean isEquals(User u) { // compare two users
    	boolean answer = false;
    	if(this.getName().equals(u.getName())) {
    		if(this.getLocation().equals(u.getLocation())) {
    			if(this.getBirthYear() == u.getBirthYear()) {
    				answer = true;
    			}    				
    		}
    	}
    	return answer;
    }
    public int getNumFriends() { //return the number of friend
    	int num = friends.getCount();
    	return num;
    }

	public String toString() {
		return name + " from " + location + " -->";
	}
	
	public void addFriend(User u) { // using addtoend method
		if(u == null || u.getName() == null)
			System.out.println("There is no name in this user");
		else {
			friends.addToEnd(u);
		}			
	}
	public void removeFriend(User u) { // remove the user from the friend linkedlist
		int n = friends.contains(u);
		if(u == null || u.getName() == null)
			System.out.println("There is no name in this user");
		else {
			if(n == -1) {
				System.out.println("There is no name in this user");
			} 
			else {
				friends.remove(n);
			}	
		}	
	}
	public User OldestFriend() { // find the oldest friend
		Node2 curr = friends.getFront();
		User biggest = curr.getUser();
		while(curr.getNext() != null) { 
			if(biggest.getBirthYear() < curr.getNext().getUser().getBirthYear()) {
				biggest = curr.getNext().getUser();
			}
			curr = curr.getNext();
		}
		return biggest;
	}	  
}
