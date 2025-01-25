package day5;

class Trainner{
	
	synchronized void printTable(int n) {
		
	
		for(int i=1;i<=10;i++)
		{
			System.out.println(i + "*" +n + "=" +(i*n));
		}
	}
}
class Ece extends Thread{
	Trainner t ;
	public Ece(Trainner t)
	{
		this.t=t;
	}
	public void run()
	{
		t.printTable(6);
	}
}

class Cse extends Thread{
	Trainner t ;
	public Cse(Trainner t)
	{
		this.t=t;
	}
	public void run()
	{
		t.printTable(5);
		
	}
}

public class task8 {

	public static void main(String args[])
	{
		
		Trainner t = new Trainner(); 
		Cse cse = new Cse(t);
		Ece ece = new Ece(t);
		
	    cse.start();
		ece.start();
		
	}
}
