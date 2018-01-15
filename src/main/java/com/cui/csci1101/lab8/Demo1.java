package com.cui.csci1101.lab8;

public class Demo1
{
   public static void main(String[] args)
   {
      LinkedList1 list1 = new LinkedList1();
      LinkedList1 list2 = new LinkedList1();
      LinkedList1 list3 = new LinkedList1();
      list1.addToEnd("1"); // add a new node to the front
      list1.addToEnd("2");
      list1.addToEnd("3");
      list1.addToEnd("4");
      list2.addToEnd("5"); // add a new node to the front
      list2.addToEnd("6");
      list2.addToEnd("7");
      list2.addToEnd("8");
      list2.addToEnd("9");     
      list1.enumerate();
      list2.enumerate();
      list3.setFront(Demo1.interleave(list1, list2).getFront());
      list3.enumerate();     
   }
   public static LinkedList1 interleave(LinkedList1 list1, LinkedList1 list2) 
   { 
      LinkedList1 list3 = new LinkedList1();
      if(list1.getFront() == null && list2.getFront() == null)// if the front of both two node are none, just print
      {
         System.out.println("Both empty lists!");
      }
      else if(list1.getFront() == null && list2.getFront() != null)// if list2 are none, set front to list2
      {
         list3.setFront(list2.getFront());
      }
      else if(list1.getFront() != null && list2.getFront() == null)
      {
         list3.setFront(list1.getFront());
      }
      else
      {        
         Node curr2 = list2.getFront();
         Node curr1 = list1.getFront();
         while(curr1 != null || curr2 != null)
         {              
            if(curr1 == null && curr2 != null)
            {
               while(curr2 != null)
               {     
                  list3.addToEnd(curr2.getData()); 
                  curr2 = curr2.getNext();
               }
            }      
            else if(curr2 == null && curr1 != null)
            {
               while(curr1 != null)
               {
                  list3.addToEnd(curr1.getData());
                  curr1 = curr1.getNext();
               }
            }      
            else // if curr1!=null and curr2!=null
            {               
               list3.addToEnd(curr1.getData());//add curr1 to end
               list3.addToEnd(curr2.getData());  
               curr1 = curr1.getNext();//curr1 should go to next node
               curr2 = curr2.getNext();
            }
         }
      }
      return list3;     
   }  
}