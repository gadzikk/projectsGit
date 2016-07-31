package com.gadzik.safe;

public class Mains {
	public static void main(String[] args){
		Thread b = new Thread(new MyRunnable());
		b.start();
		Thread c = new Thread(new MyRunnable());
		c.start();
		Thread d = new Thread(new MyRunnable());
		d.start();
		Thread e = new Thread(new MyRunnable());
		e.start();
		Thread f = new Thread(new MyRunnable());
		f.start();
		Thread g = new Thread(new MyRunnable());
		g.start();
		Thread h = new Thread(new MyRunnable());
		h.start();
		Thread i = new Thread(new MyRunnable());
		i.start();
		
	}

}
