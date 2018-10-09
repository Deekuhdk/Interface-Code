package com.deeksha.practice.bank_app_interview;

import java.util.Scanner;

public class CreateAccount {
    int accountId;
    String accountHolderName;
    String IFSCcode;
    double balance;
	private String accountantname;

  
    public CreateAccount(int accountId, String accountHolderName, String IFSCcode, double balance) {
		
		this.accountId = accountId;
		this.accountHolderName = accountHolderName;
		this.IFSCcode = IFSCcode;
		this.balance = balance;
	}


    public int getAccountid() {
		return accountId;
	}


	public String getAccountantname() {
		return accountantname;
	}


	public String getIFSCcode() {
		return IFSCcode;
	}


	public double getBalance() {
		return balance;
	}


	public void setAccountid(int accountid) {
		this.accountId = accountid;
	}


	public void setAccountantname(String accountantname) {
		this.accountantname = accountantname;
	}


	public void setIFSCcode(String IFSCcode) {
		this.IFSCcode = IFSCcode;
	}


	

	//withdrawl money  and set daily withdrawl limit
    public void WithdrawMoney() throws InsufficientBalException{


        
           final double setDailyLimit = 2500.00;     

            Scanner withDraw = new Scanner(System.in);
            System.out.println("please enter the withdraw amount");
            double WithdrawMoney =withDraw.nextDouble();


        if(balance < WithdrawMoney)
            System.out.println("you have less amount : your current balance is="+balance);

        else if (WithdrawMoney > setDailyLimit)
            System.out.println("you have entered amount exceed than daily limit : your dailyLimit="+setDailyLimit);

        else 
            balance -= WithdrawMoney;
            System.out.println("your current balance is="+balance);

    }
    
    public void DepositMoney() throws  MiniumAmountDeposit{
        Scanner deposit = new Scanner(System.in);
        System.out.println("please enter the deposit amount");
        double Depositamount = deposit.nextDouble();
        balance += Depositamount ;
        System.out.println("your currentbalance="+balance);


    }


    /*public void setWithdrawlLimit()throws exceedLimit{
        Scanner scn = new Scanner(System.in);
        System.out.println("please enter the withdraw amount");
           double  enterAmount = scn.nextDouble();
        double DailysetLimit = 2500;

        if(enterAmount>DailysetLimit)
            System.out.println("you have exceed daily limit : your dailyLimit"+DailysetLimit);


    }*/

    



    public static void main(String[] args){
        CreateAccount account = new CreateAccount(1234455533,"samy","ICIC09", 25000);
        System.out.println("you have created account : " +account);
   

        try {
            account.WithdrawMoney();
            account.DepositMoney();
        } catch (InsufficientBalException | MiniumAmountDeposit e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        /*try {
            account.setWithdrawlLimit();
        } catch (exceedLimit e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

*/      
    }


	@Override
	public String toString() {
		return "CreateAccount [accountId=" + accountId + ", accountHolderName=" + accountHolderName + ", IFSCcode="
				+ IFSCcode + ", balance=" + balance + ", accountantname=" + accountantname + "]";
	}

}


