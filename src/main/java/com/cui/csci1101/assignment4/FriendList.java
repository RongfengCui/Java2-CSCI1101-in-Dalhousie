package com.cui.csci1101.assignment4;

public class FriendList {
    private LinkedList2 allUsers;
    
	public FriendList() {
		allUsers = new LinkedList2();
	}
	
    public void addUser(User u) {
    	if(u == null || u.getName() == null || u.getBirthYear() < 13) {
    		System.out.println("cannot add because this user may be under 13 or do not exist");
    	}
    	else {
    		allUsers.addToEnd(u); //addToEnd method
    	}
    	
    }
    public void removeUser(User u) {
    	int n = allUsers.contains(u); // Using contains method
    	if(u == null || u.getName() == null) {
    		System.out.println("There is no name in this user");
    	}
    	if(n == -1) {
			System.out.println("There is no name in this user");
		} 
		else {
			allUsers.remove(n); //remove the user from the allUser
			System.out.println("Already remove " + u.getName() + " from the user list");
			Node2 curr = allUsers.getFront();
			while(curr != null) { //this while loop is to move this user from every user's friend list
				Node2 curr1 = curr.getUser().getFriends().getFront();
				while(curr1 != null) {
					if(curr1.getUser().getName().equals(u.getName())) {
						int num = curr.getUser().getFriends().contains(u);
						curr.getUser().getFriends().remove(num);
					}
					curr1 = curr1.getNext();
				}
				curr = curr.getNext();
			}
		}
    }
    public int totalUser() {
    	return allUsers.getCount(); //go into the allUsers linkedlist and get the count
    }
    public LinkedList2 getUsers() {
    	return allUsers;
    }
    public User mostFriends() {
    	Node2 curr = allUsers.getFront();
    	User biggest = curr.getUser();
    	while(curr.getNext() != null) {
    		if(biggest.getNumFriends() < curr.getNext().getUser().getNumFriends()) {
    				biggest = curr.getNext().getUser();
    		}
    		curr = curr.getNext();
    	}
    	return biggest;
    }
    public User oldestFriends() {
    	Node2 curr = allUsers.getFront();
    	User oldest = curr.getUser();
    	while(curr.getNext() != null) {
    		if(oldest.OldestFriend().getBirthYear() < curr.getNext().getUser().OldestFriend().getBirthYear()) {
    			oldest = curr.getNext().getUser();
    		}
    		curr = curr.getNext();
    	}
    	return oldest;
    }
    public LinkedList2 commonFriends(User u1, User u2) {
    	LinkedList2 list = new LinkedList2();
    	Node2 curr1 = u1.getFriends().getFront();
    	while(curr1.getNext() != null) {
        	Node2 curr2 = u2.getFriends().getFront();
    		while(curr2.getNext() != null) {
    			if(curr1.getUser() == curr2.getUser()) {
    				list.addToEnd(curr1.getUser());
    			}
    			curr2 = curr2.getNext();
    		}
    		curr1 = curr1.getNext();
    	}
     	return list;
    }   
}
