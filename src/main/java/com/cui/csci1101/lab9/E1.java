package com.cui.csci1101.lab9;

import java.util.*;
import java.util.Scanner;
import java.io.*;
public class E1 {
	public static void main(String[] args) throws IOException {
		ArrayList<String> list = new ArrayList<String>();
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter the name of the file to read from: ");
		String filename1 = keyboard.nextLine();
		System.out.print("Enter the String to remove: ");
		String name= keyboard.nextLine();
		System.out.print("Enter the name of the file to write into: ");
		String filename2 = keyboard.nextLine();
		File inFile1 = new File(filename1); // create a file
		File inFile2 = new File(filename2);
		Scanner input1 = new Scanner(inFile1);
		PrintWriter outputFile = new PrintWriter(new FileWriter(filename2));
		System.out.println("below is the file --> " + filename1);
		while(input1.hasNext()){
			String line = input1.nextLine();
			list.add(line); //add line to arraylist
			System.out.println(line); //print the line
		}
		input1.close();
		Scanner input2 = new Scanner(inFile2);
		for(int i = 0; i < list.size(); i++) {	
			if(!list.get(i).equals(name)) {
				outputFile.println(list.get(i)); //add the value of arralylist to file2
			}
		}
		outputFile.close();
		System.out.println("\nbelow is the file --> " + filename2);
		while(input2.hasNext()) {
			String line1 = input2.nextLine();
			System.out.println(line1); //display the file2
		}
		input2.close();
	}
}
	