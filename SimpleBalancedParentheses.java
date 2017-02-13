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
			if(ch[i]=='('||ch[i]=='{'||ch[i]=='[')
			{
				st.push(ch[i]);
			}
			else if(ch[0]=='}'||ch[0]==')'||ch[0]==']')
			{
				System.out.println("String is Not Balanced");
				return;
			}
			
			
			else if((ch[i]==')'||ch[i]=='}'||ch[i]==']')&&(!st.empty()))
			{
				char c= (char) st.pop();
				
				if((ch[i]==')'&&c=='(')||(ch[i]=='}'&&c=='{')||(ch[i]==']'&&c=='['))
				{
					if(st.empty()&&i==ch.length-1)
					{
							System.out.println("String is Balanced");
					}
				}
				else if(i==ch.length-1)
				{
					System.out.println("String is Not Balanced");
				}
			}
			
			else
			{
				System.out.println("String is Not Balanced");
			}
			
		}
		
	}

}

