package com.daya.interview_examples;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		Box box = new Box();
		box.setA(2);  //Generic type as int
		System.out.println(box.getA());
		box.setA("deeksha"); // Generic type as String
		System.out.println(box.getA());
		box.setA(2.2); // Generic type as double
		System.out.println(box.getA());
	}
}
