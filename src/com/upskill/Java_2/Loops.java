package com.upskill.Java_2;

public class Loops {
	
	/* 	
 	Type of Loops
  		1. For Loop
  		2. While Loop- NO UPPER limit but use condition. also known as conditional loop
  		3. Do While Loop
  		4. Infinite Loop
 */

	public static void main(String[] args) {
//		practiceForLoops();
//		practiceForLoops2();
//		PracticeWhileLoop();
//		PracticeDoWhileLoop();
//		PracticeInfiniteLoop();
		PracticeNestedLoop();
	}
	
	public static void practiceForLoops(){                     //For Loops- Do again and again up to upper limit
		int i;                                                 // initializing the variable
		for(i=1; i<=10; i++){                                  // Setting lower limt,upper limit, Increment or decrement
			System.out.println("For Loops number= " + i);      // statement
		}
	}
		
		public static void practiceForLoops2(){
			int i;
			for(i=10; i>=1; i--){
				System.out.println("For Loops number= " + i);
	}
			}
		public static void PracticeWhileLoop(){                 // While loop- Do again and again untill condition match
			int i = 1;                                          // initializing the variable
			while(i<=10){                                       // Setting condition
				System.out.println("While Loops number= " + i); // Statement
				i++;                                            // Increment or decrement
			}
		}
		public static void PracticeDoWhileLoop(){                   //do while loop- do action then match condition
			int i = 1;                                              // initializing the variable                                         
			do{
				System.out.println("Do While Loops number= " + i);  // Statement
				i++;                                                // Increment or decrement
			}while(i<=10);                                          // checking condition
			}
		public static void PracticeInfiniteLoop(){                  //Infinite Loop- never ending loop
			int i;                                                  //Initializing the variable
			for(i=1;   ; i++){                                      //Setting no upper limit
				System.out.println("Infinite Loops number= " + i);  // Statement
			}
		}
		public static void PracticeNestedLoop(){                    // Nested loop- loop inside another loop
			int i;                                                  // initializing i variable for loop 1
			int j;                                                  // initializing j variable for loop 2
			
			for(i=1; i<=10; i++){                                   // first loop for i
				for(j=1;j<=10;j++){                                 // Second loop for j
					int mulplicatonTable = i*j;                     //
					System.out.print(mulplicatonTable+ "|");        // statement for loop 1	
				}
				System.out.println("->");                          // statement for loop 2
			}
		}
		}

