package com.cui.csci1101.lab5;

import java.util.Scanner;
public class TwoDArray
{
   public static void main(String[] args)
   {
      int x = 0;
      int z = 0;
      int row = 0;
      int column = 0;
      int diagonal1 = 0;
      int diagonal2 = 0; 
      int[][] a = new int[8][8]; //create an 2D array and sizee is 8.
      System.out.print("Checker Board\n");
      for(int i = 0; i < 8; i++)// create the Checker Board of row
      {
         for(int j = 0; j < 8; j++)// create the Checker Board of column
         {
            a[i][j] = (int)(Math.random()*2);//random a number between 0 and 1
            System.out.print(a[i][j]);
         }   
         System.out.print("\n");
      }
      System.out.println("All zeros:");
      for(int i=0;i<8;i++)
      {
         int s = 0;
         for(int j = 0; j < 8 && s == 0; j++)
         {
            s = a[i][j];
            if(j == 7)// if j equals to 7 and we need to judge the value in this situation
            {
               if(a[i][7] == 0)
               {
                  row++;
                  System.out.println("Row" + (i + 1));
               }   
            }
         }
      }
      for(int j=0;j<8;j++)
      {
         int y = 0;
         for(int i = 0; i < 8 && y == 0; i++)
         {
            y = a[i][j];
            if(i == 7)
            {
               if(a[7][j] == 0)
               {
                  column++;
                  System.out.println("Column" + (j + 1));
               }   
            }
         }
         
      }
      for(int j = 0; j < 8 && x == 0; j++)
      {
         int i = j;
         x = a[i][j];//check Sub-diagonal left to right
         if(j == 7)
         {
            if(a[7][7] == 0)
            {
               diagonal1++;
               System.out.println("Sub-diagonal left to right");
            }   
               
         }
      }
      for(int j = 0; j < 8 && z == 0; j++)
      {
         int i = 7;
         i--;
         z = a[i][j];// check Sub-diagonal right to left
         if(i == 0)
         {
            if(a[0][7] == 0)
            {
               diagonal2++;
               System.out.println("Sub-diagonal right to left");
            }   
         } 
      }
      if(row == 0 && column == 0 && diagonal1 == 0 && diagonal2 == 0)
         System.out.println("Sorry, Cannot satisfy any situations");
   }
}              
            
      
         
            
         
         
         
                   
            
            
      
      
      
      