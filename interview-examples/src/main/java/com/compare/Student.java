package com.compare;

import java.util.*;
import java.io.*;

class Student implements Comparable<Student> {
	int rollno;
	String name;
	int age = 21;

	public Student() {
		// super();

	}

	Student(int rollno, String name, int age) {
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}

	public int compareTo(Student st) {
		/*
		 * Comparable has compareTo method that compares an object's argument with
		 * current argument
		 */
		if (age == st.age)
			return 0;
		else if (age > st.age)
			return 1;
		else
			return -1;
	}
}