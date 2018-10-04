package com.deeksha.flight.MakeMyTrip;

import java.util.ArrayList;

import com.deeksha.flight.pojo.FlightsPojo;

/**
 * Hello world!
 *
 */
public class MakeMyTrip 
{
    public static void main( String[] args )
    {
       	FlightDetails flights=new FlightDetails();
    	FlightsPojo flight1=new FlightsPojo(1,"Air Asia","12:30","15:00","2:30","Bangalore","Mumbai",4000);
    	FlightsPojo flight2=new FlightsPojo(2,"Air Asia","0830","10:00","2:00","Bangalore","Chennai",3500);
    	FlightsPojo flight3=new FlightsPojo(3,"Air India","16:30","19:45","3:15","Bangalore","Delhi",165);
    	flights.addFlightDetails(flight1);
    	flights.addFlightDetails(flight2);
    	flights.addFlightDetails(flight3);
		
		//Displays flight details
    	ArrayList<FlightsPojo> flightsList1=flights.getFlightDetails();
    	for(FlightsPojo flightDetails:flightsList1) {
    		System.out.println(flightDetails);
    	}
		//Remove flight details
    	flights.removeFlightById(1);
    	ArrayList<FlightsPojo> flightsList3=flights.getFlightDetails();
    	for(FlightsPojo flightDetails:flightsList3) {
    		System.out.println(flightDetails);
    	}
    	
		//update flight with respect to destination
    	ArrayList<FlightsPojo> flightsList5=flights.updateDestination(1,"Delhi");
    	for(FlightsPojo flightDetails:flightsList5) {
    		System.out.println(flightDetails);
    	}
		
		//update flight with respect to arrival and destination time
    	ArrayList<FlightsPojo> flightsList6=flights.updateTime(1,"6:00","9:00");
    	for(FlightsPojo flightDetails:flightsList6) {
    		System.out.println(flightDetails);
    	}
    	
		//sort flights with respect to cheapest fare
    	ArrayList<FlightsPojo> flightsList7=flights.sortByCheapestFare("Bangalore","Delhi");
    	for(FlightsPojo flightDetails:flightsList7) {
    		System.out.println(flightDetails);
    	}
    	
    }
}
