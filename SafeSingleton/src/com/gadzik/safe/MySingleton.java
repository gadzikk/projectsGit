package com.gadzik.safe;



public class MySingleton {
	private volatile static MySingleton instance;
	private int temperature;
	private int currentPersonsOnPool;
	private MySingleton(){
		this.temperature= 24;
		this.currentPersonsOnPool= 0;
	}
	public static MySingleton getInstance()
	{
		if(instance==null){
			synchronized(MySingleton.class)
			{
				if(instance==null){
					instance = new MySingleton();
				}
			}
		}
		return instance;
	}
	public void showMessage(){
		System.out.println("Welcome to our swimmingpool");
	}
	public synchronized void GetIn(){
		currentPersonsOnPool++;
		System.out.println("Current number of persons in the swimmingpool is " + currentPersonsOnPool);
	}
	
	public synchronized int  getCurrentPerson(){
		return this.currentPersonsOnPool;
	}
	public int getTemperature(){
		return this.temperature;
	}
	public synchronized void entering(){
		
		GetIn();
		
	}	
		

	public synchronized void getOff(){
		this.currentPersonsOnPool--;
		System.out.println("Person is exiting , number of persons in the swimmingpool is " + currentPersonsOnPool);
	}
		
	
	
		
	
}