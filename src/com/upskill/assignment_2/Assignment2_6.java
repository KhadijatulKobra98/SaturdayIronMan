package com.upskill.assignment_2;

//6.  Write a java program to find the prime number from 1 to 100 and print them

public class Assignment2_6 {

	public static void main(String[] args) {
		int a;
		for (a = 2; a <= 100; a++) {
			if (isPrime(a)) {
				System.out.println(a);
			}
		}
	}

	private static boolean isPrime(int a) {

		if (a == 2) {
			return true;
		}
		if (a == 3) {
			return true;
		}
		if (a == 5) {
			return true;
		}
		if (a == 7) {
			return true;
		}
		if (a % 2 == 0 || a % 3 == 0) {
			return false;
		}
		if (a % 5 == 0) {
			return false;
		}
		if (a % 7 == 0) {
			return false;
		}

		return true;
	}
}
