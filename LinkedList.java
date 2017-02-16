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
	
	
	public boolean insertAtIndex(String st,int pos)
	{
		Node my=new Node(st);
		
		if(pos==0)
		{
			Node t=head;
			head=my;
			head.next=t;
			return true;
		}
		
		int i=0;
		Node prevNode=null;
		Node currNode=head;
		
		while(i<pos)
		{
			Node temp;
			prevNode=currNode;
			currNode=currNode.next;
			
			if(i==pos-1)
			{
				temp=currNode.next;
				prevNode.next=my;
			}
			
			
			i++;
		}
		prevNode=prevNode.next;;
		//System.out.println(currNode);
		//System.out.println(prevNode);
		
		while(currNode != null)
		{
			//System.out.println(currNode);
			
			prevNode.next=currNode;
			
			prevNode=prevNode.next;
			//System.out.println(prevNode.next);
			
			currNode=currNode.next;
		}
		
		return true;
	}
	
	
	
	String rep;
	public void disp()
	{
		rep="";
		Node t=head;
		while(t!=null)
		{
			System.out.print(t.data+"--->");
			rep=rep+t.data+",";
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
