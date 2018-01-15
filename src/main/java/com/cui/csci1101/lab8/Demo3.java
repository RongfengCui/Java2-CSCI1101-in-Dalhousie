package com.cui.csci1101.lab8;

public class Demo3 
{
	public static void main(String[] args)
	{
		LinkedList1 list1 = new LinkedList1();
		list1.addToEnd("1"); // add a new node to the front
		list1.addToEnd("2");
		list1.addToEnd("3");
		list1.addToEnd("4");
      list1.addToEnd("5"); // add a new node to the front
		list1.addToEnd("6");
		list1.addToEnd("7");
		list1.addToEnd("8");
      list1.addToEnd("9");
		list1.enumerate();
		if(list1.getFront() == null)
		{
			System.out.println("Node is not enough!");
		}
		else if(list1.getCount() == 1)
		{
			System.out.println("Just one node");
		}
		else
		{
			Demo3.chopSkip(list1);
			list1.enumerate();	
		}
   }
	public static void chopSkip(LinkedList1 list)
	{
		Node curr = list.getFront();
      if(list.getCount() % 2 == 0)
      {
         while(curr.getNext().getNext()!= null)//if curr is first node,then find the third node
		   {
			   curr.setNext(curr.getNext().getNext()); //let first node connect the third node
			   curr = curr.getNext();// let curr go to the third node
		   }        
		   curr.setNext(null);
      }
      else
      {
         while(curr.getNext() != null)
         {
            if(curr.getNext().getNext()!= null)
		      {
			      curr.setNext(curr.getNext().getNext()); 
			      curr = curr.getNext();
		      }
         }
      }
   }          	
}