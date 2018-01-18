package com.cui.csci1101.assignment3;
import java.util.*;
public class SystemManager 
{
	private ArrayList<Airline> airlines;
	private ArrayList<Airport> airports;
	private ArrayList<Flight> flights;
	public SystemManager() 
	{
	    airlines = new ArrayList<Airline>();
		airports = new ArrayList<Airport>();
		flights = new ArrayList<Flight>();
	}
	 
	public ArrayList<Airline> getAirlines() //get method
	{
	    return airlines;
	}

	public void setAirlines(ArrayList<Airline> airlines) //set method
	{
		this.airlines = airlines;
	}

	public ArrayList<Airport> getAirports() 
	{
		return airports;
	}

	public void setAirports(ArrayList<Airport> airports) 
	{
		this.airports = airports;
	}

	public ArrayList<Flight> getFlights() 
	{
		return flights;
	}

	public void setFlights(ArrayList<Flight> flights) 
	{
		this.flights = flights;
	}

	public void createAirport(String n)
	{
		 if(n == null || n.length() != 3)
		 {
			 System.out.println("Sorry, " + n + " is error! the airport name must have exactly three characters");
			 return;
		 }
		 for(int i = 0; i < n.length(); i++)
		 {
			char char1 = n.charAt(i);//find each character
			if(char1 < 'A' || char1 > 'Z') // if this character is not A to Z
			{
				System.out.println("sorry, " + n + " is invalid! character must be upper case letter`.");
				return;
			}
		 }
		 if(airports == null) // if the airport is null
		 {
			 Airport airport1 = new Airport(n);
			 airports.add(airport1);
			 System.out.println("Ok, create an airport called " + airport1.getName());
		 }
		 else
		 {
			 int p = 0;
			 for(int i = 0; i< airports.size(); i++)
			 {
				 if(n.equals(airports.get(i).getName())) // if we find this airport just stop for loop
				 {
					 p++;
					 break;
				 }
			 }
			 if(p == 0) //if p = 0, that's means we find this airport
			 {
				 Airport airport1 = new Airport(n);
				 airports.add(airport1);
				 System.out.println("Ok, create an airport called " + airport1.getName());
			 }
			 else
			 {
				 System.out.println("Sorry! " + n + " airport is already exist, cannot add.");
			 }
		 }
	 }
	 public void createAirline(String n)
	 {
		 if(n == null || n.length() > 6) // if the character is more than 6 or it's null, just return.
		 {
			 System.out.println("Sorry, " + n + " is error! the airline name must have a length less than 6");
			 return;
		 }
		 if(airlines == null)
		 {
			 Airline airline1 = new Airline(n);
			 airlines.add(airline1);
			 System.out.println("Ok, create an airline called " + airline1.getN());
		 }
		 else
		 {
			 int p = 0;
			 for(int i = 0; i< airlines.size(); i++)
			 {
				 if(n.equals(airlines.get(i).getN())) //if the airline has already exist
				 {
					 p++;
				 }
			 }
			 if(p == 0)
			 {
				 Airline airline1 = new Airline(n);
				 airlines.add(airline1); //add airline1 object to arraylist
				 System.out.println("Ok, create an airline called " + airline1.getN());
			 }
			 else
			 {
				 System.out.println("Sorry! " + n + " airline is already exist, cannot add.");
			 }
		 }	 
	 }
	 public void createFlight(String aname,	String orig, String	dest, String id)
	 {
		 
		 boolean answer = false;
		 boolean answer1 = false;
		 boolean answer2 = false;
		 boolean answer3 = false;
		 Airline airline = null;
		 Airport airport1 = null;
		 Airport airport2 = null;
		 if(aname == null || orig == null || dest == null || id == null)
		 {
			 System.out.println("invalid input!");
			 return;
		 }
		 if(orig.equals(dest)) // if two airport are equal
		 {
			System.out.println("Sorry! invalid!" + " Both " + orig + " and " + dest + " Cannot create, originating airport and destination airport are same place.");
			return;
		 }
		 for(int i = 0; i< airlines.size() && answer != true; i++)
		 {
			if(aname.equals(airlines.get(i).getN())) // finding airline
			{	
				answer = true;
				airline = airlines.get(i);
				
			}
		 }
		 if(answer == false)
		 {
			 System.out.println("Sorry!" + aname + " Cannot create! we cannot find this airline.");
		 }
		 else
		 {
			 for(int j = 0; j< airports.size() && answer1 != true; j++) // finding original airport
			 {
				 if(orig.equals(airports.get(j).getName()))
				 {
					 answer1 = true;
					 airport1 = airports.get(j);
				 }	 
			 }
			 if(answer1 == false)
			 {
				 System.out.println("Sorry! we cannot create flight " + aname + id + " , because " +orig + " is error! we cannot find this airport.");
			 }
			 else
			 {
				  for(int s = 0; s< airports.size() && answer2 != true; s++)
				  {
					  if(dest.equals(airports.get(s).getName())) // finding destination airport
					  {
						  answer2 = true;
						  airport2 = airports.get(s);
					  }
				  }
				  if(answer2 == false)
				  {
					  System.out.println("Sorry! we cannot create flight " + aname + id + " , because " + dest + " is error! we cannot find this airport.");
				  }
				  else
				  {
					  if(flights == null)
					  {
						  Flight flight1 = new Flight(airline, airport1, airport2, id);
						  flights.add(flight1); //add this object
						  System.out.println("Ok, create a flight called " + aname + id + ". From " + orig + " to " + dest);
					  }
					  else
					  {
						  for(int f = 0; f< flights.size() && answer3 != true; f++)
						  {
							  if(id.equals(flights.get(f).getId()) && aname.equals(flights.get(f).getAirline().getN()))
							  {
								  answer3 = true;
							  }
						  }
						  if(answer3 == true)
						  {
							  System.out.println("invalid! " + aname + " cannot have two flights with same id.");
						  }
						  else
						  {
							  Flight flight1 = new Flight(airline, airport1, airport2, id);
							  flights.add(flight1);
							  System.out.println("Ok, create a flight called " + aname + id + ". From " + orig + " to " + dest);
						  }
					  }
				  }
			  }
	     }
	 }
	 public void createSeats(String	air, String	flID, int rows)
	 {
		 boolean answer = false;
		 int n = 0;
		 Flight flight = null;
		 if(air == null || flID == null || rows == 0) //check whether it is null or not
		 {
			 System.out.println("invalid input");
			 return;
		 }
		 for(int i = 0; i< flights.size(); i++)
		 {
			if(air.equals(flights.get(i).getAirline().getN()) && flID.equals(flights.get(i).getId()))  //find this flight has existed or not
			{	
				answer = true;
				flight = flights.get(i);
			    flight.setRow(rows);
			    break;
			}
		 }
		 if(answer == false) //if answer equal to false, means cannot find this flight
		 {
			 System.out.println("Sorry! Cannot create seats for " + air + flID + " , because we cannot find the airline or the flight.");
		 }
		 else
		 {
			 while(n < rows * 6)
			 {
				 Seat seat = new Seat(1,"A"); //create a seat object
				 flight.getSeats().add(seat); //add this seat object to the arraylist in flight class		 
				 n++;
			 }
			 System.out.println("Ok, we already create " + rows * 6 + " seats for flight " + air + flID);
		 }
	 }
	 public void findAvailableFlights(String orig, String dest)
	 {
		 int s = 0;
		 for(int i = 0; i< flights.size(); i++)
		 {
			 if(flights.get(i).getAirport1().equals(orig) && flights.get(i).getAirport2().equals(dest))
			 {
				 System.out.println(flights.get(i).getAirline().getN() + flights.get(i).getId() + "is from" + flights.get(i).getAirport1().getName() + "to" + flights.get(i).getAirport2().getName());
			     s++;
			 }
		 }
		 if(s == 0)
		 {
			 System.out.println("Sorry! we cannot find any flight from " + orig + " to " + dest);
		 }
	 }
	 public void bookSeat(String air, String fl, int row, char col)
	 {
		 boolean answer = false;
		 Flight flight = null;
		 for(int i = 0; i< flights.size() && answer != true; i++) //just check can we find this flight or not
		 {
			if(air.equals(flights.get(i).getAirline().getN()) && fl.equals(flights.get(i).getId()))
			{	
				answer = true;
				flight = flights.get(i);
			}
		 }
		 if(answer == false)
		 {
			 System.out.println("Sorry! Cannot book seats for " + air + fl + " , because we cannot find the airline or the flight.");
		 }
		 else
		 {
			 int n = col - 'A';			 
			 if(row <= flight.getRow())
			 {
				 ArrayList<Seat> seat = flight.getSeats();
				 if(seat.get((row-1) * 6 + n).getStatus() != true)
				 {
					 System.out.println("Ok, you have already booked " + row + col + " for " +  air + fl);
					 seat.get((row-1) * 6 + n).setStatus(true);
				 }
				 else
				 {
					 System.out.println("Sorry! " +row + col + " has been booked for " + air + fl);
				 }
			 }
			 else
			 {
				 System.out.print("Sorry! Cannot find seat " + row + col + " for " + air + fl);
			 }			 
		 }
	 }
	 public void displaySystemDetails()
	 {
		 System.out.println("Display the airline we have:");
		 System.out.println(airlines);//display the each object in airlines arraylist
		 System.out.println("Display the airport we have:");
		 System.out.println(airports);
		 System.out.println("Display the flight we have");
		 System.out.println(flights);
	 }
}
