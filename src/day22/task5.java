package day22;

public class task5{
	public static void backtrack(int arr[],boolean used[],String res,int n)
	{
		if(res.length()==arr.length)
		{
			System.out.println(res);
			return;
		}
		
		for(int i=0;i<n;i++)
		{
			if(!used[i])
			{
				used[i]=true;
				backtrack(arr,used,res+arr[i],n);
				used[i]=false;
			}
		}
	}
		
public static void main(String args[])
{
	int  arr[] = {1,2,3};
	boolean used[]=new boolean[arr.length];
	backtrack(arr,used,"",arr.length);
	
 



}
}
