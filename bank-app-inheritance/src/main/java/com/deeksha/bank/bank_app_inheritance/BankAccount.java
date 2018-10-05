package com.deeksha.bank.bank_app_inheritance;

public class BankAccount {
 private int AccountNo;
 private String AccountHolderName;
 private double AccountBalance;
private double accountBalance;
 

 public BankAccount() {
 	AccountNo=1;
 	AccountHolderName="deeksha";
 	accountBalance=0;
 }

	public BankAccount(int accNo, String accHolderName, double accountBalance) {
		super();
		this.AccountNo = accNo;
		this.AccountHolderName = accHolderName;
		this.accountBalance = accountBalance;
	}


public BankAccount(String accHolderName, double accountBalance) {
	super();

	this.AccountHolderName = accHolderName;
	this.accountBalance = accountBalance;
}

public int getAccNo() {
	return AccountNo;
}



public String getAccHolderName() {
	return AccountHolderName;
}

public void setAccHolderName(String accHolderName) {
	this.AccountHolderName = accHolderName;
}

public double getAccountBalance() {
	return accountBalance;
}



public void withdraw(double amount) {
	accountBalance-=amount;
}
public void deposit(double amount) {
	accountBalance+=amount;
}

 @Override
public String toString() {
	return "BankAccount [accNo=" + AccountNo + ", accHolderName=" + AccountHolderName + ", accountBalance=" + accountBalance
			+ "]";
}
}
