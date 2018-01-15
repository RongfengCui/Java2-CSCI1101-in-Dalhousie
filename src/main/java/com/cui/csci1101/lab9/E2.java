package com.cui.csci1101.lab9;

import java.util.ArrayList;
import java.util.Scanner;
import java.net.URL;
import java.io.*;
public class E2{
	public static void main(String[] args) throws Exception{
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter a URL: ");
		String URLString = keyboard.nextLine();
		System.out.print("Enter a word that you want to search: ");
		String word = keyboard.nextLine();
		URL url = new URL(URLString);
		Scanner input = new Scanner(url.openStream()); //scan the url
		int count = 0;
		while (input.hasNext()){
			String line = input.next(); //get each word
			if(line.equals(word)) //if two words are equal
				count++; //add one to count
		}		
		System.out.println("The word " + word + " appears " + count + " in this web content");		
	}
}
