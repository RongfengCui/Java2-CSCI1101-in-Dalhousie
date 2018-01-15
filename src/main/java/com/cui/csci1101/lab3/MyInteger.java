package com.cui.csci1101.lab3;

public class MyInteger
{
   //instance variable
   private int value;
   //constructors
   public MyInteger(int v)
   {
      value=v;
   }
   public int getValue()
   {
      return value;
   }
   public static boolean isEven(int a)
   {    
      if(a % 2 ==0)
         return true;   
      else
         return false;   
   } 
   public static boolean isOdd(int b)
   {
      if(b % 2 !=0)
         return true;   
      else
         return false;   
   }
   public static boolean isPrime(int c)
   {
      boolean answer = true;
      if(c == 2) // if prime is 2, return true
         return true;
      else if(c < 2)// if prime is 0 or 1, return false
         return false;
      else // else, going to enter a if statement 
      {   
         for(int i = 2; i < c && answer != false; i++)
         {
            if(c % i != 0)
               answer = true;   
            else
               answer =  false;  
         }
         return answer;      
      }
   } 
   public boolean isEven()
   {
      if(value % 2 ==0)
         return true;   
      else
         return false;   
   } 
   public boolean isOdd()
   {
      if(value % 2 !=0)
         return true;   
      else
         return false;  
   }
   public boolean isPrime()
   {
      
      if(value == 2)
         return true;
      else if(value < 2)
         return false;
      else
      {   
      boolean answer = true;
         for(int i = 2; i < value && answer != false; i++)
         {
            if(value % i != 0)
                answer = true;   
            else
               answer =  false;  
         }
         return answer;      
      }
   }
   public static boolean isEven(MyInteger a)
   {
      if(a.getValue() % 2 ==0)
         return true;   
      else
         return false;   
   } 
   public static boolean isOdd(MyInteger a)
   {
      if(a.getValue() % 2 !=0)
         return true;   
      else
         return false;
   }
   public static boolean isPrime(MyInteger a)
   {
      if(a.getValue() == 2)
         return true;
      else if(a.getValue() < 2)
         return false;
      else
      {   
         boolean answer = true;
         for(int i = 2; i < a.getValue() && answer != false; i++)
         {
            if(a.getValue() % i != 0)
                answer = true;   
            else
               answer =  false;  
         }
         return answer;      
      }
   }
   public boolean equals(int p)
   {
      if(this.value == p)
        return true;   
      else
         return false;
   }
   public boolean equals(MyInteger m)
   {
      if(this.value == m.getValue())
         return true;   
      else
         return false;
   }
   public static int parseInt(char[] chars)
   {
      int m = chars.length;
      int answer = 0;
      for(int i=0; i<m; i++)
      {
         answer = answer * 10 + ((int)chars[i] - 48);
      }
      return answer;
   }
   public static int parseInt(String s)
   {
      char[] array= s.toCharArray();
      return parseInt(array);
   }
}         
         
                  