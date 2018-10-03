package com.deeksha.bank.bank_application;

public class SavingAccount2 extends SavingAccount implements Insurance {
	private String name;
	 private int age;
	 
	 public SavingAccount2() {
		 
	 }
	 
	public SavingAccount2(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void isSalaryAccount() {
		System.out.println("Salary Account");
	}

	public void CalculatePremium(double amount) {
		double premium = 5000;
		 
	    // Increase premium depending on age
	    if (age >= 18) {
	        premium *= 1.1;
	    }
	    if (age >= 25) {
	        premium *= 1.1;
	    }
	    if (age >= 30) {
	        premium *= 1.1;
	    }
	    if (age >= 35) {
	        premium *= 1.1;
	    }
	}
	 public static void main(String[] args) {
	    	
		    SavingAccount2 acc1= new SavingAccount2();
	    	acc1.CalculatePremium(2);
	    	System.out.println(acc1);
		}

}
