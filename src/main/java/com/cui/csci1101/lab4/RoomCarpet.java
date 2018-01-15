package com.cui.csci1101.lab4;

public class RoomCarpet
{
   private RoomDimension room; 
   private double carpetCost;//instance variable
   private double totalCost;
   public RoomCarpet(RoomDimension r, double cost)
   {
      room = r;
      carpetCost = cost;
   }   
   public void setTotalCost()//calculate the totalcost
   {
      totalCost = room.getLength() * room.getWidth() * carpetCost;
   }
   public double getTotalCost()//return the totalcost
   {
      return totalCost;
   }
   public String toString()
   {
      setTotalCost();
      return room.toString() + "  Carpet Cost ($per sq.ft): " + this.carpetCost + "  Total cost ($):" + totalCost;
   }
   public boolean costsMore(RoomCarpet c)
   {
      setTotalCost();
      c.setTotalCost();
      if(this.totalCost > c.totalCost)//Comparing the totalcost with another object
         return true;
      else 
         return false;
   }             
}   
   