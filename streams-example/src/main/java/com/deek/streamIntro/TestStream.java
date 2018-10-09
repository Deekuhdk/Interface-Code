package com.deek.streamIntro;

import java.util.Arrays;
import java.util.*;
import java.util.stream.Stream;

public class TestStream {

	public static void main(String[] args) {
	 String arr[]= new String[] {"AA","BB","CC"};
	 Stream<String> stream= Arrays.stream(arr);
	 stream.forEach(System.out::println);
	 
	 
	
	 Stream<String> of= Stream.of("A","B","C","D");
	 System.out.println("==================");
	 of.forEach(System.out::println);
	 
	 List<String> list= new ArrayList<>();
	 list.add("deeksha");
	 list.add("devi");
	 list.add("raksha");
	 
	 System.out.println("==================");
	 Stream<String> stream2=list.stream();
	 stream2.forEach(System.out::println);

	}

}
