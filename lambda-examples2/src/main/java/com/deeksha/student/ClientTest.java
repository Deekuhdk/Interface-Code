package com.deeksha.student;

import java.util.*;

public class ClientTest{
	
	public static void main(String[] args){
		List<Student> list=new ArrayList<>();
		list.add(new Student("deeksha", 22));
		list.add(new Student("Kamath", 20));
		list.add(new Student("Raksha", 18));
		
		//list.forEach(System.out::println);
		list.forEach(new MyConsumer());
	}

}
