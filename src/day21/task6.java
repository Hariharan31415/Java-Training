package day21;

public class task6 {
	public static int hashChar(char ch , int pos)
	{
		static final int P = 31;
		
		static final long M=100000007;
		int val = ch-'a'+1;
		long hash = (val*(long) Math.pow(P, pos))%M;
	}
public static void main(String args[])
{
	
char ch = 'c';
int pos = 2;
System.out.println(hashChar(ch,pos));

}
}
