package com.BridgeLabz.Basics;

import java.util.*;

public class SimpleBalancedParentheses {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String to check its Balanced or Not");
		String str=sc.nextLine();
		
		Stack st=new Stack();
		
		char[]ch=str.toCharArray();
		
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='(')
			{
				st.push(ch[i]);
			}
			else if(ch[i]==')')
			{
				st.pop();
			}
		}
		
		if(st.empty())
		{
			System.out.println("String is Balanced");
		}
		else
		{
			System.out.println("String is Not Balanced");
		}
	}

}
