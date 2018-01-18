package com.cui.csci1101.assignment4;
import java.util.Scanner;
import java.io.*;
import java.util.*;
public class Demo {	
	 public static void main(String[] args) throws IOException {
		ArrayList<User> list1 = new ArrayList<User>();
		FriendList friendlist = new FriendList();
		Scanner keyboard = new Scanner(System.in);
		String filename = "users.text";
		File inFile = new File(filename);
		Scanner input = new Scanner(inFile);
		String filename1 = "friends.text";
		File inFile1 = new File(filename1);
		Scanner input1 = new Scanner(inFile1);
		while(input.hasNext()) { // read the file and create users
			String name = input.next();
			String location = input.next();
			int birthYear = input.nextInt();
			User user = new User(name, location, birthYear);
			friendlist.addUser(user);
			list1.add(user);
		}	
		input.close();	
		while(input1.hasNext()) { // read the file and add friends to different users
			String eachLine = input1.nextLine();
			Scanner line = new Scanner(eachLine);
			String name1 = line.next();
			for(int i = 0; i < list1.size() ; i++) {
				if(name1.equals(list1.get(i).getName())) {
					while(line.hasNext()) {
						String friend = line.next();
						for(int j = 0; j < list1.size() ; j++) {
							if(friend.equals(list1.get(j).getName())) {
								list1.get(i).addFriend(list1.get(j));
							}							
						}	
					}
				}				
			}
		}
		input1.close();
		System.out.print("Welcome to FriendList! What would you like to do (press a number)?\n1.Print out all the users.\n2.Print the total number of users.\n3.Print out all the friends of a user.\n4.Add a new user.\n5.Remove a user.\n6.Add a friend.\n7.Remove a friend.\n8.Print the user with most friends.\n9.Find common friends between two friends.\n10.Find the oldest friend for a user.\n11.Find the user with the oldest friend on FriendList.\n12.Quit.\nSelection: ");
		int num = keyboard.nextInt();
		while(num <= 0 || num > 12) { // error check
			System.out.println("Invalid number! Please enter again!");
			System.out.print("\n\nWelcome to FriendList! What would you like to do (press a number)?\n1.Print out all the users.\n2.Print the total number of users.\n3.Print out all the friends of a user.\n4.Add a new user.\n5.Remove a user.\n6.Add a friend.\n7.Remove a friend.\n8.Print the user with most friends.\n9.Find common friends between two friends.\n10.Find the oldest friend for a user.\n11.Find the user with the oldest friend on FriendList.\n12.Quit.\nSelection: ");
			num = keyboard.nextInt();
		}
		while(num != 12) { 
			if(num == 1) { // access the friendlist and print the all the users
				System.out.print("OUTPUT\n\nUsers of FriendList:");
				Node2 curr = friendlist.getUsers().getFront();
				while(curr != null) {
					System.out.print(curr.getUser().toString());
					curr = curr.getNext();
				}
			}
			else if(num == 2) { //print the number of totaluser
				System.out.print("OUTPUT\n\nTotal users on FriendList: " + friendlist.totalUser());
			}
			else if(num == 3) { //error checking whether the name exist or not and print the friends of the user
				User u = null;
				System.out.print("OUTPUT\n\nPlease enter the user name: ");
				String name = keyboard.next();
				System.out.println("\n" + name + "'s friends:" );
				for(int i = 0; i < list1.size() ; i++) {
					if(name.equals(list1.get(i).getName())) {
						u = list1.get(i);
					}
				}
				Node2 curr = u.getFriends().getFront();
				while(curr != null) {
					System.out.print(curr.getUser().toString());
					curr = curr.getNext();
				}
			}
			else if(num == 4) { //add a new user in two files and friendList
				System.out.print("OUTPUT\n\nEnter the user's name, their home town, and year of birth: ");
				String name = keyboard.next();
				String homeTown = keyboard.next();
				int birthYear = keyboard.nextInt();
				User user = new User(name, homeTown, birthYear);
				friendlist.addUser(user);
				list1.add(user);
				PrintWriter outputFile = new PrintWriter(new FileWriter(filename));
				for(int i = 0; i < list1.size(); i++) {
					String name1 = list1.get(i).getName();
					String homeTown1 = list1.get(i).getLocation();
					int birthYear1 = list1.get(i).getBirthYear();
					outputFile.println(name1 + " " + homeTown1 + " " + birthYear1);
				}			
				outputFile.close();
				PrintWriter outputFile1 = new PrintWriter(new FileWriter(filename1));
				for(int i = 0; i < list1.size() ; i++) {
					outputFile1.print(list1.get(i).getName());
					Node2 curr = list1.get(i).getFriends().getFront();
					while(curr != null) {
						outputFile1.print(" " + curr.getUser().getName());
						curr = curr.getNext();
					}
					outputFile1.print("\n");						
				}
				outputFile1.close();
			}
			else if(num == 5) { // error checking //error checking whether the name exist or not and remove the user from two files
				User u = null;
				System.out.print("OUTPUT\n\nEnter the name of the user to remove: ");
				String name = keyboard.next();
				boolean answer = false;
				for(int i = 0; i < list1.size() ; i++) {
					if(name.equals(list1.get(i).getName())) {
						u = list1.get(i);
						answer = true;
						break;
					}
				}
				if(answer == false) {
					System.out.println("Cannot move, cannot find this guy");
				}
				else {
					friendlist.removeUser(u);
					list1.remove(list1.indexOf(u));				
					PrintWriter outputFile = new PrintWriter(new FileWriter(filename));
					for(int i = 0; i < list1.size(); i++) {
						String name1 = list1.get(i).getName();
						String homeTown1 = list1.get(i).getLocation();
						int birthYear1 = list1.get(i).getBirthYear();
						outputFile.println(name1 + " " + homeTown1 + " " + birthYear1);
					}			
					outputFile.close();
					PrintWriter outputFile1 = new PrintWriter(new FileWriter(filename1));
					for(int i = 0; i < list1.size() ; i++) {
						outputFile1.print(list1.get(i).getName());
						Node2 curr = list1.get(i).getFriends().getFront();
						while(curr != null) {
							outputFile1.print(" " + curr.getUser().getName());
							curr = curr.getNext();
						}
						outputFile1.print("\n");						
					}
					outputFile1.close();
					
				}
			}
			else if(num == 6) { //checking the name of user and add to the user of friend
				User u1 = null;
				User u2 = null;
				boolean answer1 = false;
				boolean answer2 = false;
				System.out.print("OUTPUT\n\nTo create a friend, you need to enter two user names\nEnter the name of the first user: ");
				String name1 = keyboard.next();
				System.out.print("\nEnter the name of the second user: ");
				String name2 = keyboard.next();
				for(int i = 0; i < list1.size() ; i++) {
					if(name1.equals(list1.get(i).getName())) {
						u1 = list1.get(i);
						answer1 = true;
					}
				}
				for(int j = 0; j < list1.size() ; j++) {
					if(name2.equals(list1.get(j).getName())) {
						u2 = list1.get(j);
						answer2 = true;
					}
				}
				if(answer1 == false && answer2 == false) {
					System.out.println("Cannot add friend, cannot find " + name1 + " and " + name2);
				}
				else if(answer1 != false && answer2 == false) {
					System.out.println("Cannot add friend, cannot find " + name2);
				}
				else if(answer1 == false && answer2 != false) {
					System.out.println("Cannot add friend, cannot find " + name1);
				}
				else {
					u1.addFriend(u2);
					PrintWriter outputFile1 = new PrintWriter(new FileWriter(filename1));
					for(int i = 0; i < list1.size() ; i++) {
						outputFile1.print(list1.get(i).getName());
						Node2 curr = list1.get(i).getFriends().getFront();
						while(curr != null) {
							outputFile1.print(" " + curr.getUser().getName());
							curr = curr.getNext();
						}
						outputFile1.print("\n");						
					}
					outputFile1.close();
				}
			}
			else if(num == 7) { // remove the user from the friend of this user
				User u1 = null;
				User u2 = null;
				boolean answer1 = false;
				boolean answer2 = false;
				System.out.print("OUTPUT\n\nTo create a friend, you need to enter two user names\nEnter the name of the first user: ");
				String name1 = keyboard.next();
				System.out.print("Enter the name of the second user: ");
				String name2 = keyboard.next();
				for(int i = 0; i < list1.size() ; i++) {
					if(name1.equals(list1.get(i).getName())) {
						u1 = list1.get(i);
						answer1 = true;
					}
				}
				for(int j = 0; j < list1.size() ; j++) {
					if(name2.equals(list1.get(j).getName())) {
						u2 = list1.get(j);
						answer2 = true;
					}
				}
				if(answer1 == false && answer2 == false) {
					System.out.println("Cannot remove friend, cannot find " + name1 + " and " + name2);
				}
				else if(answer1 != false && answer2 == false) {
					System.out.println("Cannot remove friend, cannot find " + name2);
				}
				else if(answer1 == false && answer2 != false) {
					System.out.println("Cannot remove friend, cannot find " + name1);
				}
				else {
					u1.removeFriend(u2);
					PrintWriter outputFile1 = new PrintWriter(new FileWriter(filename1));
					for(int i = 0; i < list1.size() ; i++) {
						outputFile1.print(list1.get(i).getName());
						Node2 curr = list1.get(i).getFriends().getFront();
						while(curr != null) {
							outputFile1.print(" " + curr.getUser().getName());
							curr = curr.getNext();
						}
						outputFile1.print("\n");						
					}
					outputFile1.close();
				}
			}
			else if(num == 8) { //using the mostFriends method from FriendList.class
				User u = friendlist.mostFriends();
				System.out.println("OUTPUT\n\nUser with the most friends is " + u.getName()  + " from " + u.getLocation());
				System.out.println("Friends: \n");
				Node2 curr = u.getFriends().getFront();
				while(curr != null) {
					System.out.print(curr.getUser().toString());
					curr = curr.getNext();
				}
			}
			else if(num == 9) { //using the mostFriends method from commonFriends.class
				User u1 = null;
				User u2 = null;
				boolean answer1 = false;
				boolean answer2 = false;
				System.out.print("OUTPUT\n\nTo find commom friend, you need to enter two user names\nEnter the name of the first user: ");
				String name1 = keyboard.next();
				System.out.print("Enter the name of the second user: ");
				String name2 = keyboard.next();
				for(int i = 0; i < list1.size() ; i++) {
					if(name1.equals(list1.get(i).getName())) {
						u1 = list1.get(i);
						answer1 = true;
					}
				}
				for(int j = 0; j < list1.size() ; j++) {
					if(name2.equals(list1.get(j).getName())) {
						u2 = list1.get(j);
						answer2 = true;
					}
				}
				if(answer1 == false && answer2 == false) {
					System.out.println("Cannot find common friend, cannot find " + name1 + " and " + name2);
				}
				else if(answer1 != false && answer2 == false) {
					System.out.println("Cannot find common friend, cannot find " + name2);
				}
				else if(answer1 == false && answer2 != false) {
					System.out.println("Cannot find common friend, cannot find " + name1);
				}
				else {
					LinkedList2 list2 = friendlist.commonFriends(u1, u2);
					System.out.print("Common Friends between " + name1 + " and " + name2 + " are ");
					Node2 curr = list2.getFront();
					while(curr != null) {
						System.out.print(curr.getUser().toString());
						curr = curr.getNext();
					}	
				}
			}
			else if(num == 10) {
				User u = null;
				System.out.print("OUTPUT\n\nEnter the name of the user: ");
				String name = keyboard.next();
				boolean answer = false;
				for(int i = 0; i < list1.size() ; i++) {
					if(name.equals(list1.get(i).getName())) {
						u = list1.get(i);
						answer = true;
						break;
					}
				}
				if(answer == false) {
					System.out.println("Cannot find the oldest of this user, cannot find this user");
				}
				else {
					User oldest = u.OldestFriend();
					System.out.println("The oldest friend of " + name + "  is " + oldest.getName());
				}
			}
			else if(num == 11){
				User u = friendlist.oldestFriends();
				System.out.print("OUTPUT\n\nUser(s) " + u.getName() + " have the oldest friend");
			}
			System.out.print("\n\nWelcome to FriendList! What would you like to do (press a number)?\n1.Print out all the users.\n2.Print the total number of users.\n3.Print out all the friends of a user.\n4.Add a new user.\n5.Remove a user.\n6.Add a friend.\n7.Remove a friend.\n8.Print the user with most friends.\n9.Find common friends between two friends.\n10.Find the oldest friend for a user.\n11.Find the user with the oldest friend on FriendList.\n12. Quit.\nSelection: ");
			num = keyboard.nextInt();
		}
	}
}
