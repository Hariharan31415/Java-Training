package day14;

public class task3 {
public static void main(String args[])
{
	 StringBuilder sb = new StringBuilder("java code");
	 sb.append("hari");
	 System.out.println(sb);
	 sb.insert(5,"practise");
	 System.out.println(sb);
	 sb.indexOf("practise");
	 System.out.println(sb.indexOf("practise"));
	 System.out.println(sb.lastIndexOf("se"));
	 System.out.println(sb.replace(0,3,"python"));
	 System.out.println(sb.substring(0));
	 System.out.println(sb.substring(0,3));
	 System.out.println(sb.reverse());
}
}
