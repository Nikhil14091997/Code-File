import java.util.*;
import java.io.*;
import java.lang.*;
public class Triplet
{
    public static void main(String args[])
    {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        int[] arr = new int[n];
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i = 0;i<n;i++)
        {
            arr[i] = sc.nextInt();
            if(!map.containsKey(arr[i]))
            {
                map.put(arr[i],1);
            }
            else
            {
                map.put(arr[i], map.get(arr[i]) + 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet())
        {
           // System.out.println(entry.getKey() +" -> "+entry.getValue());
            if(r==1)
            {
                count = (n*(n-1)*(n-2))/6;
                break;
            }
           int key = entry.getKey();
           int value1 = map.get(key);
           if(map.containsKey(key*r))
           {
               int key1 = key*r;
               int value2 = map.get(key1);
               if(map.containsKey(key1*r))
               {
                   int value3 = map.get(key1*r);
                   count = count + Math.max(value1,Math.max(value2,value3));
               }
           }
        }
        System.out.println(count);
        sc.close();
    }
}