package com.cui.csci1101.lab2;

import java.util.Scanner;
public class Rectangle2DDemo
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      System.out.print("Enter the xpos, ypos, width and height of the rectangle: ");
      double xpos = keyboard.nextDouble();
      double ypos = keyboard.nextDouble();
      double width = keyboard.nextDouble();
      double height = keyboard.nextDouble();
      Rectangle2D rec1 = new Rectangle2D(xpos, ypos, width, height);
      Rectangle2D rec2 = new Rectangle2D(4, 5, 10.5, 3.2);//enter the perimeter into this object
      System.out.println("The perimeter of the rectangle is " + 2 * (rec1.getWidth() + rec1.getHeight()));
      System.out.println("The area of the rectangle is " + rec1.getWidth() * rec1.getHeight());
      if(rec1.contains(3,3))//determine whether it contains or not
      {
         System.out.print("Rectangle [[" + rec1.getXpos() + "," + rec1.getYpos() + "],width=" + rec1.getWidth() + ",height=" + rec1.getHeight() + "] contains point [3,3]");
      }
      else
      {
         System.out.print("Rectangle [[" + rec1.getXpos() + "," + rec1.getYpos() + "],width=" + rec1.getWidth() + ",height=" + rec1.getHeight() + "] does not contain point [3,3]");
      }
      if(rec1.contains(rec2))
      {
         System.out.print("[[" + rec1.getXpos() + "," + rec1.getYpos() + "],width=" + rec1.getWidth() + ",height=" + rec1.getHeight() + "] contains Rectangle[[" + rec2.getXpos() + "," + rec2.getYpos() + "],width=" + rec2.getWidth() + ",height=" + rec2.getHeight() + "]");
      }
      else
      {
         System.out.print("[[" + rec1.getXpos() + "," + rec1.getYpos() + "],width=" + rec1.getWidth() + ",height=" + rec1.getHeight() + "] does not contain Rectangle[[" + rec2.getXpos() + "," + rec2.getYpos() + "],width=" + rec2.getWidth() + ",height=" + rec2.getHeight() + "]"); 
      }
   }
}                            