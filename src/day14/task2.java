package day14;

public class task2 {
	public static void main(String args[])
	{
	    String s1="Thi";
	    
	    String arr[] = s1.split(" ");
	    for(String str : arr)
	    {
	    System.out.println(str);
	    System.out.println("**");
	    }
	    char c_arr[] = new char[s1.length()];	   
	    s1.getChars( 0,3,c_arr, 0);
	    System.out.println(c_arr);
	
	
	}
}
