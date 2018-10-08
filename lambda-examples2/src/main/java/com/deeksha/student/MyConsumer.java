package com.deeksha.student;

import java.util.function.Consumer;

public class MyConsumer implements Consumer<Student>{

	@Override
	public void accept(Student student) {
		System.out.println(student);
		
	}
	

}
