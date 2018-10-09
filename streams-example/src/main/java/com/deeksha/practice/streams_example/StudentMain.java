package com.deeksha.practice.streams_example;

import java.util.*;
import java.util.stream.Stream;

/**
 * Hello world!
 *
 */
public class StudentMain 
{
    public static void main( String[] args )
    {
      List<Student> list=new ArrayList<Student>();
      list.add(new Student("deeksha", 22));
      list.add(new Student("Raksha", 18));
      list.add(new Student("Pragnya", 22));
      
      Stream<Student> parallelStream = list.parallelStream();
      System.out.println("Students data send for processing::");
      parallelStream.forEach(s-> doProcess(s));
    }

	private static void doProcess(Student s) {
		System.out.println(s);
	}
}
