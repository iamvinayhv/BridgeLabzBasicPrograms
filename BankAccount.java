package com.BridgeLabz.Basics;

public class BankAccount 
{
	double minBalance=10000.00;
	double balance=minBalance;
	
	BankQueue q=new BankQueue();
	
	public void deoposite(double amt)
	{
		balance=balance+amt;
		System.out.println("Amount of Rs"+amt+" Deposited Sucessfully");
		System.out.println("Current Balance is Rs"+balance);
		System.out.println("Current queue size="+q.size());
	}
	
	public void withdraw(double amt)
	{
		if((balance-amt)>minBalance)
		{
			balance=balance-amt;
			System.out.println("Amount of Rs"+amt+" Withdraws Sucessfully");
			System.out.println("Current Balance is Rs"+balance);
		}
		else
		{
			System.out.println("Don't have sufficient Balance to Withdraw");
			System.out.println("Come first who want to Deposite");
		}
		
		System.out.println("Current queue size="+q.size());
	}
	
	public void check()
	{
		System.out.println("Current Balance is Rs"+balance);
	}
}
