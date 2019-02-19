import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.*;
import java.lang.*;
class bhavya
{
    static class FastReader
    {
        BufferedReader br;
        StringTokenizer st;
 
        public FastReader()
        {
            br = new BufferedReader(new
                     InputStreamReader(System.in));
        }
 
        String next()
        {
            while (st == null || !st.hasMoreElements())
            {
                try
                {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException  e)
                {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
 
        int nextInt()
        {
            return Integer.parseInt(next());
        }
 
        long nextLong()
        {
            return Long.parseLong(next());
        }
 
        double nextDouble()
        {
            return Double.parseDouble(next());
        }
 
        String nextLine()
        {
            String str = "";
            try
            {
                str = br.readLine();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            return str;
        }
    }
    public static String convertListToString(ArrayList<Character> l,int n)
    {
        
        char[] c = new char[n];
        for(int i = 0; i<n ;i++)
        {
            c[i] = l.get(i);
        }
        String str = new String(c);

        return str;
    }

    public static void main(String args[])
    {
        FastReader sc = new FastReader();
        String str = sc.nextLine();
        int n = str.length();
        char[] arr = str.toCharArray();
        ArrayList<Character> l = new ArrayList<Character>();
        l.add(arr[0]);
        //System.out.println("Here:"+l.get(0));
        for(int i =1;i<n;i++)
        {
            if(arr[i]!=arr[i-1])
            {
                l.add(arr[i]);
            }
        }
        String result = convertListToString(l,n);
        System.out.println(result);
    }    
}

