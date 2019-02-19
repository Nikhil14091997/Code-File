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
import java.io.*;
public class sparseArray 
{
    public static void find(String query, String[] str)
    {
        int count = 0;
        for(int i =0;i<str.length;i++)
        {
            if(str[i] == string)
            {
                count = count + 1;
            }
        }
        System.out.println(count);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] str = new String[n];
        for(int i =0;i<n;i++)
        {
            str[i] = sc.next();
        }
        for(int i =0;i<n;i++)
        {
            System.out.print(str[i]+" ");
        }
        
        int q = sc.nextInt();
        String[] query = new String[q];
        for(int i =0;i<q;i++)
        {
            query[i] = sc.next();
        }
        for(int i =0;i<q;i++)
        {
            System.out.print(string[i]+" ");
        }
        int[] result = new int[q];
        for(int i =0;i<q;i++)
        {
            find(query[i],str);
        }
        
        
    }
}
