package com.cui.csci1101.lab7;

import java.util.Scanner;
public class Demo2
{
	public static void main(String[] args)
   {
      Scanner kb = new Scanner(System.in);
      System.out.print("please enter the word that you want to search: "); // let user to input the word
      String w = kb.nextLine();
      LinkedList2 l = new LinkedList2();
      l.addToFront("bed"); // add a new node to the front
      l.addToFront("bad");
      l.addToFront("bare");
      l.addToFront("baby");
      System.out.println("The list is ");
      l.enumerate();
      System.out.println("All the indices of nodes with " + w + " is");
      l.listAllNodesWith(w);
   }
}