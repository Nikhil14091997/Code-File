import java.util.*;
import java.io.*;
import java.lang.*;

class minimumSwap
{
	public static int min(int[] arr,int i,int n)
	{
		int min = Integer.MAX_VALUE;
		int index =-1;
        for(int j=i;j<n;j++)
        {
            if(min>arr[j])
            {
                min = arr[j];
                index = j;
            }
        }
        return index;
	}
	public static int findMinSwap(int arr[])
    {
    	int n = arr.length;
    	int count = 0;
    	for(int i = 0;i<n;i++)
    	{
    		int index = min(arr,i,n);
    		if(arr[index]<arr[i])
    		{
	    		int temp = arr[i];
	    		arr[i] = arr[index];
	    		arr[index] = temp;	

	    		count = count + 1;
    		}
    		
    	}
    	System.out.println("\n Sorted array ::");
    	for(int i =0;i<n;i++)
    	{
    		System.out.print(arr[i]+" ");
    	}
    	return count;

    }
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i =0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		int count = findMinSwap(arr);
		System.out.println("\n count:"+count);
		sc.close();
	}
}