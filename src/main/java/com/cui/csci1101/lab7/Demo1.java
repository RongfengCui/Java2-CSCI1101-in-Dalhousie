package com.cui.csci1101.lab7;

public class Demo1
{
	public static void main(String[] args)
   {
      LinkedList1 l = new LinkedList1(); // create a new object from LinkedList1
      l.addToFront("a"); // add a new node to the front
      l.addToFront("b");
      l.addToFront("c");
      l.addToFront("s");
      System.out.println("The list is ");
      l.enumerate();
      System.out.println("The odd node is ");
      l.enumerateOddNodes();
   }
}     
      