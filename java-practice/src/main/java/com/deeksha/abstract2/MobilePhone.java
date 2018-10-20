package com.deeksha.abstract2;

public class MobilePhone extends Phone{
 private String name;

@Override
public void call() {
	System.out.println("Make a call");
	
}

@Override
public void message() {
	System.out.println("Send message");
	
}

public MobilePhone(String name) {
	super();
	this.name = name;
}

@Override
public String toString() {
	return "MobilePhone [name=" + name + "]";
}

}
