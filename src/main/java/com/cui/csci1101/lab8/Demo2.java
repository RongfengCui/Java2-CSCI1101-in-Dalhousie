package com.cui.csci1101.lab8;

public class Demo2 
{
	public static void main(String[] args)
	{
	   LinkedList1 list1 = new LinkedList1();
	   list1.addToEnd("3");// add a new node to the front
	   list1.addToEnd("4");
	   list1.addToEnd("5");
	  	list1.addToEnd("6");
	   list1.enumerate();
	   if(list1.getFront() == null || list1.getFront().getNext() == null) // if there is just one node, node is not enough
		{
			System.out.println("Node is not enough!");
		}
	   else
		{  
			Demo2.reverse(list1);
			list1.enumerate();
		}	  
   }
	public static void reverse (LinkedList1 list) 
	{ 
		for(int i = 1; i <= list.getCount()/2; i++) // how many times should reverse
		{
			Node curr1 = list.getFront();
			Node curr2 = list.getFront();
			int n = 1;
			int p = 1;
			while(p < i) //the node that the curr1 should go, and curr1 stand for first half of the node
			{
				curr1 = curr1.getNext();
				p++;
			}			   
			while(n <= list.getCount() - i) //the node that the curr1 should go, and curr1 stand for last half of the node
			{
				curr2 = curr2.getNext();
				n++;
			}
			String s = curr1.getData();
			curr1.setData(curr2.getData());
			curr2.setData(s);		   
		}		   
	}
}
