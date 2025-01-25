package day5;
import java.util.*;
public class task1 {
public static void main(String args[])
{
	
	System.out.println(Thread.currentThread());
	
	System.out.println(Thread.currentThread().getName());
	
	System.out.println(Thread.currentThread().getPriority()); // default priority is 5
	
	Thread.currentThread().setName("hari");
	System.out.println(Thread.currentThread().getName());
	
	Thread.currentThread().setPriority(10);
	System.out.println(Thread.currentThread().getPriority());
	
	Thread.currentThread().setPriority(118);
	
	
}
}
