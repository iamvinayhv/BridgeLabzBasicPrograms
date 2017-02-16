package com.BridgeLabz.Basics;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class LinkedListFile 
{
	FileWriter fw = null;
	public String[] getFile() 
	{

		FileWriter fw = null;
		

		try {
			fw = new FileWriter("/home/bridgeit/vinay/LinkedListFile/Write.txt");
		} catch (IOException e1) {
			e1.printStackTrace();
		}

		try {
			fw.write("Cat,Camel,Lion,Tiger,Mango,Apple,Orange");
			fw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}

		FileReader fr = null;
		String st = "";
		
		try {
			fr = new FileReader("/home/bridgeit/vinay/LinkedListFile/Write.txt");
			int x = fr.read();

			while (x != -1) {
				char c = (char) x;
				st = st + c;
				x = fr.read();

			}
		} catch (Exception e11) {
			e11.printStackTrace();
		}
		
		String[]str = st.split(",");
		
		return str;
	
	}
	
	public boolean addToFile(String str)
	{
		
		try 
		{
			fw = new FileWriter("/home/bridgeit/vinay/LinkedListFile/Write.txt", false);
			fw.write("");
			fw.write(str);
			fw.flush();
			fw.close();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		
		return true;
	}
}
