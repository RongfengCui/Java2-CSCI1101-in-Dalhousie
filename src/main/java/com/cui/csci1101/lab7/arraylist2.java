package com.cui.csci1101.lab7;

import java.util.*;
import java.util.Scanner;
public class arraylist2 
{
   public static void main(String[] args) 
   {
      ArrayList<String> list1 = new ArrayList<String>();// create an arraylist      
      ArrayList<String> list2 = new ArrayList<String>();
      Scanner kb = new Scanner(System.in);
      System.out.println("Enter words on different line, end with -1: ");
      String word1 = kb.next();
      int a = 0;
      while(!word1.equals("-1")) 
      {
	      list1.add(a,word1); //add each word to list1
			a++;
			word1 = kb.next();
      }
      System.out.println("[Empty]"); //first line of output is [Empty]
      int size = list1.size();
      int n = 0;
      int j = 0;
      while(n < size) //this while loop is to control how many lines should print
      {       
         String s = list1.get(j); // let s equals to list1.get(0)
         for(int i=1; i<list1.size(); i++)
         {         
            if(s.compareTo(list1.get(i)) < 0)
            {
                  s = list1.get(i);
                              
            }               
         }
         list2.add(0,s); // add the string to list2
         list1.remove(s); //Also, remove the string from list1
         System.out.println(list2);
         n++;
         j = 0;
      }   
   }
}        
      
         
            
               
            
               
    