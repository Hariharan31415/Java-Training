package day13;

class Stackrray{
	int arr[],top,MAX;
	
	public Stackrray(int top,int[] arr,int MAX)
	{
		this.top=top;
		
		this.MAX=MAX;
		this.arr[MAX]=arr[MAX];
	}
	
	void push(int val)
	{
		if(!isEmpty())
		{
		
		if(overflow())
		{
			
			arr[top]=val;
			top++;
		
			}
		
		else{
			System.out.println("overflow");
		}
	}
	}
	
	boolean overflow()
	{
		if(top<MAX)
		{
			return true;
		}
		else {
			return false;
		}
	}
	
	boolean isEmpty()
	{
		if(top==-1)
		{
			return true;
		}
		else {
			this.top++;
			return false; 
			
		}
	}
}


public class task1 {
public static void main(String args[])
{
   int top=-1;
   int MAX = 5;
   int arr[] = new int[MAX];
   Stackrray a = new Stackrray(top,arr,MAX);
   a.push(10);
}
}




