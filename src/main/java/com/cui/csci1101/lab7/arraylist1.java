package com.cui.csci1101.lab7;

import java.util.*;
import java.util.Scanner;
public class arraylist1 
{
   public static void main(String[] args) 
   {
      ArrayList<String> list1 = new ArrayList<String>();// create an arraylist
      Scanner kb = new Scanner(System.in);
      System.out.println("Enter words on one line, end with -1");
      String word1 = kb.next();
      int a = 0;
      while(!word1.equals("-1")) 
      {
			   list1.add(a,word1);//add word to list1
			   a++;
			   word1 = kb.next();
      }
      System.out.println("Here's the original list:\n" + list1);     
      for(int i=0; i<list1.size(); i++) 
      {
         for(int j=i+1; j<list1.size(); j++) 
         {
            if(list1.get(i).equals(list1.get(j))) 
            {
               list1.remove(j); // if two words are equal, remove this word from list2
               j--;// this is because after removing, the position of each word would change
            }
         }
      }
      System.out.println("Here's the same list with no duplicates");
      System.out.println(list1);
   }
}     

      

      