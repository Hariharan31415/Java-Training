package day7;

import java.util.Vector;

public class task1 {
public static void main(String args[])
{
	Vector v = new Vector(10,5); // (initial capacity , incremented capacity) actual capacity 10 after incermented 5 
	int i;
	for(i=0;i<10;i++)
	{
	
		v.addElement(i);
	}
	System.out.println(v);
	System.out.println(v.capacity()); // 10
	v.addElement("hari");  // support hetrogeneous 
	
	System.out.println(v);  // [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, hari]
	System.out.println(v.capacity()); // 20 because the capcity is increment twist the actual capicity 
}
}
