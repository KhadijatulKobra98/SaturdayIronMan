package com.upskill.assignment_2;

//8. Write Java Program to display Factorial of Number 7.

public class Assignment2_8 {
	
	public static void main(String[] args) {
 int num = 7; 
 long factorial =1;
 for (int i=1; i<=num; i++){
	 factorial *=i;
 }
	System.out.print("Factorial of 7 = " +factorial);
}

	}
