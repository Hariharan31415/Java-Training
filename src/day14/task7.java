package day14;

public class task7 {
	public static void main(String args[])
	{
        String s1="bank";
        String s2="knab"; 
	     StringBuilder s = new StringBuilder(s1);
	        if(s1.equals(s2))
	        {
	            System.out.println("true");

	        }
	        
	        s1=s.reverse().toString();
	        System.out.println(s1);
	        
	        if(s1.equals(s2))
	        {
	           System.out.println("true");
	        }

	       //System.out.println("false");
	    }
	}



/*
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int sp , ep,n=nums.length ;
        int arr[] = new int[2];
        for(int i=0;i<nums.length;i++)
        {
            if(target==nums[i])
            {
                sp=i;
                arr[0]=sp;
                break;
            }
        }
        for(int i = (sp+1);i<n-sp;i++)
        {
            if(target==arr[i])
            {
                sp=i;
                arr[1]=sp;
            }
        }
         
        return arr;
    }
}
*/