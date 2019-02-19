import java.util.*;
import java.lang.*;
class question32
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();
        long[] arr = new long[n];
        for(long j =0;j<n;j++)
        {
            arr[i] = sc.nextLong();
        }
        long[] dp = new long[k+1];
        Arrays.fill(dp,0);
        long x =k;
        long j = 1;
        while(j<=k)
        {
            dp[j] = dp[j] + arr[i];
            for(long i=1;i<j;i++)
            {
                dp[j]+=arr[i];
            }
            for(long i=(n-(x-(j)));i<n;i++)
            {
                dp[j]+=arr[i];
            }
            j++;
    }

    long m=-1;
    for(long i=1;i<=k;i++)
    m=Math.max(m,dp[i]);
    System.out.println(m);


    }
}