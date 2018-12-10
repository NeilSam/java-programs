package com.programs.strings;

public class StringBalance {

	public static int balancedStringOrNot(String input1) {
		int openIndexCounter = 0;
		int closeIndexCounter = 0;
		int openCounter = 0;
		int closeCounter = 0;
		for (int i = 0; i < input1.length(); i++) {
			if (input1.charAt(i) == '{' || input1.charAt(i) == '(' || input1.charAt(i) == '[') {
				openIndexCounter = openIndexCounter + i;
				openCounter++;
			}
			if (input1.charAt(i) == '}' || input1.charAt(i) == ')' || input1.charAt(i) == ']') {
				closeIndexCounter = closeIndexCounter + i;
				closeCounter++;
			}
		}
		if (openCounter == 0 & closeCounter == 0) {
			return 1;
		} else if (openCounter == closeCounter && closeIndexCounter > openIndexCounter) {
			System.out.println("Open Counter: " + openCounter);
			System.out.println("Open index Counter: " + openIndexCounter);
			System.out.println("Close Counter: " + closeCounter);
			System.out.println("Close Index Counter" + closeIndexCounter);
			return 1;
		} else {
			System.out.println("Open Counter: " + openCounter);
			System.out.println("Open index Counter: " + openIndexCounter);
			System.out.println("Close Counter: " + closeCounter);
			System.out.println("Close Index Counter" + closeIndexCounter);
			return -1;
		}

	}

	public static void main(String args[]) {
		String s = "{)";
		int x = StringBalance.balancedStringOrNot(s);
		System.out.println(x);
	}

}
