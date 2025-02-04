package day8;

import java.util.regex.Pattern;

public class task7 {
public static void main(String args[])
{
  Pattern p = Pattern.compile("s"); 
  String[] s = p.split("this is java programming");
  for(String str:s)
  {
  System.out.println(str);
}}
}

