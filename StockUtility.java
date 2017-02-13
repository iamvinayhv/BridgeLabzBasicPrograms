package com.BridgeLabz.Basics;

import java.util.Scanner;

public class StockUtility 
{
	Scanner sc=new Scanner(System.in);
	
	int totalNumShares=0;
	double totalAmtOfAll=0.0;
	int num;
	String []comNames=new String[100];
	int[]shares=new int[100];
	double[] eachShareVal=new double[100];
	double []TotalPrice=new double[100];
	
	
	StockUtility(int num)
	{
		this.num=num;
	}
	
	public void entry()
	{
		for(int i=0;i<num;i++)
		{
			System.out.println("\n\nEnter the name of the Company "+(i+1));
			comNames[i]=sc.next();
			
			System.out.println("Enter the number of Stock "+comNames[i]+" company have");
			shares[i]=sc.nextInt();
			
			System.out.println("Enter the price of each Stock");
			eachShareVal[i]=sc.nextDouble();
		}
	}
	
	public void calculate()
	{
		for(int i=0;i<num;i++)
		{
			TotalPrice[i]=eachShareVal[i]*shares[i];
			totalNumShares=totalNumShares+shares[i];
			totalAmtOfAll=totalAmtOfAll+TotalPrice[i];
			
		}
	}
	
	public void disp()
	{
		System.out.println();
		for(int i=0;i<num;i++)
		{
			System.out.println("Company Name:"+comNames[i]+"\t\tCompany Shares:"+shares[i]+"\tEach Share value "+eachShareVal[i]+"\tTotal Price of "+shares[i]+" Shares is "+TotalPrice[i]);
		}
	}
	
	public void Tdisp()
	{
		System.out.println("\nTotally we have "+totalNumShares+" Shares\nTotal Amount of All shares="+totalAmtOfAll);
	}
	
}

