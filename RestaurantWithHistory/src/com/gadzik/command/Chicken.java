package com.gadzik.command;

public class Chicken extends Dish {
	public Chicken(){
		name="Chicken";
		price= 20;
	}

	@Override
	public void execute() {
		System.out.println("Chicken was prepared - taste food for a strong man !");
		
	}
}
