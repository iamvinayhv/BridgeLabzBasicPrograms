package com.BridgeLabz.Basics;

import java.io.FileWriter;
import java.io.IOException;

public class LinkedList 
{
	Node head=null;
	
	
	public boolean insert(String st)
	{
		Node my=new Node(st);
		
		if(head==null)
		{
			//System.out.println("hi");
			//System.out.println(my);
			Node t=head;
			head=my;
			head.next=t;
			return true;
		}
			
		
		//System.out.println("bye");
		Node temp=head;
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		temp.next=my;
		
		//System.out.println(head);
		//System.out.println(my);
		//my.next=null;
		
		return true;
	}
	
	
	
	
	
	public void disp()
	{
		Node t=head;
		while(t!=null)
		{
			System.out.print(t.data+"--->");
			t=t.next;
		}
		System.out.println();
		
	}
	
	
	
	
	
	
	int i=0;
	public boolean Search(String st)
	{
		Node t=head;
		while(t!=null)
		{
			if(t.data.equalsIgnoreCase(st))
			{
				return true;
			}
			i++;
			t=t.next;
		}
		return false;
	}
	
	
	
	
	
	public String delete(String st)
	{
		Node currNode=head;
		
		Node prevNode=null;
		
		if(currNode.data.equalsIgnoreCase(st))
		{
			String s=head.data;
			head=head.next;
			return s;
		}
		
		while(currNode != null && !currNode.data.equalsIgnoreCase(st))
		{
			prevNode=currNode;
			currNode=currNode.next;
		} 
			prevNode.next = currNode.next;
		return currNode.data;
	}
	
	
	
	
}
