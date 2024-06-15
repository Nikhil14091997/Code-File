#include<bits/stdc++.h>
using namespace std;
int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    long long n,k;
    cin>>n>>k;
    long arr[n];
    for(long i=0;i<n;i++)
    {
        cin>>arr[j];
    }
    long dp[k+1]={0};
    long x=k,j=1;
    while(j<=k)
    {
        dp[j] =dp[j] + arr[0];
        for(long i=1;i<j;i++)
        {
            dp[j] =dp[i] + arr[i];
        }
        for(long i=(n-(x-(j)));i<n;i++)
        {
            dp[j] =dp[j] + arr[i];
        }
        j++;
    }
    
    long m=-1;
    for(long i=1;i<=k;i++)
        m=max(m,d[i]);
    cout<<m<<endl;
}
