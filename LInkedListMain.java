package com.BridgeLabz.Basics;

import java.io.IOException;
import java.util.Scanner;

public class LInkedListMain {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner (System.in);
		
		LinkedListFile f=new LinkedListFile();
		
		LinkedList ll=new LinkedList();
		String[] str=f.getFile();
		
		int k=0;
		while(k<str.length)
		{
			ll.insert(str[k]);
			k++;
		}
		
		System.out.println("These elements are added into the list");
		ll.disp();
		
		System.out.println("\nEnter the word to search");
		String word=sc.nextLine();
		
		
		boolean res=ll.Search(word);
		
		
		if(res)
		{
			System.out.println(word+" Foud at the index:"+ll.i);
			String resd=ll.delete(word);
			System.out.println(resd+" deleted");
			ll.disp();
		}
		else
		{
			System.out.println(word+" Not Found and added into List");
			ll.insert(word);
			ll.disp();
			
		}
		
		
		System.out.println("\nEnter the word to insert");
		String insert=sc.nextLine();
		
		System.out.println("Enter the position");
		int pos=sc.nextInt();
		System.out.println(ll.size());
		
		boolean in=ll.insertAtIndex(insert, pos);
		if(in)
			System.out.println("Inserted Sucessfully!!!  at position "+pos);
		
		ll.disp();
		
		
		
		String update=ll.rep;
		if(f.addToFile(update))
		{
			System.out.println("\nFile has been Updated");
		}
		
		int s=ll.size();
		System.out.println("Size="+s);
		
	}
	
	

}
