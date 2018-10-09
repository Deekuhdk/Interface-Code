package com.deeksha.referencingStream;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReferencingStream {

	public static void main(String[] args) {
		List<String> collect=Stream.of("a","b","c").filter(e -> e.contains("b")).collect(Collectors.toList());
	   Optional<String> findAny= collect.stream().findAny();
	    System.out.println(findAny.get());
	     
	    Optional<String> findFirst = collect.stream().findFirst();
	    System.out.println(findFirst.get());
	
	}

}
