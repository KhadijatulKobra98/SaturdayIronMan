package com.upskill.java_3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

public class Array_Hashmap_Hashset_HashTable {

	public static void main(String[] args) {
		
		//Array store multiple data using index
		
		int age = 30;                              //Variable
		String name="faria";
		int[] ageIronMan = new int[]{25, 32, 37, 21, 27}; //Array
		String[] nameIronMan = new String[]{"Faria","Santa","Swapon","Amama","Farhana"};
		//Array Index                [0],[1],[2],[3],[4]
		
		System.out.println("Student Age: " + ageIronMan[2]);
	    System.out.println("Total Student: "+ ageIronMan.length);
	    
		System.out.println("Student Name: " + nameIronMan[0]);
		System.out.println("Total Student: " + nameIronMan.length);
		
		//Multi dimentinal array
		int[][] ageIronMan2D ={{25, 32, 37, 21, 27,32},                 //[0][0],[0][1],[0][2],[0][3],[0][4],[0][5]
				                        {26, 30, 33, 28}};               //[1][0],[1][1],[1][2],[1][3]
		System.out.println("Student Age 2D: " + ageIronMan2D[0][1]);
		
		// Hashmap store multiple data using key-value pair, Implementation of map interface
		
		HashMap<String, Integer>Student = new HashMap<String,Integer>();
		Student.put("Yusuf", 28);
		Student.put("Abdullah", 22);
		Student.put("Madan", 32);
		Student.put("Jannatul", 24);
		Student.put("Faria", 25);
		System.out.println("Hashmap Student Age: " + Student.get("Faria"));
		 
		HashMap<String,String>Capital = new HashMap<String,String>();
		Capital.put("USA", "Washington D.C.");
		Capital.put("Bangladesh", "Dhaka");
		Capital.put("India", "New Delhi");
		System.out.println("Hashmap Capital: " + Capital.get("USA"));
		
		//Hashset store unordered collection containing unique value, Implementation of map interface, no duplicate value allowed
		
		HashSet<String> car = new HashSet<String>();
		car.add("BMW");
		car.add("Toyata");
		car.add("Tesla");
		car.add("Audi");
		car.add("Tesla");
		System.out.println("Car : " +car);
		
		//Hahstable store multiple data using key-value pair, No duplicate,
		//   also is synchronized (only one thread can be modified)
		Hashtable<String, String> Region = new Hashtable<String, String>();
		Region.put("BD", "Asia");
		Region.put("USA", "America");
		Region.put("UK", "Europe");
		System.out.println("Region :" + Region.get("BD"));
		} 
	}


