package com.BridgeLabz.Basics;

public class Utility 
{
	
	/**
	 * This method is used to Search for index of the Particular number
	 * @param ar integer array
	 * @param left integer 0
	 * @param right integer size of the array
	 * @param num integer number to search
	 * @return integer index value of given number
	 */
	
	public int intBinSearch(int[]ar,int left,int right,int num)
	{
		if(left<=right)
		{
			int mid=(left+right)/2;
			if(ar[mid]==num)
				return mid;
			else if(ar[mid]>num)
				return intBinSearch(ar,left,mid-1,num);
			else if(ar[mid]<num)
				return intBinSearch(ar,mid+1,right,num);
		}
		return -1;
	}
	
	
	/**
	 * This method is used to sort the integer array using Insertion Sort
	 * @param arr integer array
	 * @return integer type array
	 */
	public int[] intInsertionSort(int[]arr)
	{
		for(int i=1;i<arr.length;i++)
		{
			int t=arr[i];
			int j=i;
			
			for(;j>0;j--)
			{
				if(t<arr[j-1])
				{
					arr[j]=arr[j-1];
				}
				else
					break;
			}
			arr[j]=t;
		}
		return arr;
	}
	
	
	/**
	 * This method Sort a String by using insertion sort
	 * @param arr String type
	 * @return String [] 
	 */
	public String[] strInsertionSort(String[]arr) {
		for(int i=0;i<arr.length;i++)
    	{
    		for(int j=i;j>0;j--)
    		{
    			if(arr[j-1].compareTo(arr[j])>0)
    			{
    				String temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
				}
			}
		}
		return arr;
	}
	
	
	/**
	 * This method is used to sort the integer array using Bubble Sort
	 * @param ar
	 * @return
	 */
	public int[] intBubSort(int[]ar)
	{
		for(int i=0;i<ar.length;i++)
		{
			for(int j=0;j<ar.length;j++)
			{
				if(ar[i]>ar[j])
				{
					int temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
			}
		}
		return ar;
	}
	
	
	/**
	 * This method is used to sort the String type of Array
	 * @param str it takes parameter of type String array
	 * @return String array
	 */
	public String[] strBubSort(String[]str)
	{
		for(int i=0;i<str.length;i++)
		{
			for(int j=0;j<str.length;j++)
			{
				if(str[i].compareTo(str[j])>0)
				{
					String st=str[i];
					str[i]=str[j];
					str[j]=st;
				}
			}
		}
		return str;
	}
	
}
