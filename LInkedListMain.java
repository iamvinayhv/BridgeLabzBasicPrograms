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
		
		System.out.println("Enter the word to search");
		String word=sc.nextLine();
		
		
		boolean res=ll.Search(word);
		
		String[]navi=str;
		
		
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
			//navi[navi.length]=word;
			
		}
		
		f.addToFile(navi);
		
		
	}
	
	

}
