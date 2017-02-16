package com.BridgeLabz.Basics;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class BinarySearchForWordFromFile {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		FileWriter fw = null;
		

		try {
			fw = new FileWriter("/home/bridgeit/vinay/File/Write.txt", false);
		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			fw.write("45,78,23,12,98,22,56,99");
			fw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}

		FileReader fr = null;
		String st = "";

		try {
			fr = new FileReader("/home/bridgeit/vinay/File/Write.txt");
			int x = fr.read();

			while (x != -1) {
				char c = (char) x;
				st = st + c;
				x = fr.read();

			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		BinarySearchForWordFromFileUtility bs = new BinarySearchForWordFromFileUtility();

		System.out.println("Readed input From the file");
		System.out.println(st);

		String[] str = st.split(",");

		int[] arr1 = bs.convert(str);

		System.out.println("\nEnter the word to Search");
		int num = sc.nextInt();

		int[] arr2 = bs.sort(arr1);

		boolean res = bs.intBinSearch(arr2, 0, arr2.length, num);

		int[] last;

		if (res) {
			System.out.println("Given word is Present");
			System.out.println("Result with remove for " + num);
			last = bs.removeWord(arr1, num);

		}

		else {
			System.out.println("Given word Not Present");

			System.out.println("Result with Added for " + num);
			last = bs.appendWord(arr1, num);
		}

		bs.disp(last);

		String Srt = "";

		for (int i = 0; i < last.length; i++) {
			Srt = Srt + last[i] + ",";
		}
		
		

		try {
			
			fw = new FileWriter("/home/bridgeit/vinay/File/Write.txt", false);
			fw.write("");
			fw.write(Srt);
			fw.flush();
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		sc.close();
	}

}
