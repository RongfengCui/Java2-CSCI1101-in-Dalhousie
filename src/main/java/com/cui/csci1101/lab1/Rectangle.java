package com.cui.csci1101.lab1;

//Rectangle.java
public class Rectangle
{
   private int width;
   private int height;
   //Constructor
   public Rectangle(int w, int h)
   {
      width = w;
      height = h;
   }
   public void setWidth(int w)//create a setWidth method to store the width 
   {
      width = w;
   }
   public void setHeight(int h)
   {
      height = h;
   }
   public int getWidth()//create a getWidth method to get the width value
   {
      return width;//return the value
   }
   public int getHeight()
   {
      return height;
   }   
   public int findPerimeter()//use findPerimeter method to get the perimeter
   {
      return 2 * width + 2 * height;
   }
   public int findArea()
   {
      return width * height;
   }    
   //toString method
   public String toString()
   {
      return "Rectangle: [Width: " + width + ", Height:" + height + "]";
   }   
}    