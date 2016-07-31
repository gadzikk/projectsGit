package com.gadzik.command;

public abstract class Dish implements Order{
	protected String name;
	protected int price;
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	
	}
	

}
