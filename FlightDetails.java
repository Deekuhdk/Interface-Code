package com.deeksha.flight.MakeMyTrip;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;



import com.deeksha.flight.pojo.FlightsPojo;

public class FlightDetails {
	ArrayList<FlightsPojo> flightsList=new ArrayList<FlightsPojo>();
	
    
	public void addFlightDetails(FlightsPojo flight) {
		flightsList.add(flight);
	}
	
	//To remove flight with respect to flight number
	public ArrayList<FlightsPojo> removeFlightById(int flightNo) {
		for(FlightsPojo remove:flightsList) {
			if(remove.getFlightNo()==flightNo) {
				return flightsList;
			}
		}
		throw new RuntimeException("Flight doesn't exist");
	}
    
	public ArrayList<FlightsPojo> getFlightDetails() {
		return flightsList;
	}

	
	//To update flight with respect to destination
	public ArrayList<FlightsPojo> updateDestination(int flightId,String destination){
		for(FlightsPojo update:flightsList) {
			if(update.getFlightNo()==flightId) {
				update.setDestination(destination);
				return flightsList;
			}
		}
		throw new RuntimeException("Flight doesn't exist");
	}
	
	
	//To update flight with respect to arrival and departure time
	public ArrayList<FlightsPojo> updateTime(int flightId,String arrivalTime,String departTime){
		for(FlightsPojo update:flightsList) {
			if(update.getFlightNo()==flightId) {
				update.setArrivalTime(arrivalTime);
				update.setDepartTime(departTime);
				return flightsList;
			}
		}
		throw new RuntimeException("Flight doesn't exist");
	}
	
	
	//To sort flights with respect to the lowest flight fare
	public ArrayList<FlightsPojo> sortByCheapestFare(String source, String destination) {
		for(FlightsPojo sortFlight:flightsList) {
			if(source.equals(sortFlight.getSource())&&destination.equals(sortFlight.getDestination())) {
				Collections.sort(flightsList, new Comparator<FlightsPojo>() {
					public int compare(FlightsPojo acc1,FlightsPojo acc2) {
						return acc1.getCost()-(acc2.getCost());
					}
				});
				
			}
			
		}
		return flightsList;
	}
}
