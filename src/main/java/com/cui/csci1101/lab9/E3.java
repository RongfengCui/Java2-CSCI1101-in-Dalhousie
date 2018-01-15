package com.cui.csci1101.lab9;

import java.util.*;
import java.io.*;
public class E3 {
	public static void main(String[] args) throws IOException {
		ArrayList<Integer> list = new ArrayList<Integer>();
		System.out.print("Enter the name of the file to write into: ");
		Scanner keyboard = new Scanner(System.in);
		String filename = keyboard.nextLine();
		PrintWriter outputFile = new PrintWriter(new FileWriter(filename));
		Random random = new Random();
		File inFile = new File(filename);
		for(int i = 0; i < 100; i++) {
			int randNum = random.nextInt(1000) + 1; //random a number from 1 to 1000
			outputFile.println(randNum); //add the random number to outputfile
		}
		outputFile.close();
		Scanner input = new Scanner(inFile);
		while(input.hasNext()) {
			int num = input.nextInt();
			list.add(num); // add num to list
		}
		input.close();
		int count = 0;
		int size = list.size();
		while(count < size) {	
			int biggest = list.get(0);
			for(int i = 1; i < list.size(); i++) {
				if(biggest < list.get(i)) {
					biggest = list.get(i); // find the biggest number
				}
			}
			System.out.print(biggest + " ");// display the biggest number
			list.remove(new Integer(biggest)); // remove the biggest number
			count++;
		}	
	}
}	
