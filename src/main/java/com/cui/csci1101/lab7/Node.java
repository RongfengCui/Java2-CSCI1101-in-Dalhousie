package com.cui.csci1101.lab7;

public class Node
{
   private String data;
   private Node next;
   public Node(String d, Node n) // constructor
   {
      data = d;
      next = n;
   }
   public String getData() // get method
   {
      return data;
   }
   public Node getNext()
   {
      return next;
   }
   public void setData(String d) //set method
   {
      data = d;
   }
   public void setNext(Node n)
   {
      next = n;
   }
   public String toString() // toString method
   {
      return data + "-->";
   }
}      
         
         
        
            