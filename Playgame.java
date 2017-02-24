package com.BridgeLabz.Basics;

import java.util.Scanner;

public class Playgame {

	static Scanner sc = new Scanner(System.in);

	static String user1;
	static String user2;

	static {
		System.out.println("Enter User 1 name");
		user1 = sc.next();

		System.out.println("Enter User 2 name");
		user2 = sc.next();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Playgame cg = new Playgame();

		String str[][] = new String[3][3];

		str[0][0] = "1";
		str[0][1] = "2";
		str[0][2] = "3";
		str[1][0] = "4";
		str[1][1] = "5";
		str[1][2] = "6";
		str[2][0] = "7";
		str[2][1] = "8";
		str[2][2] = "9";

		cg.disp(str);

		while (cg.i < 9) {
			// System.out.println(cg.i);

			if (cg.i % 2 == 0) {
				// Random r=new Random();
				// int num=r.nextInt(9);
				System.out.println(user1 + "\nEnter your box Number");
				int num = sc.nextInt();

				if (num != 0 && cg.checkDuplicate(num)) {
					cg.cTurn(str, num);
					cg.CWinTest(str);
				} else {
					System.out.println(user1 + " This box is Already filled");
				}

			} else {
				System.out.println(user2 + "\nEnter your box Number");
				int box = sc.nextInt();
				if (cg.checkDuplicate(box)) {

					cg.uTurn(str, box);
					cg.uWinTest(str);
				} else {
					System.out.println(user2 + " This box is Already filled");
				}
				System.out.println("----------------------------");
			}
		}

		System.out.println("Match Drawn!!!");
	}

	public void cTurn(String[][] str, int r) {

		System.out.println(user1 + " takes: " + r);

		if (r == 1 && str[0][0] != "X" && str[0][0] != "U")
			str[0][0] = "X";

		else if (r == 2 && str[0][1] != "X" && str[0][1] != "U")
			str[0][1] = "X";

		else if (r == 3 && str[0][2] != "X" && str[0][2] != "U")
			str[0][2] = "X";

		else if (r == 4 && str[1][0] != "X" && str[1][0] != "U")
			str[1][0] = "X";

		else if (r == 5 && str[1][1] != "X" && str[1][1] != "U")
			str[1][1] = "X";

		else if (r == 6 && str[1][2] != "X" && str[1][2] != "U")
			str[1][2] = "X";

		else if (r == 7 && str[2][0] != "X" && str[2][0] != "U")
			str[2][0] = "X";

		else if (r == 8 && str[2][1] != "X" && str[2][1] != "U")
			str[2][1] = "X";

		else if (r == 9 && str[2][2] != "X" && str[2][2] != "U")
			str[2][2] = "X";

		System.out.println(user1 + " turn over");
		System.out.println("----------------------------\n\n");
		disp(str);
	}

	public void uTurn(String[][] str, int box) {
		checkDuplicate(box);
		System.out.println(user2 + " takes: " + box);

		if (box == 1 && str[0][0] != "X" && str[0][0] != "U")
			str[0][0] = "U";

		else if (box == 2 && str[0][1] != "X" && str[0][1] != "U")
			str[0][1] = "U";

		else if (box == 3 && str[0][2] != "X" && str[0][2] != "U")
			str[0][2] = "U";

		else if (box == 4 && str[1][0] != "X" && str[1][0] != "U")
			str[1][0] = "U";

		else if (box == 5 && str[1][1] != "X" && str[1][1] != "U")
			str[1][1] = "U";

		else if (box == 6 && str[1][2] != "X" && str[1][2] != "U")
			str[1][2] = "U";

		else if (box == 7 && str[2][0] != "X" && str[2][0] != "U")
			str[2][0] = "U";

		else if (box == 8 && str[2][1] != "X" && str[2][1] != "U")
			str[2][1] = "U";

		else if (box == 9 && str[2][2] != "X" && str[2][2] != "U")
			str[2][2] = "U";

		System.out.println(user2 + " turn over");
		disp(str);
	}

	public void disp(String[][] str) {
		for (int i = 0; i < str.length; i++) {
			for (int j = 0; j < str[i].length; j++) {
				System.out.print("|_" + str[i][j] + "_|");
			}
			System.out.println();
		}

		System.out.println("\n");
	}

	public void uWinTest(String[][] str) {
		if (str[0][0] == "U" && str[0][1] == "U" && str[0][2] == "U"
				|| (str[1][0] == "U" && str[1][1] == "U" && str[1][2] == "U")
				|| (str[2][0] == "U" && str[2][1] == "U" && str[2][2] == "U")
				|| (str[0][0] == "U" && str[1][0] == "U" && str[2][0] == "U")
				|| (str[0][1] == "U" && str[1][1] == "U" && str[2][1] == "U")
				|| (str[0][2] == "U" && str[1][2] == "U" && str[2][2] == "U")
				|| (str[0][0] == "U" && str[1][1] == "U" && str[2][2] == "U")
				|| (str[0][2] == "U" && str[1][1] == "U" && str[2][0] == "U")) {
			// System.out.println("Congrats "+user2+" you Won the match Give
			// Treat to "+user1);
			System.out.println("Congrats " + user2 + " you Won the match take Treat from " + user1);
			System.exit(0);
		}
	}

	public void CWinTest(String[][] str) {
		if (str[0][0] == "X" && str[0][1] == "X" && str[0][2] == "X"
				|| (str[1][0] == "X" && str[1][1] == "X" && str[1][2] == "X")
				|| (str[2][0] == "X" && str[2][1] == "X" && str[2][2] == "X")
				|| (str[0][0] == "X" && str[1][0] == "X" && str[2][0] == "X")
				|| (str[0][1] == "X" && str[1][1] == "X" && str[2][1] == "X")
				|| (str[0][2] == "X" && str[1][2] == "X" && str[2][2] == "X")
				|| (str[0][0] == "X" && str[1][1] == "X" && str[2][2] == "X")
				|| (str[0][2] == "X" && str[1][1] == "X" && str[2][0] == "X")) {
			// System.out.println("Congrats "+user1+" you Won the match Take
			// Treat from "+user2);
			System.out.println("Congrats " + user1 + " you  Won the match Give Treat to " + user2);
			System.exit(0);
		}
	}

	int i = 0;
	int[] store = new int[9];

	public boolean checkDuplicate(int num) {
		for (int j = 0; j < i; j++) {
			// System.out.println("Val "+store[j]);
			if (store[j] == num) {
				return false;
			}
		}
		store[i] = num;
		if (i <= 9)
			i++;

		return true;
	}

}
