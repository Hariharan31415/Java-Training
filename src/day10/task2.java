

interface Second1{
	abstract void aclass(); // this is abstract class 
	
	default  void fun() { // this is a default method 
		System.out.println("default method ");
	}
	
	
}



public class task2 {
public static void main()
{
     Second1 s = new Second1() {
    	 
    	public void aclass() {
    		 System.out.println("abstract class... from anonymous inner class...");
    	 }
     };     
     
}
}

