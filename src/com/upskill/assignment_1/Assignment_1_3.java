package com.upskill.assignment_1;

public class Assignment_1_3 {
	
	public static void main(String[] args) {
		Assignment_1_3 obj = new Assignment_1_3();
		
		System.out.println("MultipliedReturns = " + obj.FunctionReturns());
		System.out.println("FinalReturns = " +obj.FinalReturns());
	
} public int FunctionReturns(){
		
		int a = 9;
		int b = 11;
	    int	MultipliedValue = a*b;
		return MultipliedValue;
	}
 public int FinalReturns(){
	
	int a = 9;
	int b = 11;
    int	FinalValue = a+b+(a*b);
	return FinalValue;
}

}
