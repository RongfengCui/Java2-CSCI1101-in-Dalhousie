package com.cui.csci1101.lab6;

import java.util.*;
import java.util.Scanner;
public class q1 {
   public static void main(String[] args) {
      ArrayList<String> list1 = new ArrayList<String>();//create a arraylist called list1
      ArrayList<String> list2 = new ArrayList<String>();
      ArrayList<String> list3 = new ArrayList<String>();
      Scanner kb = new Scanner(System.in);
      System.out.println("Enter words on one line, end with -1");
      String word1 = kb.next();
      int a = 0;
      while(!word1.equals("-1")) {
			   list1.add(a,word1);//add each word to list1
			   a++;
			   word1 = kb.next();
      }
	   System.out.println("Enter words on one line, end with -1");
	   String word2 = kb.next();
	   a = 0;
	   while(!word2.equals("-1")) { //same as list1
	   list2.add(a,word2);
	   a++;
	   word2 = kb.next();
      }
      System.out.println(list1);
	   System.out.println(list2);
      for(int i=0; i<list1.size(); i++) { //create a for loop
         for(int j=0; j<list2.size(); j++) {
            if(list1.get(i).equals(list2.get(j))) {// comparing two arraylists, if two words are equal, add to list3
               list3.add(list1.get(i));
            }
         }
      }
      for(int i=0; i<list3.size(); i++) {
         for(int j=i+1; j<list3.size(); j++) {
            if(list3.get(i).equals(list3.get(j))) {
               list3.remove(j); // if two words are equal, remove this word from list2
               j--;// this is because after removing, the position of each word would change
            }
         }
      }
      System.out.println("Array List with common strings: ");
      System.out.println(list3);            
   }
}   
   
            
         
      
   

   