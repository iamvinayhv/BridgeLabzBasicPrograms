package com.BridgeLabz.Basics;

public class MyStack
{
	private int top;
	private int[]stackArray;
	private int maxSize;
	
	MyStack(int size)
	{
		maxSize=size;
		stackArray=new int[maxSize];
		top=-1;
	}
	
	public void push(int n)
	{
		stackArray[++top]=n;
	}
	
	public int pop()
	{
		return stackArray[top--];
	}
	
	public int size()
	{
		return top+1;
	}
	
	public int peek()
	{
		return stackArray[top];
	}
	
	public boolean empty()
	{
		return top==-1;
	}
	
	public boolean full()
	{
		return top==maxSize-1;
	}
	
	
	
	public static void main(String[] args) 
	{
		MyStack s=new MyStack(6);
		
		System.out.println("full="+s.full());
		
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		s.push(60);
		
		System.out.println("full="+s.full());
		
		System.out.println("Size="+s.size());
		
		while(!s.empty())
		{
			System.out.println(s.pop());
		}
		
		System.out.println("Size="+s.size());
		
		
		
		
		
	}

}
