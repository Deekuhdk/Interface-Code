package com.deeksha.person;

import java.util.*;
import java.util.function.Function;

public class PersonMain {

	public static void main(String[] args) {
		ArrayList<PersonPojo> person= new ArrayList<>();
        person.add(new PersonPojo("deeksha", 22));
        person.add(new PersonPojo("Raksha",18));
        person.add(new PersonPojo("Devi", 45));
        
       
        
        System.out.println("================================");
        
        //to display Names of person entered
        List<String> personName= PersonMain.getAllPeople(person, PersonPojo::getName);
        personName.forEach(System.out::println);
	}

	private static List<String> getAllPeople(ArrayList<PersonPojo> persons, Function<PersonPojo, String> f) {
		List<String> result= new ArrayList<>();
		persons.forEach(n->result.add(f.apply(n)));
		return result;
	
	}

}
