package com.programs.numerics;

public class Factorial {
	public static int factorialRecursion(int n) {
		if (n == 0) {
			return 1;
		} else {
			return n * factorialRecursion(n - 1);
		}
	}

	public static int factorialIterative(int n) {
		if (n == 0 || n == 1) {
			return 1;
		} else {
			int result = 1;
			for (int i = 1; i <= n; i++) {
				result = result * i;
			}
			return result;
		}
	}

}
