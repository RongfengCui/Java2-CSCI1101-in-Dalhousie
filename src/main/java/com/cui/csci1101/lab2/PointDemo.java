package com.cui.csci1101.lab2;

//PointDemo.java
import java.util.Scanner;//import a Scanner class
public class PointDemo
{
  public static void main(String []args)
  {
    Scanner keyboard=new Scanner(System.in);//create a new Scanner object
    System.out.print("Enter the x and y coordinates of point1: ");
    int x1 = keyboard.nextInt();
    int y1 = keyboard.nextInt();
    System.out.print("Enter the x and y coordinates of point2: ");
    int x2 = keyboard.nextInt();
    int y2 = keyboard.nextInt();
    System.out.print("Enter the x and y coordinates of point3: ");
    int x3 = keyboard.nextInt();
    int y3 = keyboard.nextInt();
    System.out.print("Enter the x and y coordinates of point4: ");
    int x4 = keyboard.nextInt();
    int y4 = keyboard.nextInt();
    Point p1 = new Point(x1,y1);
    Point p2 = new Point(x2,y2);
    Point p3 = new Point(x3,y3);
    Point p4 = new Point(x4,y4);
    if(p1.isHigher(p2) || p1.equals(p2))
    {
       if(p1.isHigher(p3) || p1.equals(p3))
       {
          if(p1.isHigher(p4) || p1.equals(p4))
          {
             System.out.println("[" + x1 + "," + y1 + "] is highest point");
          }
          else
          {
             System.out.println("[" + x4 + "," + y4 + "] is highest point");
          }
       }
       else
       {
          if(p3.isHigher(p4) || p3.equals(p4))
          {
             System.out.println("[" + x3 + "," + y3 +"] is highest point");
          }
          else
          {
             System.out.println("[" + x4 + "," + y4 + "] is highest point");
          }
       }
    }
    else
    {
       if(p2.isHigher(p3) || p2.equals(p3))
       {
          if(p2.isHigher(p4) || p2.equals(p4))
          {
             System.out.println("[" + x2 + "," + y2 + "] is highest point");
          }
          else
          {
             System.out.println("["+x4+","+y4+"] is highest point");
          }
       }
      else
      {
         if(p3.isHigher(p4)||p3.equals(p4))
         {
            System.out.println("["+x3+","+y3+"] is highest point");
         }
         else
         {
            System.out.println("["+x4+","+y4+"] is highest point");
         }
      }
   }
   System.out.println("The distance between [" + x1 + "," + y1 + "] and [" + x2 + "," + y2 + "] is "+p1.findDistance(p2));
   System.out.println("The distance between [" + x3 + "," + y3 + "] and [" + x4 + "," + y4 + "] is "+p3.findDistance(p4)); 
   if(p1.findDistance(p2) > p3.findDistance(p4))//create a if statement
      System.out.println("[" + x1 + "," + y1 + "]-->[" + x2 + "," + y2 + "] is longer than [" + x3 + "," + y3 + "]-->[" + x4 + "," + y4 + "]");
   else if(p1.findDistance(p2)==p3.findDistance(p4))//create a else if statement 
      System.out.println("[" + x1 + "," + y1 + "]-->[" + x2 + "," + y2 + "] is equal to [" + x3 + "," + y3 + "]-->[" + x4 + "," + y4 + "]");
   else//create a else statement
      System.out.println("[" + x1 + "," + y1 + "]-->[" + x2 + "," + y2 + "] is shorter than [" + x3 + "," + y3 + "]-->[" + x4 + "," + y4 + "]");
  }
}
       
       
        
    
        
        
      

