package com.gadzik.safe;

public class MyRunnable implements Runnable {
	MySingleton singleton = MySingleton.getInstance();
	private int numberOfPerson;
	public MyRunnable() {
		this.numberOfPerson= singleton.getCurrentPerson();
	}
	
	public  void run(){
		
		int a = (int) (Math.random() * (3000 - 500)) + 500;
		try {
			Thread.sleep(a);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		int b = (int) (Math.random() * (6000 - 500)) + 500;
		singleton.showMessage();
		try {
			Thread.sleep(b);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		singleton.showMessage();
		singleton.entering();
		
		
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		
		}
		
		singleton.getOff();
		
		
	}
	

}
