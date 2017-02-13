package com.BridgeLabz.Basics;

import java.util.Scanner;

public class StockReport {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Plese Enter how many Companyies Entry You want");
		int num=sc.nextInt();
		
		StockUtility su=new StockUtility(num);
		
		su.entry();
		su.calculate();
		su.disp();
		su.Tdisp();
	}

}

