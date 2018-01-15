package com.cui.csci1101.lab6;

import java.util.*;
import java.util.Scanner;
public class q2 {
   public static void main(String[] args) {
      ArrayList<String> list1 = new ArrayList<String>();// create a arraylist called list1
      ArrayList<String> list2 = new ArrayList<String>();
      Scanner kb = new Scanner(System.in);
      System.out.println("Enter words on one line, end with -1");
      String word1 = kb.next();
      int a = 0;
      while(!word1.equals("-1")) { //add each word to list1
			   list1.add(a,word1);
			   a++;
			   word1 = kb.next();
      }
		for(int i=0;i<list1.size();i++) { // copy list1 to list2
				list2.add(i,list1.get(i));
		}
      for(int i=0; i<list2.size(); i++) {
         for(int j=i+1; j<list2.size(); j++) {
            if(list2.get(i).equals(list2.get(j))) {
               list2.remove(j); // if two words are equal, remove this word from list2
               j--;// this is because after removing, the position of each word would change
            }
         }
      }
      System.out.println("\nArray List with no duplicates: ");
      System.out.println(list2);
   }
}      