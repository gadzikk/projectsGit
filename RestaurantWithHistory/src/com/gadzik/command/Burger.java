package com.gadzik.command;

public class Burger extends Dish {
	public Burger(){
		name= "Burger";
		price= 10;
	}

	@Override
	public void execute() {
		System.out.println("Burger was prepared , very fat food for hungry people");
		
	}

}
