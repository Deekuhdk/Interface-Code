package com.compare;

import java.util.Comparator;

public class Student1 implements Comparator<Student1> {
	int rollno;
	String name;
	int age = 21;

	public Student1() {
	}

	Student1(int rollno, String name, int age) {
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}

	public int compare(Student1 stu1, Student1 stu2) {
		/*
		 * Comparator interface has compare method that compares two objects
		 */
		if (stu1.age == stu2.age) {
			return 0;
		} else if (stu1.age > stu2.age) {
			return 1;
		} else {
			return -1;
		}

	}
}
