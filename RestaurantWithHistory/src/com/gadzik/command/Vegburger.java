package com.gadzik.command;

public class Vegburger extends Dish {
	public Vegburger(){
		name= "Vegburger";
		price= 15;
	}

	@Override
	public void execute() {
		System.out.println("Vegburger was prepared - you know what you eat");
		
	}
}
