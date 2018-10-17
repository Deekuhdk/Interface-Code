package com.compare;

import java.util.ArrayList;
import java.util.Collections;

public class TestSort {
	public static void main(String args[]) {
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(new Student(101, "Vijay", 23));
		al.add(new Student(106, "Ajay", 27));
		al.add(new Student(105, "Jai", 25));

		Collections.sort(al);
		for (Student st : al) {
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}
		ArrayList<Student1> al2 = new ArrayList<Student1>();
		al2.add(new Student1(108, "Vijay", 30));
		al2.add(new Student1(107, "Ajay", 24));
		al2.add(new Student1(103, "Jai", 25));

		Collections.sort(al2, new Student1());
		for (Student1 st : al2) {
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}

	}
}
