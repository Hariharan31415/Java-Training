package day22;

public class task6{
	public static void backtrack(String str , String res , int index)
	{
		for(int i=index;i<str.length();i++)
		{
			res+=str.charAt(i);
			System.out.println(res);
			backtrack(str,res,i+1);
			res=res.substring(0,res.length()-1);
		}
		
	}
		
public static void main(String args[])
{
	String str = "abc";
	
	backtrack(str,"",0);
 



}
}
