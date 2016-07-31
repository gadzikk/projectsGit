
import java.util.concurrent.CountDownLatch;



public class Watki {
Metodksy m = new Metodksy();

	public static void main(String[] args) {
		Watki v = new Watki();
		v.init();}

	private void init(){
		CountDownLatch latch = new CountDownLatch(10);
		Thread t = new Thread(new Producer());
		t.start();
		Thread u = new Thread(new Consumer(latch));
		u.start();
		try {
			latch.await();
		} catch (InterruptedException e) {e.printStackTrace();}
		System.out.println("wszystkie produkty zostaly pobrane przez konsumenta , zakonczenie dzialan");
		
	}
private class Producer implements Runnable{
	
	public void run()
	{
		for(int i=0;i<10;i++){

			try {
				m.produc();
			} catch (InterruptedException e) {e.printStackTrace();}
		}
	}
}
private class Consumer implements Runnable{
	CountDownLatch latch = null;
	public Consumer(CountDownLatch latch)
	{
		this.latch=latch;
	}

	public void run()
	{
		for(int i=0;i<10;i++){
		try {
			m.consu();
		} catch (InterruptedException e) {e.printStackTrace();}
		latch.countDown();
		}
	}
}
	
	
}
