package com.deeksha.map.parking_service;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ParkingService {
	
private static int compartment=1; 
private static int section=1;
private static int floor=1;

Map<ParkingId,CarDetails> cars;

public ParkingService() {
cars=new HashMap<ParkingId,CarDetails>();
}

//To park the arriving car

public void addCar(CarDetails car)

    {     

           if(compartment>10) //If compartment exceeds 10 cars

           {
        	   compartment=1;
                  section++;
                  
                  if(section>4) 

                  {

                        floor++;

                        section=1;

                        compartment=1;

                  }

           }

        ParkingId key=new ParkingId(compartment,section,floor);

       

           cars.put(key, car);

           compartment++;

          

           car.setId(key);

    }
public Set<Map.Entry<ParkingId,CarDetails>> getAllCars(){
  return cars.entrySet();
  
}
public CarDetails getCarById(ParkingId id) {
return cars.get(id);
}

}


