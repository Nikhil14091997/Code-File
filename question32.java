import java.util.*;
import java.io.*;
import java.lang.*;
class question32
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
        FastReader sc = new FastReader();
        long n = sc.nextLong(); 
        long k = sc.nextLong();
        long[] arr = new long[n];
        for(long i =0;i<n;i++)
        {
            arr[i] = sc.nextLong();
        }
        long[] dp = new  long[k+1];
        Arrays.fill(dp,0);
        long x=k;
        long j=1;
        while(j<=k)
        {

            dp[j] = dp[j] + arr[0];
            for(long i=1;i<j;i++)
            {
                dp[j]+=arr[i];
            }
            for(long i=(n-(x-(j)));i<n;i++)
            {
                dp[j] =dp[j] + arr[i];
            }
            j++;
        }
        long m=-1;
        for(long i=1;i<=k;i++)
            m=Math.max(m,dp[i]);
        System.out.println(m);


      }
}
 