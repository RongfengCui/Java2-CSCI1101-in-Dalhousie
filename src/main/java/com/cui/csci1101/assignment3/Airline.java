package com.cui.csci1101.assignment3;


public class Airline 
{
	private String n; //instance variable

	public Airline(String n) 
	{
		this.n = n;		
	}

	public String getN() //get method
	{
		return n;
	}

	public void setN(String n) //set method
	{
		this.n = n;
	}

	public String toString() 
	{
		return n;
	}
}
