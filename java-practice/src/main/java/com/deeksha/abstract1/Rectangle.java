package com.deeksha.abstract1;

public class Rectangle implements Shapes {

	private int length;
	private int breadth;
	public Rectangle() {
		
	}
	
	public Rectangle(int length, int breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}
     
	
	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getBreadth() {
		return breadth;
	}

	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}
    
	public void draw() {
		System.out.println("This is a rectangle");
	}
	public double getArea() {
		double area = this.length * this.breadth;
		return area;
	}

	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", breadth=" + breadth + 
				 ", getArea()=" + getArea() + "]";
	}

	
	

}
