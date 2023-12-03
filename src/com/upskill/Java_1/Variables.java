package com.upskill.Java_1;

public class Variables {
	
	// Variables in java
	// Instance or global variables- Variables declared in class level;, outside method
	// local - Variables declared in method
	// Static - variables belong to class and don't require creating object
	// Method parameter - Variable used as method parameter= pass data from outside to inside
	
	public String country = "USA";                 // Instance or global variables- Variables declared in class level;, outside method
	public static String region = "North America"; // Static - variables belong to class and don't require creating object

	public static void main(String[] args) {
		Variables obj = new Variables();
		System.out.println(obj.country);
	
	String City = "New York";
	String police = "NYPD";
	nj("Essex");
	pa("Bensalem");

	}
public static void nj( String county){
	String City = "Bloomfield";                    // local - Variables declared in method
	String police = "BPD";
	System.out.println(City);
	System.out.println(police);
	System.out.println(county);
}
public static void pa(String county){             //// Method parameter - Variable used as method parameter
	
	String City = "Phili";
	String police = "PPD";
	System.out.println(City);
	System.out.println(police);
	System.out.println(county);
}
}
