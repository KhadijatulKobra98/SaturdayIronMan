package com.upskill.java_5;

public class AbstractClassImplementation extends AbstractClass{

	@Override
	public void iDoor() {
		
		System.out.println("My Car has 4 door");
	}

	@Override
	public int iWheel() {
		System.out.println("My Car has 4 Wheel");
		return 3;
	}

	@Override
	public void iColor() {
		System.out.println("My Car is RED");
	}

	@Override
	public String iEngine() {
		System.out.println("My Car has dual motor engine");
		return "Dual Motor";
	}

}
