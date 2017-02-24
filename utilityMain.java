package com.BridgeLabz.Basics;

import java.util.Scanner;

public class utilityMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Utility u = new Utility();
		int intChoice = 0;
		int strChoice = 0;

		System.out.println("Well Come to Sorting Utility\n");

		System.out.println("Press 1> For Integer types");
		System.out.println("Press 2> For String types\nEnter your choice");
		int choice = sc.nextInt();

		int n = 0;
		int m = 0;
		int[] array = new int[n];
		String[] sarray = new String[m];

		switch (choice) {
		case (1):
			System.out.println(
					"\nPress 1> For Bubble sort of Integer type\nPress 2> Insertion sort of Integer type\nPress 3> Binary Search of Integer type\n");
			intChoice = sc.nextInt();
			System.out.println("Enter the Number of elements");
			n = sc.nextInt();
			array = new int[n];

			System.out.println("Enter the " + n + " elements");
			for (int i = 0; i < n; i++) {
				array[i] = sc.nextInt();
			}

			break;

		case (2):
			System.out.println(
					"\nPress 1> For Bubble sort of String type\nPress 2> For Insertion sort of String type\nPress 3> For Binary Search of String type\n");
			strChoice = sc.nextInt();
			System.out.println("Enter the Number of elements");
			m = sc.nextInt();
			sarray = new String[m];

			System.out.println("Enter the " + m + " elements");
			for (int i = 0; i < m; i++) {
				sarray[i] = sc.next();
			}

			break;

		default:
			System.out.println("Chose Correct option");
			break;

		}

		switch (intChoice) {
		case (1):
			u.intBubSort(array);
			break;

		case (2):
			u.intInsertionSort(array);
			break;

		case (3):
			System.out.println("Enter the Number to Search");
			int num = sc.nextInt();
			int po = u.intBinSearch(array, 0, array.length - 1, num);
			if (po >= 0)
				System.out.println(num + " present at the index of " + po);
			else
				System.out.println(num + " Not Found ");

		default:
			System.out.println("Chose Correct option");
			break;

		}

		switch (strChoice) {
		case (1):
			u.strBubSort(sarray);
			break;

		case (2):
			u.strInsertionSort(sarray);
			break;

		case (3):
			System.out.println("Enter the word to Search");
			String num = sc.next();
			int po = u.strBinSearch(sarray, 0, sarray.length - 1, num);
			if (po >= 0)
				System.out.println(num + " present at the index of " + po);
			else if (po == -1)
				System.out.println(num + " Not Found ");

		default:
			System.out.println("Chose Correct option");

		}

	}

}
