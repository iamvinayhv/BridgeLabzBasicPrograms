package com.BridgeLabz.Basics;

public class Utility {

	/**
	 * 1 This method is used to sort the integer array using Bubble Sort
	 * 
	 * @param ar
	 * @return
	 */
	public void intBubSort(int[] ar) {
		for (int i = 0; i < ar.length; i++) {
			for (int j = i + 1; j < ar.length; j++) {
				if (ar[i] > ar[j]) {
					int temp = ar[i];
					ar[i] = ar[j];
					ar[j] = temp;
				}
			}
		}
		System.out.println("After sorting the elements");
		intDisp(ar);
	}

	/**
	 * 2 This method is used to sort the integer array using Insertion Sort
	 * 
	 * @param arr
	 *            integer array
	 * @return integer type array
	 */
	public void intInsertionSort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int t = arr[i];
			int j = i;

			for (; j > 0; j--) {
				if (t < arr[j - 1]) {
					arr[j] = arr[j - 1];
				} else
					break;
			}
			arr[j] = t;
		}
		System.out.println("After sorting the elements");
		intDisp(arr);
	}

	/**
	 * 3 This method is used to Search for index of the Particular number
	 * 
	 * @param ar
	 *            integer array
	 * @param left
	 *            integer 0
	 * @param right
	 *            integer size of the array
	 * @param num
	 *            integer number to search
	 * @return integer index value of given number
	 */
	int v = 0;

	public int intBinSearch(int[] ar1, int left, int right, int num) {
		int[] ar = intSort(ar1);
		if (v == 0) {
			System.out.println("Sorted elements are");
			intDisp(ar);
		}

		if (left <= right) {
			v++;
			int mid = (left + right) / 2;
			if (ar[mid] == num)
				return mid;
			else if (ar[mid] > num)
				return intBinSearch(ar, left, mid - 1, num);
			else if (ar[mid] < num)
				return intBinSearch(ar, mid + 1, right, num);
		}
		return -1;
	}

	/**
	 * 1 This method is used to sort the String type of Array
	 * 
	 * @param str
	 *            it takes parameter of type String array
	 * @return String array
	 */
	public void strBubSort(String[] str) {
		for (int i = 0; i < str.length; i++) {
			for (int j = 0; j < str.length; j++) {
				if (str[i].compareTo(str[j]) < 0) {
					String st = str[i];
					str[i] = str[j];
					str[j] = st;
				}
			}
		}
		System.out.println("After sorting the elements");
		strDisp(str);
	}

	/**
	 * 2 This method Sort a String by using insertion sort
	 * 
	 * @param arr
	 *            String type
	 * @return String []
	 */
	public void strInsertionSort(String[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j > 0; j--) {
				if (arr[j - 1].compareTo(arr[j]) > 0) {
					String temp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = temp;
				}
			}
		}
		System.out.println("After sorting the elements");
		strDisp(arr);
	}

	int g = 0;

	public int strBinSearch(String[] str1, int left, int right, String St) {
		String[] str = strSort(str1);
		if (g == 0) {
			System.out.println("Sorted Elements are");
			strDisp(str);
		}

		if (left <= right) {
			g++;
			int mid = (left + right) / 2;
			if (str[mid].equals(St))
				return mid;
			else if (str[mid].compareTo(St) > 0)
				return strBinSearch(str, left, mid - 1, St);
			else if (str[mid].compareTo(St) < 0)
				return strBinSearch(str, mid + 1, right, St);
		}

		return -1;
	}

	public void intDisp(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ",");
		}
		System.out.println();
	}

	public void strDisp(String[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ",");
		}
		System.out.println();
	}

	public int[] intSort(int[] ar) {
		for (int i = 0; i < ar.length; i++) {
			for (int j = i + 1; j < ar.length; j++) {
				if (ar[i] > ar[j]) {
					int t = ar[i];
					ar[i] = ar[j];
					ar[j] = t;
				}
			}
		}
		return ar;
	}

	public String[] strSort(String[] str) {
		for (int i = 0; i < str.length; i++) {
			for (int j = i + 1; j < str.length; j++) {
				if (str[i].compareTo(str[j]) > 0) {
					String s = str[i];
					str[i] = str[j];
					str[j] = s;
				}
			}
		}
		return str;
	}

}
