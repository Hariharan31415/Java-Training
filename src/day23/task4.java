package day23;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class task4 {
public static void main(String args[])
{
Scanner s = new Scanner(System.in);	
int n=s.nextInt();
int tar=s.nextInt();
int arr[]=new int[n];
boolean res[]=new boolean[tar+1];
List list = new ArrayList();

for(int i=0;i<n;i++)
{
  arr[i]=s.nextInt();
  if(arr[i]<=tar)
  {
	  res[arr[i]]=true;
	  list.add(arr[i]);
  }

}

res[0]=true;
for(int i=0;i<list.size();i++)
{
	for(int j=i+1;j<list.size();j++)
	{
		int sum = (Integer)list.get(i)+(Integer)list.get(j);
		
		if(sum<=tar)
		{
			res[sum]=true;
			//list.add(sum);
		}
	}
	
}

for(int i=1;i<tar-1;i++)
{	
	if(res[i]==true)
	{
	System.out.print(i+" ");
}}
System.out.print(res[tar]);
}
}
