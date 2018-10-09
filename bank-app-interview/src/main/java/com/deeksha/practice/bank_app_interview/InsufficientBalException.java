package com.deeksha.practice.bank_app_interview;

public class InsufficientBalException extends Exception {
   public InsufficientBalException() {
	   System.out.println("No sufficient balance");
   }
}
