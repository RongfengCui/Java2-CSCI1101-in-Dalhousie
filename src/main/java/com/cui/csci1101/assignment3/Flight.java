package com.cui.csci1101.assignment3;

import java.util.ArrayList;

public class Flight {
	private Airline airline;
	private Airport airport1;
	private Airport airport2;
	private String id;
	private int row;
   private ArrayList<Seat> seats;
	public Flight(Airline airline, Airport airport1, Airport airport2, String id) 
	{
		this.airline = airline;
		this.airport1 = airport1;
		this.airport2 = airport2;
		this.id = id;
		row = 0;
		seats = new ArrayList<Seat>();
	}
	public Airline getAirline() //get method
	{
		return airline;
	}
	public void setAirline(Airline airline) //set method
	{
		this.airline = airline;
	}
	public Airport getAirport1() 
	{
		return airport1;
	}
	public void setAirport1(Airport airport1) 
	{
		this.airport1 = airport1;
	}
	public Airport getAirport2() {
		return airport2;
	}
	public void setAirport2(Airport airport2) {
		this.airport2 = airport2;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public ArrayList<Seat> getSeats() {
		return seats;
	}
	public void setSeats(ArrayList<Seat> seats) {
		this.seats = seats;
	}
	public int getRow() {
		return row;
	}
	public void setRow(int row) {
		this.row = row;
	}
	public String toString() {
		return airline.getN() + id + " from " + airport1.getName() + " to " + airport2.getName();
	}
    

}
