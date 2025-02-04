package day11;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class task8 {
public static void main(String args[])
{
	List<String> name = Arrays.asList("Abi","Bob","Cop","Don");
	List<String> aslist = name.stream()
			.filter(n->n.startsWith("D"))
			.map(String::toUpperCase)
			.sorted()
			.collect(Collectors.toList());
	 System.out.println(aslist);
	 
	List<Integer> in = name.stream()
			.map(String::length)
			.collect(Collectors.toList());

     System.out.println(in);
     
     List<String> list = name.stream()
 			.filter(n->n.contains("A"))
 			.map(String::toUpperCase)
 			.sorted()
 			.collect(Collectors.toList());
     System.out.println(list);
     
     String s = name.stream()
    		 .filter(n->n.startsWith("A"))
    		 .findFirst().orElse("No data Found");
     
     System.out.println(s);
     
     String ss = name.stream()
    		 .filter(n->n.startsWith("A"))
    		 .findFirst().orElse("No data Found");
     
     System.out.println(s);
}
}
