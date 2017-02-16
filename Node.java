package com.BridgeLabz.Basics;

public class Node 
{
	String data;
	Node next;
	
	Node(String st)
	{
		data=st;
		next=null;
	}

	@Override
	public String toString() {
		return "Node [data=" + data + "]";
	}
	
}
