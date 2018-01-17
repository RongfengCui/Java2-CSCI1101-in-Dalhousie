package com.cui.csci1101.assignment1;

import java.util.Arrays;
public class Hangman
{
   //instance variable
   private String [] secretWordDictionary = {"bulbasaur","ivysaur","venusaur","charmander","charmeleon","charizard","squirtle","wartortle","blastoise","caterpie","metapod","butterfree","weedle","kakuna","beedrill","pidgee","pidgeotto","pidgeot","rattata","raticate","spearow","fearow","ekans","arbok","pikachu"};
   private char [] word;
   private char [] disguised;
   private int incorrect;
   private int totalG;
   //no-args constructors
   public Hangman()
   {      
   }
   public char [] getW()
   {
      return word;
   }
   public String getSW()
   {
      String w = new String(word);
      return w;
   }
   public char [] getD()
   {
      return disguised;
   }
   public String getSD()
   {
      String s = new String(disguised);
      return s;
   }
   public int getI()
   {
      return incorrect;
   }
   public int getG()
   {
      return totalG;
   }
   public void setS(char[] s)//set secret word
   {
      word.equals(s);
   }
   public void setD(char[] d)
   {
      disguised.equals(d);
   }
   public void setG(int g) //set the number of total guess
   {
      totalG = g;
   }
   public void setI(int i)
   {
      incorrect = i;
   }
   public void generateSecretWord(){// method to create the form of the secret word
      String w = secretWordDictionary[(int)(Math.random()*24)];
      this.word = w.toCharArray();
      this.disguised = new char[w.length()];
      for(int i=0;i<word.length;i++)
         disguised[i] = '?';//make the disguised to ?
   }
   public boolean makeGuess(char c)
   {
      boolean result = false;     
      for(int i=0;i<word.length;i++)
      {  
         if(c == word[i])
            result = true;   
      }
      return result;
   }
   public boolean isFound()
   {
      String w = new String(word);
      String d = new String(disguised);
      return(d.equals(w));
   }
}
   