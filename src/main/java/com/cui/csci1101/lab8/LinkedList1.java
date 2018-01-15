package com.cui.csci1101.lab8;

public class LinkedList1
{
   private Node front;
   private int count;
   public LinkedList1()
   {
      front = null; 
      count = 0;
   }   
   public Node getFront()
   {
      return front;
   } 
   public int getCount() 
   {
		return count;
	}  
   public void setFront(Node n)
   {
      front = n;
   }
   public void addToEnd(String d)
	{
		Node n = new Node(d, null);//Create a new node
		Node curr = front;
		if(front==null)
			front = n;
		else
		{
			while (curr.getNext()!=null)
			   curr = curr.getNext();
			curr.setNext(n);
		}
		count++;		
	}              
   public void addToFront(String d)
   {
      Node n = new Node(d, front); // create a new object from Node class
      front = n; // right now the front node is equal to n
      count++;
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
            
