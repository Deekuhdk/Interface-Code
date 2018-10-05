package com.deeksha.bank.bank_app_inheritance;

import com.deeksha.bank.bank_app_inheritance.BankAccount;

public class SavingsAccount extends BankAccount {

	
	public static void main(String[] args) {
		BankAccount account = new BankAccount();
		account.deposit(6000);
    	account.withdraw(5000);
    	
    	BankAccount account2 = new BankAccount(155182,"kamath",25000);
    	account2.deposit(10000);
    	
    	System.out.println(account);
    	System.out.println(account2);
    	
    }
	}

