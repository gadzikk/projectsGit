
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Metodksy {
private boolean boo = true;
private int ccc = 0 ;
private BlockingQueue<Integer> s = new ArrayBlockingQueue<>(2);

public synchronized void produc() throws InterruptedException 
{
	while(!boo){
		try {
			wait();
		}catch (InterruptedException e) {e.printStackTrace();}
}
	ccc++;
	s.put(ccc);
	System.out.println(ccc + " dodano ...przez producenta");
	boo=false;
	try {
		Thread.sleep(200);
	}catch (InterruptedException e) {e.printStackTrace();}
	notify();
	
	
}
public synchronized void consu() throws InterruptedException
{
	while(boo){
		try {
			wait();
		} catch (InterruptedException e) {e.printStackTrace();}
}
	System.out.println(s.take() + " pobrano ...przez konsumenta");
	boo=true;
	try {
		Thread.sleep(200);
	} catch (InterruptedException e) {e.printStackTrace();}
	notify();
	
	
}

}
