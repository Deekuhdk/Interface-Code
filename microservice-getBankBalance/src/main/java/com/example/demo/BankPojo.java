package com.example.demo;

public class BankPojo {

	private int account_id;
	private String AccountName;
	private double AccountBalance;
	public BankPojo() {
		
	}
	public BankPojo(int account_id, String accountName, double accountBalance) {
		super();
		this.account_id = account_id;
		AccountName = accountName;
		AccountBalance = accountBalance;
	}
	public int getAccount_id() {
		return account_id;
	}
	public String getAccountName() {
		return AccountName;
	}
	public double getAccountBalance() {
		return AccountBalance;
	}
	public void setAccount_id(int account_id) {
		this.account_id = account_id;
	}
	public void setAccountName(String accountName) {
		AccountName = accountName;
	}
	@Override
	public String toString() {
		return "BankPojo [account_id=" + account_id + ", AccountName=" + AccountName + ", AccountBalance="
				+ AccountBalance + "]";
	}
	
	
}
