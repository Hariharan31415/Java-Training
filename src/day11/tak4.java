package day11;

import java.util.Arrays;
import java.util.List;
import java.util.*;

public class tak4 {
public static void main(String args[])
{
	List<String> name = Arrays.asList("A","B","C","D");
	name.stream().forEach(n -> System.out.print(n));
}
}
