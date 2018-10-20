package com.deeksha.abstract1;

public class Main {

	public static void main(String[] args) {
		Shapes shape = new Rectangle(4,2);
		
		shape.draw();
	
		shape.getArea();
		System.out.println(shape);
	}

}
