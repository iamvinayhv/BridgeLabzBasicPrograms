package com.BridgeLabz.Basics;

import java.util.Scanner;

public class StopWatch 
{
	long start;
	long end;
	long timeTaken;
	
	public void startTimmer()
	{
		start=System.nanoTime();
	}
	
	public void stopTimmer()
	{
		end=System.nanoTime();
	}
	
	public long elapsedTime()
	{
		timeTaken=end-start;
		return timeTaken;
	}
	
	
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		StopWatch sw=new StopWatch();
		
		System.out.println("Press any key to Start Start watch");
		sc.nextLine();
		
		sw.startTimmer();
		
		System.out.println("Press any key to Start Stop watch");
		sc.nextLine();
		
		sw.stopTimmer();
		
		System.out.println("Time taken ="+sw.elapsedTime());
	}


}
