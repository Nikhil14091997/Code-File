import java.util.*;
import java.io.*;
import java.lang.*;
class archana
{
	public static int llap(int[] arr2,int n)
	{
		if (n <= 2) 
			return n;
        int L[][] = new int[n][n];
         
         // Initialize the result
        int llap = 2;
     
        // Fill entries in last column as 2. 
        // There will always be two elements in 
        // AP with last number of set as second
        // element in AP
        for (int i = 0; i < n; i++)
            L[i][n - 1] = 2;
     
        // Consider every element as second element of AP
        for (int j = n - 2; j >= 1; j--)
        {
            // Search for i and k for j
            int i = j -1 , k = j + 1;
            while (i >= 0 && k <= n - 1)
            {
            if (arr2[i] + arr2[k] < 2 * arr2[j])
                k++;
     
            // Before changing i, set L[i][j] as 2
            else if (arr2[i] + arr2[k] > 2 * arr2[j])
            { 
                L[i][j] = 2; 
                i--; 
                 
            }
     
            else
            {
                // Found i and k for j, LLAP with i and j as first two
                // elements is equal to LLAP with j and k as first two
                // elements plus 1. L[j][k] must have been filled
                // before as we run the loop from right side
                L[i][j] = L[j][k] + 1;
     
                // Update overall LLAP, if needed
                llap = Math.max(llap, L[i][j]);
     
                // Change i and k to fill 
                // more L[i][j] values for current j
                i--; 
                k++;
            }
        }
     
            // If the loop was stopped due
            // to k becoming more than
            // n-1, set the remaining 
            // entties in column j as 2
            while (i >= 0)
            {
                L[i][j] = 2;
                i--;
            }
        }
        return llap;
	}
	public static void printArray(int[] arr)
	{
		for(int i =0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	public static int AsciiConversion(String str)
	{
		char[] arr = str.toCharArray();
		int[] arr2 = new int[arr.length];
		for(int i =0;i<arr.length;i++)
		{
			arr2[i] = (int)arr[i];
		}
		int n = arr.length;
		//printArray(arr2);
		int longest = llap(arr2,n);
		return longest;
	}
			
		public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int testcases = sc.nextInt();
		for(int i =0;i<testcases;i++)
		{
			String str = sc.next();
			int result = AsciiConversion(str);
			System.out.print("\n LONGEST::"+result);
		}
		sc.close();
	}
}