package day14;

public class task5 {
	public static void main(String args[])
	{
	StringBuffer sb = new StringBuffer(5); // mutable string objet 
	System.out.println(sb.capacity());
	sb.ensureCapacity(8);
	System.out.println(sb.capacity()); // capacity twise the older capacity (n*2+2)
	
	}
}
