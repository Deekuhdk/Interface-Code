package com.deeksha.flight.pojo;

public class FlightsPojo {
	int flightNo,cost;
	String departTime, arrivalTime, totalTime, airline, source, destination;
	
	public FlightsPojo(int flightNo, String airline, String departTime, String arrivalTime, int cost, String source,
			String destination, String totalTime) {
		super();
		this.flightNo = flightNo;
		this.airline = airline;
		this.departTime = departTime;
		this.arrivalTime = arrivalTime;
		this.cost = cost;
		this.source = source;
		this.destination = destination;
		this.totalTime = totalTime;
	}
	public FlightsPojo() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "FlightsPojo [flightNo=" + flightNo + ", airline=" + airline + ", departTime=" + departTime
				+ ", arrivalTime=" + arrivalTime + ", cost=" + cost + ", source=" + source + ", destination="
				+ destination + ", totalTime=" + totalTime + "]";
	}
	public int getFlightNo() {
		return flightNo;
	}
	public void setFlightNo(int flightNo) {
		this.flightNo = flightNo;
	}
	public String getAirline() {
		return airline;
	}
	public void setAirline(String airline) {
		this.airline = airline;
	}
	public String getDepartTime() {
		return departTime;
	}
	public void setDepartTime(String departTime) {
		this.departTime = departTime;
	}
	public String getArrivalTime() {
		return arrivalTime;
	}
	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getTotalTime() {
		return totalTime;
	}
	public void setTotalTime(String totalTime) {
		this.totalTime = totalTime;
	}
	

}