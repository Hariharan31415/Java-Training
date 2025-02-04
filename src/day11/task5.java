package day11;

import java.util.Arrays;
import java.util.List;
import java.util.*;

public class task5 {
public static void main(String args[])
{
	List<String> name = Arrays.asList("Abi","Bob","Cop","Don");
	name.parallelStream().forEach(n -> System.out.print(n));
}
}



