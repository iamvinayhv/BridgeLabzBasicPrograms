package com.BridgeLabz.Basics;

import java.util.Scanner;

public class QuestionToFindNumber {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of steps you want");
		int steps=sc.nextInt();
		
		int num=1;
		for(int i=0;i<=steps;i++)
		{
			num=num*2;
		}
		
		int first=1;
		int last=num/2;
		int N=num;
		int i=2;
		int j=4;
		boolean b;
		
		
		
		
		for(int k=0;k<steps;k++)
		{
			System.out.println("Is your number between "+first+" to "+last+"\ntrue or false");
			b=sc.nextBoolean();
			
			if(b)
			{
				N=N/2;
				last=(first+last)/2;
			}
			else
			{
				first=first+N/i;
				last=last+N/j;
				i=i+i;
				j=j+j;
			}
		
		}
		
		
		System.out.println("Is Your number is "+first+"?? \ntrue or false");
		b =sc.nextBoolean();
		
		if(b)
			System.out.println("Your number is: "+(first));
		else
			System.out.println("Your number is: "+(last+1));
	}

}
