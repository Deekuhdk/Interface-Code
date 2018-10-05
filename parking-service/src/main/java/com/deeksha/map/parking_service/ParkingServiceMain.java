package com.deeksha.map.parking_service;

import java.util.Map.Entry;

/**
 * Hello world!
 *
 */
public class ParkingServiceMain {
public static void main(String[] args) {
ParkingService park=new ParkingService();

//Adding or inserting car details
CarDetails owner=new CarDetails("Deeksha", "1234567", "11:00");
park.addCar(new CarDetails("Kamath","5365443", "13:30"));
park.addCar(new CarDetails("Devi","6253662", "09:00"));
park.addCar(new CarDetails("Devika","24323235", "10:15"));
park.addCar(new CarDetails("Rajesh","6726372", "11:15"));
park.addCar(new CarDetails("Raksha","6562532", "11:30"));
park.addCar(new CarDetails("Vittal","87736523", "12:00"));
park.addCar(new CarDetails("Rukma","76753226", "08:00"));
park.addCar(new CarDetails("Jaya","676327367", "14:00"));
park.addCar(new CarDetails("Sai","976763633", "15:00"));
park.addCar(new CarDetails("Nandan","6878232", "11:00"));
park.addCar(new CarDetails("Pai","67677898", "17:00"));
park.addCar(owner);

//To display or retrieve Car details
park.getAllCars();
for(Entry<ParkingId, CarDetails> e: park.getAllCars() ) {
System.out.println(e.getKey()+" " + e.getValue());
}
System.out.println(park.getCarById(owner.getId()));
}



}

