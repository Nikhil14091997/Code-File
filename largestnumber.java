/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nikhil
 */
import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;
public class largestnumber 
{
    public static void main(String arg[])
    {
        System.out.println("\n **************** LARGEST NUMEBR PROGRAM **********************");
        Scanner sc = new Scanner(System.in);
        System.out.println("\n Enter the number of elements in the array::");
        int n = sc.nextInt();
        int[] arr = new int[n];
        String[] str = new String[n];
        System.out.println("\n Enter the  elements of the array::");
        for(int i =0;i<n;i++)
        {
            arr[i] = sc.nextInt();
            str[i] = Integer.toString(arr[i]);
        }
        StringBuilder sb = new StringBuilder();
        int max = Integer.MIN_VALUE;
        int[] first = new int[n];
        for(int i = 0;i<n;i++)
        {
            first[i] = Integer.parseInt(str[i].charAt(0));
        }
        max = Collections.max(Arrays.asList(first));
        System.out.println("max:"+max);
        
    }
}
