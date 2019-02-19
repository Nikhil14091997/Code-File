import java.util.*;
import java.io.*;
import java.lang.*;
class question3
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
  public static void main(String args[])
  {
    FastReader sc=new FastReader();
    int n = sc.nextInt(); // n = n1
    int k = sc.nextInt();
    Stack<Integer> stack = new Stack<Integer>();// stack = stack1
    Queue<Integer> queue = new LinkedList<>(); // queue = q;

    int[] h1 = new int[n]; // h1 = h1Array
    for(int i=0; i < n; i++)
    {
        h1[i] = sc.nextInt();
    }
    for(int i=0;i<n;i++)
    {
        stack.push(h1[n-i-1]);
        queue.add(h1[n-i-1]);
    } 
    int beg=h1[0]; // beg = top
    int add=0; // add = sum
    int last=h1[n-1]; // last = bottom
    while(k>0)
    {
        while(stack.peek()>last)
        {

           add=add+stack.pop();

           k--;
        }
        while(k>0)
        {
            int some=queue.remove();// some = s
            add=add+some;

            k--;
        }

    }
    System.out.println(add);

  }
}
 