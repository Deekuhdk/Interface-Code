package com.deeksha.abstract2;

public class MainClass {
 
	public static void main(String[] args) {
		Phone ph = new MobilePhone("Samsung");
		ph.call();
		ph.message();
		ph.feature();
		System.out.println(ph);
	}
}
