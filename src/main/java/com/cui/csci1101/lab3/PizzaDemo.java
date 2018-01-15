package com.cui.csci1101.lab3;

//PizzaDemo.java
public class PizzaDemo
{
   public static void main(String []args)
   {
      PizzaStand.cost(5);
      PizzaStand p1 = new PizzaStand(1);
      PizzaStand p2 = new PizzaStand(2);
      PizzaStand p3 = new PizzaStand(3);
      PizzaStand p4 = new PizzaStand(4);
      PizzaStand p5 = new PizzaStand(5);
      p1.justSold();//calling the justSold method, if stand1 sold one pizza
      p1.justSold();//calling the method again
      p2.justSold();//calling the justSold method, if stand2 sold one pizza
      p3.justSold();
      p4.justSold();
      p5.justSold();
      System.out.println("Pizza Sales");
      System.out.println(p1.getId() + "   " + p1.getSold() + "\n");
      System.out.println(p2.getId() + "   " + p2.getSold() + "\n");
      System.out.println(p3.getId() + "   " + p3.getSold() + "\n");
      System.out.println(p4.getId() + "   " + p4.getSold() + "\n");
      System.out.println(p5.getId() + "   " + p5.getSold() + "\n");
      System.out.println("Total pizzas sold: " + PizzaStand.getTotalSold());
      System.out.println("Total sales: $" + PizzaStand.getTotalCost() + "\nProcess completed.");
   }
}      
      
      
      
      
      
       
      