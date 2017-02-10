package com.BridgeLabz.Basics;

import java.util.Scanner;

public class FewestNoteReturnByVmachine {
	
	static int Thnotes = 0,Fhnotes = 0,Hhnotes = 0,Ffnotes = 0,Tenotes = 0,Finotes = 0,Twnotes = 0,Onnotes=0;

	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Amount ");
		int Tamt=sc.nextInt();
		int amt=Tamt;
		int totalNotes=0;
		
		
		
		if(amt>1000)
		{
			int q=amt/1000;
			Thnotes=Thnotes+q;
			amt=amt%1000;
		}
		
		if(amt>500)
		{
			int q=amt/500;
			Fhnotes=Fhnotes+q;
			amt=amt%500;
		}
		if(amt>100)
		{
			int q=amt/100;
			Hhnotes=Hhnotes+q;
			amt=amt%100;
		}
		if(amt>50)
		{
			int q=amt/50;
			Ffnotes=Ffnotes+q;
			amt=amt%50;
		}
		if(amt>10)
		{
			int q=amt/10;
			Tenotes=Tenotes+q;
			amt=amt%10;
		}
		if(amt>5)
		{
			int q=amt/5;
			Finotes=Finotes+q;
			amt=amt%5;
		}
		if(amt>2)
		{
			int q=amt/2;
			Twnotes=Twnotes+q;
			amt=amt%2;
		}
		if(amt>1)
		{
			int q=amt/1;
			Onnotes=Onnotes+q;
		}
		
		totalNotes=Thnotes+Fhnotes+Hhnotes+Ffnotes+Tenotes+Finotes+Twnotes+Onnotes;
		
		System.out.println("Change for your Amount "+Tamt+" is:");
		
		System.out.println("Number of Thousands			="+Thnotes+"*1000");
		System.out.println("Number of Five Hundreads		="+Fhnotes+"*500");
		System.out.println("Number of Hundreads			="+Hhnotes+"*100");
		System.out.println("Number of Fiftys			="+Ffnotes+"*50");
		System.out.println("Number of Tens				="+Tenotes+"*10");
		System.out.println("Number of Fives				="+Finotes+"*5");
		System.out.println("Number of Twos				="+Twnotes+"*2");
		System.out.println("Number of Ones				="+Onnotes+"*1");
		System.out.println("------------------------------------------------");
		System.out.println("Total notes		"+totalNotes+"		="+Tamt);
		
	}

}
