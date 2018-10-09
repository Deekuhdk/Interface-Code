package com.deeksha.practice.streams_example;

public class Student {

	private String studentName;
	private int age;
	public Student(String studentName, int age) {
		super();
		this.studentName = studentName;
		this.age = age;
	}
	public String getStudentName() {
		return studentName;
	}
	public int getAge() {
		return age;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", age=" + age + "]";
	}
	
}
