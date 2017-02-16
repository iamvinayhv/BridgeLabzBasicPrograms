package com.BridgeLabz.Basics;

public class BinarySearchForWordFromFileUtility 
{

	public int[] convert(String[] str)
	{
		int[]arr=new int[str.length];
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=Integer.parseInt(str[i]);
		}
		return arr;
	}
	
	
	public void disp(int[]arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	
	public int[] sort(int[]arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					int t=arr[i];
					arr[i]=arr[j];
					arr[j]=t;
				}
			}
		}
		return arr;
	}
	
	
	public boolean intBinSearch(int[]ar,int left,int right,int num)
	{
		if(left<=right)
		{
			int mid=(left+right)/2;
			if(ar[mid]==num)
				return true;
			else if(ar[mid]>num)
				return intBinSearch(ar,left,mid-1,num);
			else if(ar[mid]<num)
				return intBinSearch(ar,mid+1,right,num);
		}
		return false;
	}
	
	
	public int[] removeWord(int []ar,int num)
	{
		int[]rarr=new int[ar.length-1];
		
		int i=0;
		
		while(ar[i]!=num)
		{
			rarr[i]=ar[i];
			i++;
		}
		int k=i+1;
		
		while(k<ar.length)
		{
			rarr[i]=ar[k];
			i++;
			k++;
		}
		
		
		
		return rarr;
	}
	
	
	public int[] appendWord(int[]ar,int num)
	{
		int[]aarr=new int[ar.length+1];
		for(int i=0;i<ar.length;i++)
		{
				aarr[i]=ar[i];
		}
		
		aarr[ar.length]=num;
		
		return aarr;
	}
	
}
