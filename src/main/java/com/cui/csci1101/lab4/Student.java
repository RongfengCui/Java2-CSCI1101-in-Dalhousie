package com.cui.csci1101.lab4;

public class Student extends Person
{
   private int studentNumber;
   public Student()
   {
   }
   public void reset(String newName, int newNumber)
   {
      setName(newName);//inheritence from the person class 
      studentNumber = newNumber;
   }    
   public int getStudentNumber()
   {
      return studentNumber;
   }
   public void setStudentNumber(int n)
   {
      studentNumber = n;
   }
   public String toString() 
   { 
      return "Student " + getName() + " has student number: " + studentNumber;
   }
 
  public boolean equals(Student anotherStudent)//comparing the name and number with another object
  {
      return(hasSameName(anotherStudent) == true && this.studentNumber == anotherStudent.getStudentNumber());
  }
}    
