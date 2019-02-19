import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class ArrayManipulation 
{
    public static void printArray(int[] arr)
    {
        for(int i = 1;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void ArrayUpdate(int[] arr,int a,int b,int k)
    {
        arr[a] = arr[a] + k;
        arr[b] = arr[b] + k;
        printArray(arr);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // size of array;
        int[] arr = new int[n+1];
        Arrays.fill(arr,0);
        int q = sc.nextInt();
        for(int i = 0;i<q;i++)
        {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int k = sc.nextInt();

            ArrayUpdate(arr,a,b,k);
        }
        
        System.out.println("\n max::"+Arrays.stream(arr).max().getAsInt());
        sc.close();
    }
}