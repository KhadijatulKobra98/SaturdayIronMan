package com.upskill.assignment_2;

//3. Write two java functions which will return two different integer values, write a 
	   //  program to compare those numbers and send message that one number is bigger 
	   //  than other. (hints: using if..else)

public class Assignment2_3 {
	public static int a = 10;
	public static int b = 9;
	
	public static void main(String[] args) {
		Assignment2_3 obj = new Assignment2_3() ;
        System.out.println("Number1 = "+ obj.number1());
        System.out.println("Number2 = "+obj.number2());
        if (b>a){
        	 System.out.println("Number 2 is bigger than number 1");}
        else if (a==b){
        	System.out.println("Numbers must be different");}
        	 else {
        		 System.out.println("Number 1 is bigger than number 2");
        	 }
        }
        
	
	
	public int number1(){
	return a;
}
	public int number2(){
		return b;
	}
}