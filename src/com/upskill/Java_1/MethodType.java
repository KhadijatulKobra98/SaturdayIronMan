package com.upskill.Java_1;

public class MethodType {
	
	/* Types of Method
	 1. Void Method
	 2. Static Method
	 3. Return Type Method 
	 */

	public static int hourlyIncome = 65;
	
	public static void main(String[] args) {
		
		MethodType obj = new MethodType();
		obj.annualIncomeVoid();
		System.out.println("My Monthly Income = " + obj.monthlyIncomeReturn());
		
		WeeklyIncomeStatic();
	}
	
	//void method
	public void  annualIncomeVoid(){
		int calculateAnnualIncome = hourlyIncome* 2000;
		System.out.println("My Annual Income = " + calculateAnnualIncome);
		
	}
	//Return type  method
	 public int monthlyIncomeReturn(){
	 int calculateMonthlyIncome = hourlyIncome * 180;
	 return calculateMonthlyIncome;
	 
	 }
	 // Static Method
	 public static void WeeklyIncomeStatic(){
		 int calculateWeeklyIncome = hourlyIncome * 40;
		 System.out.println("My Annual Income = " + calculateWeeklyIncome); 
	 }
	 
}