package com.deeksha.bank.bank_application;

public  class SavingAccount extends BankAccount {

	@Override
	public void withdraw(double amount) {
		System.out.println("Saving Account Withdraw method");
	}
	public void isSalaryAccount() {
		System.out.println("Salary Account");
	}
}
