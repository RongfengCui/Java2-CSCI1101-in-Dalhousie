package com.cui.csci1101.lab2;

//Bug.java
public class Bug
{
   //instance variable
   private int position;
   private int direction;
   //constructor
   public Bug(int position, int direction)
   {
      this.position = position;
      this.direction = direction;
   }
   //get,set and other methods
   public void setPosition(int position)//create a setPostion method to store the value of position 
   {
      this.position = position;
   }
   public void setDirection(int direction)
   {
      this.direction = direction;
   }
   public int getPosition()
   {
      return position;//return the value
   }
   public int getDirection()
   {
      return direction;
   }   
   public void move()
   {
      if(direction == 0 && position > 0)
      {
         position -= 1;
      }
      else if(direction == 0 && position == 0) 
      {
         position += 1;
         direction = 1;
      }        
      else if(direction == 1 && position < 50)
      {
         position += 1;
      }
      else
      {
         position -= 1;
         direction = 0;
      }
   }
   public String toString()
   {      
      if(direction == 1)
         return "Position: " + position + " Direction: Right";
      else
         return "Position: " + position + " Direction: Left";
   }
}   
            
         