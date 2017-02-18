package com.BridgeLabz.Basics;

import java.util.*;

public class SimpleBalancedParentheses {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		StopWatch s=new StopWatch();
		System.out.println("Press any key to Start Start watch");
		System.out.println("Enter the String to check its Balanced or Not");
		String str=sc.nextLine();
		
		s.startTimmer();
		
		
		
		
		
		
		char[]ch1=str.toCharArray();
		
		String str2="";
		int h=0;
		
		for(int i=0;i<str.length();i++)
		{
			if(ch1[i]=='('||ch1[i]==')'||ch1[i]=='{'||ch1[i]=='}'||ch1[i]=='['||ch1[i]==']')
			{
				str2=str2+ch1[i];
			}
		}
		
		Stack st=new Stack();
		
		char[]ch=str2.toCharArray();
		
		
		
		
		for(int i=0;i<ch.length;i++)
		{
			if(ch[0]=='}'||ch[0]==')'||ch[0]==']'||ch.length%2==1)
			{
				System.out.println("String is Not Balanced");
				return;
			}
			
			else if((ch[i]=='('||ch[i]=='{'||ch[i]=='[')&&(!st.empty())&&i==ch.length-1)
			{
				h++;
				System.out.println("String is Not Balanced");
				return;
			}
			
			
			if(ch[i]=='('||ch[i]=='{'||ch[i]=='[')
			{
				st.push(ch[i]);
			}
			
			else if((ch[i]==')'||ch[i]=='}'||ch[i]==']')&&(!st.empty()))
			{
				char c=  (char) st.pop();
				
				if((ch[i]==')'&&c=='(')||(ch[i]=='}'&&c=='{')||(ch[i]==']'&&c=='['))
				{h++;
					if(st.empty()&&i==ch.length-1)
						System.out.println("String is Balanced");
				}
				else
				{
					System.out.println("String is Not Balanced");
					return;
				}
				
				
			}
			
			
			else
			{
				System.out.println("String is Not Balanced");
				return;
			}
			
			
			
		}
		if(h==0)
			System.out.println("String is Balanced");
		s.stopTimmer();
		System.out.println("Time taken ="+s.elapsedTime()+"nano secs");
	}

}
