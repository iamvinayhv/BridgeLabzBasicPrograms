package org.json;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class DataInventryManagement 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		FileWriter fw = null;
		JSONObject job1 = new JSONObject();
		JSONObject job2 = new JSONObject();
		JSONArray ja ;
		
		
		
		String name = null;

		try 
		{
			fw = new FileWriter("/home/bridgeit/vinay/JSONFile/jsonDataManagementFile.txt");
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}

		System.out.println("Enter the number of Products you want to keep");
		int n = sc.nextInt();
		
		for(int i=0;i<n;i++)
		{
			
			System.out.println((i+1)+">\tEnter the name of the Product");
			String pName=sc.next();
			
			System.out.println("Enter the number of Items in "+pName+" Product");
			int m=sc.nextInt();
			
			JSONObject job3 = new JSONObject();
			
			for(int j=0;j<m;j++)
			{
				System.out.println((j+1)+">\tEnter the Brand name");
				name=sc.next();
				
				JSONArray jar=new JSONArray();
				
				System.out.println("Enter the Quantity of "+name+" in Kgs");
				double weight=sc.nextDouble();
				System.out.println("Enter the Price of "+name+" per Kg");
				double price=sc.nextDouble();
				
				double tAmt=price*weight;
				
				System.out.println(tAmt);
				
				jar.add("Weigth		="+weight+" Kg");
				jar.add("Price		="+price+" per Kg");
				jar.add("Total amt	="+tAmt);
				
				job3.put(name, jar);
				
			}
			
			job2.put(pName, job3);
			job1.put("Products", job2);
			
		}
		
		
		try 
		{
			fw.write(job1.toString());
			fw.flush();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		
		
		Iterator i ;
		
		try {
			FileReader fr=new FileReader("/home/bridgeit/vinay/JSONFile/jsonDataManagementFile.txt");
			
			JSONParser par=new JSONParser();
			
			Object ob=par.parse(fr);
			
			JSONObject job=(JSONObject)ob;
			
			System.out.println("Rice");
			ja = (JSONArray) job.get("Rice");

			i = ja.iterator();

			while (i.hasNext()) 
			{
				System.out.println(i.next());
			}
			
			System.out.println("Wheat");
			ja = (JSONArray) job.get("Wheat");

			i = ja.iterator();

			while (i.hasNext()) 
			{
				System.out.println(i.next());
			}
			
			
			
			System.out.println("Pulse");
			ja = (JSONArray) job.get("Pulse");

			i = ja.iterator();
			
			while (i.hasNext()) 
			{
				System.out.println(i.next());
			}
			
			
			
		
		} 
		catch (IOException | ParseException e) 
		{
			e.printStackTrace();
		}
		
	}
}
