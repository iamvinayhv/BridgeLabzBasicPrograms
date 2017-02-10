package com.BridgeLabz.Basics;


public class BankQueue 
{
	int[]QueueArray=new int[10];
	int front=-1;
	int rare=-1;
	static int count=0;
	
	
	public void add()
	{
		count++;
		System.out.println("Current queue size="+count+"\n");
	}
	
	public void exit()
	{
		count--;
	}
	
	public int size()
	{
		return count;
	}
	
	public boolean empty()
	{
		return count==0;
	}
	
	public boolean full()
	{
		return count==10;
	}
}
