import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class codejam
{
	/*
	public static void printArray(int[] nod,int[] arr)
	{
		System.out.println(nod[0]+" "+nod[1]+" "+nod[2]);
		for(int i =1;i<=arr.length-1;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	*/
	public static void  SweetContent(int[] arr,int n)
	{
		int[] X = new int[n+1];
		int[] sweet = new int[arr.length];
		X[1] = sweet[1] = arr[1];
		X[2] = sweet[2] = arr[2];
		int A = arr[3];
		int B = arr[4];
		int C = arr[5];
		int M = arr[6];
		int L = arr[7];
		for(int i = 3;i<n+1;i++)
		{
			X[i] = (A*X[i-1] + B*X[i-2] + C)%M;
			sweet[i] = X[i] + L;
		}

		System.out.println("\n X ARRAY is::");
		for(int j = 1;j<n+1;j++)
		{
			System.out.print(X[j]+" ");
		}

		System.out.println("\n SWEET ARRAY is::");
		for(int j = 1;j<n+1;j++)
		{
			System.out.print(sweet[j]+" ");
		}

	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("\n Enter the testcase::");
		int testcase = sc.nextInt();
		for(int i =0;i<testcase;i++)
		{
			System.out.println("\n Enter nod:");
			int[] nod = new int[3];
			for(int k=0;k<3;k++)
			{
				nod[k] = sc.nextInt();
				
			}
			int n = nod[0];
			int[] arr = new int[8];
			System.out.println("\n Enter array:");
			for(int j = 1;j<8;j++)
			{
				arr[j] = sc.nextInt();
			}

			SweetContent(arr,n);

			// printArray(nod,arr);
		}
	}
}