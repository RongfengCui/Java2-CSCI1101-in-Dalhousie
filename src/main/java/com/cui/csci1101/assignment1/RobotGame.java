package com.cui.csci1101.assignment1;

import java.util.Scanner;
public class RobotGame
{
   public static void main(String[] args)
   {
      int direct3,direct4;
      System.out.println("Welcome to the Robot Game Simulator!\n");
      Scanner keyboard=new Scanner(System.in);//create a new Scanner object
      System.out.print("Enter the name of the first robot: ");
      String name1 = keyboard.nextLine();
      System.out.print("Enter the direction of the first robot: ");
      String direct1 = keyboard.nextLine();
      System.out.print("Enter the name of the second robot: ");
      String name2 = keyboard.nextLine();
      System.out.print("Enter the direction of the second robot: ");
      String direct2 = keyboard.nextLine();
      if(direct1.equals("Up"))//first somulation started
      {
         direct3 = 1;
         System.out.println("\nSimulation started!\n" + name1 + " (1,1) Up    2 points");
      }
      else if(direct1.equals("Right"))
      { 
         direct3 = 2;
         System.out.println("\nSimulation started!\n" + name1 + " (1,1) Right 2 points");
      }
      else
      {
         direct3 = 3;
         System.out.println("\nSimulation started!\n" + name1 + " (1,1) Diag  2 points");
      }
      if(direct2.equals("Up"))
      {
         direct4 = 1;
         System.out.println("\nSimulation started!\n" + name2 + " (1,1) Up    2 points");
      }   
      else if(direct2.equals("Right"))
      { 
         direct4 = 2;
         System.out.println("\nSimulation started!\n" + name2 + " (1,1) Right 2 points");
      } 
      else
      {
         direct4 = 3;
         System.out.println("\nSimulation started!\n" + name1 + " (1,1) Diag  2 points"); 
      }       
      Robot r1 = new Robot(name1,direct3);// create two object
      Robot r2 = new Robot(name2,direct4);
      while(r1.getX() != 8 || r1.getY() != 8 || r2.getX() != 8 || r2.getY() != 8)// create a while loop to control when program should stop
      {
         System.out.println("\nMove!");
         if(r1.getX() != 8 || r1.getY() != 8)//normal situation, and robot1 is going to start 
         {
            int move1 = (int)(Math.random() * 3 + 1);//get the random of the move 
            r1.move(move1);
            r1.deDuct(r2, move1);//check if need deduct or not
            int dirct1 = (int)(Math.random() * 3 + 1);//get the random of the direction
            r1.setDirection(dirct1);
            System.out.println(r1);
         }
         if(r2.getX() !=8 || r2.getY() != 8)//normal situation, and robot2 is going to start 
         {
            int move2 = (int)(Math.random() * 3 + 1);
            r2.move(move2);
            r2.deDuct(r1,move2);
            int dirct2 = (int)(Math.random() * 3 + 1);
            r2.setDirection(dirct2);
            System.out.println(r2);
         }
         if((r1.getX() == 8 && r1.getY() == 8) || (r2.getX() == 8 && r2.getY() == 8))
         {
            if(r1.getX() == 8 && r1.getY() == 8)//r1 arrive
            {
               System.out.println(r1.getName() + " has reach the goal (" + r1.getPoint() + " points)");
               while(r2.getX() !=8 || r2.getY() != 8)// if robot1 arrive, robot2 will continue to move
               {
                  System.out.println("\nMove!");
                  int move2 = (int)(Math.random() * 3 + 1);
                  r2.move(move2);
                  int dirct2 = (int)(Math.random() * 3 + 1);
                  r2.setDirection(dirct2);
                  System.out.println(r2);
               }
            }         
            if(r2.getX() == 8 && r2.getY() == 8)
            {
               System.out.println(r2.getName() + " has reach the goal (" + r2.getPoint() + " points)");
               while(r1.getX() != 8 || r1.getY() != 8)
               {
                  System.out.println("\nMove!");
                  int move1 = (int)(Math.random() * 3 + 1);
                  int dirct1 = (int)(Math.random() * 3 + 1);
                  r1.move(move1);
                  r1.setDirection(dirct1);
                  System.out.println(r1);
                  if(r1.getX() == 8 && r1.getY() == 8)
                      System.out.println(r1.getName() + " has reach the goal (" + r1.getPoint()+" points)");//r1 finally arrive, and print reaching the goal.              
                  else
                  {
                  }
               }
            } 
         }
         else
         { 
            if(r1.amIAhead(r2))//Comparing which is ahead
               System.out.println(r1.getName() + " ahead!");
            else if(r2.amIAhead(r1))
               System.out.println(r2.getName() + " ahead!");
            else
               System.out.println("Both are at the same distance from the goal!");
         }
      }
      System.out.println("Game Over!");
   }
}
          
    
         
         
         
         
         
         
                
      
      
      
