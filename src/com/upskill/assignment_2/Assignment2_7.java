package com.upskill.assignment_2;

//7.  You are given two integer number (a=25, b=30), write a program to swap them and display result on the screen

public class Assignment2_7 {
	public static int a = 25;
	public static int b = 30;
	

	public static void main(String[] args) {
		System.out.println("a =" +a);
		System.out.println("b =" +b);
		System.out.println("After swapping:");
		swapatob();
		
	}
	public static  void swapatob(){
		  a = 30;
		  b= 25; 
		System.out.println( "a= "+a);
		System.out.println("b= " +b);
	}

}
