package com.BridgeLabz.Basics;

import java.util.Scanner;

public class FewestNoteReturnByVmachine {
	
	int Tamt;
	int totalNotes=0;
	int Thnotes = 0,Fhnotes = 0,Hhnotes = 0,Ffnotes = 0,Tenotes = 0,Finotes = 0,Twnotes = 0,Onnotes=0;

	public void vendingMachine(int amt)
	{
		
		int Tamt=amt;
		//int totalNotes=0;
		
		
		if(amt>=1000)
		{
			int q=amt/1000;
			Thnotes=Thnotes+q;
			amt=amt%1000;
			System.out.println("Number of Thousands			="+Thnotes+"*1000");
			vendingMachine(amt);
		}
		else if(amt>=500)
		{
			int q=amt/500;
			Fhnotes=Fhnotes+q;
			amt=amt%500;
			System.out.println("Number of Five Hundreads		="+Fhnotes+"*500");
			vendingMachine(amt);
		}
		else if(amt>=100)
		{
			int q=amt/100;
			Hhnotes=Hhnotes+q;
			amt=amt%100;
			System.out.println("Number of Hundreads			="+Hhnotes+"*100");
			vendingMachine(amt);
		}
		else if(amt>=50)
		{
			int q=amt/50;
			Ffnotes=Ffnotes+q;
			amt=amt%50;
			System.out.println("Number of Fifties			="+Ffnotes+"*50");
			vendingMachine(amt);
		}
		else if(amt>=10)
		{
			int q=amt/10;
			Tenotes=Tenotes+q;
			amt=amt%10;
			System.out.println("Number of Tens				="+Tenotes+"*10");
			vendingMachine(amt);
		}
		else if(amt>=5)
		{
			int q=amt/5;
			Finotes=Finotes+q;
			amt=amt%5;
			System.out.println("Number of Fives				="+Finotes+"*5");
			vendingMachine(amt);
		}
		else if(amt>=2)
		{
			int q=amt/2;
			Twnotes=Twnotes+q;
			amt=amt%2;
			System.out.println("Number of Twos				="+Twnotes+"*2");
			vendingMachine(amt);
		}
		else if(amt>=1)
		{
			int q=amt/1;
			Onnotes=Onnotes+q;
			System.out.println("Number of Ones				="+Onnotes+"*1");
		}
		
		totalNotes=Thnotes+Fhnotes+Hhnotes+Ffnotes+Tenotes+Finotes+Twnotes+Onnotes;
		
		
		
	}
	
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Amount ");
		int Tamt=sc.nextInt();
		
		FewestNoteReturnByVmachine m=new FewestNoteReturnByVmachine();
		
		System.out.println("Change for your Amount\t\t\tRs"+Tamt+" is:");
		System.out.println("--------------------------------------------------");
		m.vendingMachine(Tamt);
		
		
		System.out.println("--------------------------------------------------");
		System.out.println("Total notes:"+m.totalNotes+"\t\t\t  Amount="+Tamt);
		System.out.println("--------------------------------------------------");
		
	}

}
