package com.cui.csci1101.lab4;

public class Person
{
   private String name; 
   public Person()//no-args constructor
   {
   }
   public void setName(String newName)//set the name
   {
      name = newName;
   }   
   public String getName()
   {
      return name;
   }   
   public String toString()
   {
      return name;
   }   
   public boolean hasSameName(Person anotherPerson)//comparing the name
   {
      if(this.name.equals(anotherPerson.getName()))
         return true;
      else
         return false;
   }         
}