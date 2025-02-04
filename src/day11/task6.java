package day11;

import java.util.Arrays;
import java.util.List;
import java.util.*;

public class task6 {
public static void main(String args[])
{
	List<Integer> num = Arrays.asList(1,2,3,4,5,6);
	num.stream()
	.filter(n-> n % 2==0)
	.forEach(n->System.out.println(n));
}
}



