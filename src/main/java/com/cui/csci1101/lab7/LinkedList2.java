package com.cui.csci1101.lab7;

public class LinkedList2
{
   private Node front;
   private int count;
   public LinkedList2()
   {
      front = null;
      count = 0;
   }   
   public void addToFront(String d)
   {
      Node n = new Node(d, front); // create a new object from Node class
      front = n; // right now the front node is equal to n
      count++;
   }
   public void listAllNodesWith(String d) 
   {
      int n = 0;
      int num = 0;
      if(count == 0)
      {
         System.out.println("Empty list");
      }
      else
      {
         Node curr = front;
         while(curr != null)
         {
            if(curr.getData().equals(d)) // if the String of current node is equal to d
            {
               System.out.print(num + " "); // print the current num
               curr = curr.getNext(); // let curr equal to next node
               num++;
               n++;
            }
            else
            {
               curr = curr.getNext(); // else just let curr go to next node
               num++;
            }
         }
         if(n == 0)
            System.out.println("Sorry, there is nothing like this");
      }
   }
   public void enumerate() // the enumerate is to demonstrate all the node
   {
      Node n = front;
      while(n != null)
      {
         System.out.print(n);
         n = n.getNext();
      }
      System.out.println("\n");
   }
}         

