package com.cui.csci1101.assignment3;

public class Client
{
	public static void main (String[] args)
	{
		SystemManager res = new SystemManager();
		System.out.println("this system is going to run\n");
		System.out.println("*Below shows the status that the airport you created:\n");
		res.createAirport("Aa");
		res.createAirport("GTF");
		res.createAirport("GDE");
		res.createAirport("Hpo");
		res.createAirport("E1D");
		res.createAirport("YYC");
		res.createAirport("LONDON");
		res.createAirport("123"); 
		res.createAirport("YEG");
		res.createAirport("BOS");
		res.createAirport("JFK");
		System.out.println("\n*Below shows the status that the airline you created:\n");
		res.createAirline("AC");
		res.createAirline("DELTA");
		res.createAirline("USAIR");
		res.createAirline("WSJET");
		res.createAirline("FRONTIER");
		System.out.println("\n*Below shows the status that the flight you created:\n");
		res.createFlight("AC", "GTF", "GDE", "123");
		res.createFlight("AC", "YEG", "FGH", "567");
		res.createFlight("AC", "YEG", "YEG", "542");
		res.createFlight("AC", "BOS", "JFK", "232");
		res.createFlight("AC", "YHZ", "YYZ", "567");
		res.createFlight("DELTA", "YHZ", "BOS", "123");
		System.out.println("\n*Below shows the status that the seat you created:\n");
		res.createSeats("AC", "123", 60);
		res.createSeats("DELTA", "123", 11);
		System.out.println("\n\n");
		System.out.println("*Searching for available flight:\n");
		res.findAvailableFlights("YHZ", "YYZ");
		System.out.println("\n\n");
		System.out.println("*Searching for the seat that you want to book:\n");
		res.bookSeat("AC", "123", 1, 'A');
		res.bookSeat("AC","567",20,'F');
		res.bookSeat("AC", "506", 2, 'B'); 
		res.bookSeat("AC", "123", 55, 'C');
		System.out.println("\n\n");
		res.displaySystemDetails();
	}
}
