package com.cui.csci1101.assignment1;

import java.util.Scanner;
//Hangmandemo.java
public class Hangmandemo
{  
   public static void main(String[] args)
   {
      System.out.println("Welcome to Hangman game.");
      System.out.println("I have a secret Pokemon character name. You have to guess it.");
      System.out.println("You are allowed only six incorrect guesses");
      Hangman p = new Hangman();
      p.generateSecretWord();
      p.setG(0);
      p.setI(6);//set the number of incorrect to 6
      int numGuess = 0;
      char [] guess = new char[26];
      boolean g = true;
      while(p.isFound() == false && p.getI() > 0)
      {
         Scanner kb = new Scanner(System.in);
         System.out.println("Secret word:\t" + p.getSD());
         System.out.print("Enter a guess: ");
         String w = kb.nextLine();
         char c = w.charAt(0);
         g = true;//set it to ture
         for(int i=0;i<guess.length;i++)
         {
            if(c == guess[i])
               g = false;
         }
         if(g)
         {
            if(p.makeGuess(c))
            {
               System.out.println("Correct.");
               for(int i=0;i<p.getW().length;i++)
               {
                  if(c == p.getW()[i])
                     p.getD()[i] = c;
               }
            }
            else
            {
               p.setI(p.getI() - 1);//incorrect should left -1
               System.out.println("Incorrect. You have " + p.getI() + " left");
            }    
         }
         else
         {
            System.out.println("You already guessed " + c + ". Choose another letter.");
         }
         guess[numGuess] = c;
         numGuess++;   
      }
      System.out.println("Secret word:" + p.getSW());
      if(p.isFound() != false)
         System.out.println("You win!");
      else
         System.out.println("You Lose!");

   } 
}