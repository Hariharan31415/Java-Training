package day14;

public class task1 {
	public static void main(String args[])
	{
	    String s1="java programming";
	    
	    String s2 = "Java";
	    String s3 = " Java";
	    String s4 = "java";
	   
	    System.out.println(s1.charAt(2)); // s1 --> v
	    System.out.println(s1.indexOf("in"));

	    System.out.println(s1.lastIndexOf("a"));
	    System.out.println(s1.replace("java" , "python"));
	    System.out.println(s1); // it print the java programming because strings are immutable 
	    System.out.println(s1.substring(1,3));
	    System.out.println(s1.startsWith("ja"));
	    System.out.println(s1.endsWith("ing")); // true 
	    System.out.println(s1.equals(s3)); // false 
	    System.out.println(s2.equals(s3.trim())); // trim is remove the space .
	    System.out.println(s2.equals(s4)); // false 
	    System.out.println(s2.equalsIgnoreCase(s4)); // true 
	    System.out.println(s2.compareTo(s4));
	    System.out.println(s2.compareToIgnoreCase(s4));
	  
	}
}
