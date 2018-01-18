package com.cui.csci1101.assignment3;

public class Seat 
{
    private int row;
    private int column;
    private boolean status;
	public Seat(int row, String column) 
	{
		this.row = row;
		if(column.equals("A"))
			this.column = 1;
		else if(column.equals("B"))
			this.column = 2;
		else if(column.equals("C"))
			this.column = 3;
		else if(column.equals("D"))
			this.column = 4;
		else if(column.equals("E"))
			this.column = 5;
		else
			this.column = 6;
		this.status = false;
	}
	public int getRow() //get method
	{
		return row;
	}
    public int getColumn() 
    {
		return column;
	}
	public boolean isStatus() 
	{
		return status;
	}
	public void setStatus(boolean status) // set method
	{
		this.status = status;
	}
	public boolean getStatus() 
	{
		return status;
	}
}
