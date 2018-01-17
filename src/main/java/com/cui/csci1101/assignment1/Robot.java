package com.cui.csci1101.assignment1;

public class Robot
{
   private String name;  
   private int x;
   private int y;
   private int dirct;
   private int point;
   public Robot(String name, int dirct)
   {
      this.name = name;
      this.dirct = dirct;
      x = 1;
      y = 1;
      point = 2;
   }
   public void setX(int x)//Creating a set method
   {
      this.x = x;
   }
   public void setY(int y)
   {
      this.y = y;
   }
   public void setPoint(int p)
   {
      point = p;
   }
   public void setDirection(int d)
   {
      dirct = d;
   } 
   public String getName()
   {
      return name;
   }   
   public double getX()
   {
      return x;
   }
   public double getY()
   {
      return y;
   }   
   public double getPoint()
   {
      return point;
   }  
   public double getDirct()
   {
      return dirct;
   }
   public void move(int m)
   {
      int move = m;
      if(dirct == 1 && (move + y) <= 8)
      {
        y = y + move;
        point = point + y + x;
      }
      else if(dirct == 2 && (move + x) <= 8)
      {
         x = x + move;
         point = point + x + y;
      }
      else if(dirct == 3  && (move + x) <= 8 && (move + y) <= 8)
      {
         x = x + move;
         y = y + move;
         point = point + y + x;
      }
      else
      {  
      }
   }
   public void deDuct(Robot r,int s)
   {
      if(this.x!=8&&this.y!=8)
      {
         if(this.getX() == r.getX() && this.getY() == r.getY())
         {
            if(dirct == 1)
            {
               point = point - x - y;//deduct point
               y -= s;//back to previous loaction
               point=point-x-y;//subract point added
            }
            else if(dirct == 2)
            {
               point = point - x - y;
               x -= s;
               point = point - x - y;
            }
            else if(dirct == 3)
            {
               point = point - x - y;
               y -= s;
               x -= s;
               point = point - x - y;
            }
         }
      }
   }
   public String toString()
   {
      if(this.dirct == 1)
         return this.name + " (" + this.x + "," + this.y + ") " + "Up    " + this.point + " points";
      else if(this.dirct == 2)
         return this.name + " (" + this.x + "," + this.y + ") " + "Right " + this.point + " points";
      else
         return this.name + " (" + this.x + "," + this.y + ") " + "Diag  " + this.point + " points";
   }
   public boolean amIAhead(Robot r)
   {
      double a = Math.pow((this.y - 8),2);
      double b = Math.pow((this.x - 8),2);
      double c = Math.pow((r.getY() - 8),2);
      double d = Math.pow((r.getX() - 8),2);
      if(Math.sqrt(a + b) < Math.sqrt(c + d))
         return true;
      else 
         return false;
   }     
}                     
      
         
           