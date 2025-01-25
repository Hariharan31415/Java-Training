package day5;

class Stock{
	int n;
	boolean status = false;
	
	synchronized public void set(int n) {
		
		this.n=n;
		while(status)
		{
			try {
				wait();
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			status=true;
			notifyAll();
		}
		System.out.println("set :"+n);
		
	}
	synchronized public void get() {
		while(!status)
		{
			try {
				wait();
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			status=false;
			notifyAll();
		}
		System.out.println("get :"+n);	
	}
	
}

class Producer implements Runnable {
	Stock s;
	int i=0;
	public Producer(Stock s) {
		this.s=s;
		Thread t1=new Thread(this,"producer"); // convert the producer obj into thread-"producer"
		t1.start();
	}
	public void run() {
		int i=0;
		while(true)
		{
			s.set(i++);
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				System.out.println(e);
			}
		}
		
	}
	
} 

class Consumer implements Runnable{
	Stock s;
	public Consumer(Stock s){
		this.s=s;
		Thread t2 = new Thread(this,"consumer");
		
		t2.start();
	}
	public  void run() {
			while(true)
			{
				s.get();
				try {
					Thread.sleep(1000);	
				}
				catch(InterruptedException ee) {
					System.out.println(ee);
				}
			}
		
	}
}


public class task9 {
public static void main(String args[]) {
	Stock s = new Stock();
	Producer p = new Producer(s);
	Consumer c = new Consumer(s);
}
}
