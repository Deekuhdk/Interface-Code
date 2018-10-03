package com.deeksha.bank.bank_application;

/** this comment is  documentation based comment
 * 
 * @author dekamath
 * @since 03-10-2018
 * 
 *
 */
public  abstract class BankAccount {
    int accNo;
    String accHolderName;
    double accountBalance;
    static int autoAccNumberGenerator;
    public BankAccount() {
    	accNo=++autoAccNumberGenerator;
    	accHolderName="deeksha";
    	accountBalance=0;
    }

	public BankAccount(int accNo, String accHolderName, double accountBalance) {
		super();
		this.accNo = ++autoAccNumberGenerator;
		this.accHolderName = accHolderName;
		this.accountBalance = accountBalance;
	}


public BankAccount(String accHolderName, double accountBalance) {
	super();
	this.accNo = ++autoAccNumberGenerator;
	this.accHolderName = accHolderName;
	this.accountBalance = accountBalance;
}

public int getAccNo() {
	return accNo;
}



public String getAccHolderName() {
	return accHolderName;
}

public void setAccHolderName(String accHolderName) {
	this.accHolderName = accHolderName;
}

public double getAccountBalance() {
	return accountBalance;
}



public void withdraw(double amount) {
	accountBalance += amount;
}


    @Override
public String toString() {
	return "BankAccount [accNo=" + accNo + ", accHolderName=" + accHolderName + ", accountBalance=" + accountBalance
			+ "]";
}

	
    
}
