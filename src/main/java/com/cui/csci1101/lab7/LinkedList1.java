package com.cui.csci1101.lab7;

public class LinkedList1
{
   private Node front;
   private int count;
   public LinkedList1()
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
   public void enumerateOddNodes()
   {
      int num = 0;
      if(count == 0) // if count equals to zero, it means there is no node created
      {
         System.out.println("Empty list");
      }
      else
      {
         Node curr = front; // let front equal to curr in order to not change front
         while(curr != null)
         {
            if(num % 2 != 0)
            {
               System.out.print(curr); // if num is odd, print the current node  
               curr = curr.getNext(); // and let curr equal to next node
               num++;
            }
            else
            {
               curr = curr.getNext(); // if num is even, print the current node 
               num++;
            }
         }
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
            