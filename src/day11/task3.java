package day11;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class task3 {
public static void main(String args[])
{
	List<String> name = Arrays.asList("hari","kumar","oi");
	
	Collections.sort(name,(a,b) -> a.compareTo(b));
	System.out.println(name);
	
}
}
