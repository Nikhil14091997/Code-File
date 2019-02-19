import java.util.*;
class specialbit
{
	public static int KMPSearch(String pat,String txt)
    {
    	int count = 0;
        int M = pat.length();
        int N = txt.length();
        int[] lps = new int[M];
        int j = 0;
        computeLPSArray(lps,M,pat);
        int i =0;
        int flag = 0;
        while(i<N)
        {
            if(pat.charAt(j)==txt.charAt(i))
            {
                i++;
                j++;
                
            }
            if(j==M)
            {
                //System.out.println("\n Element: "+pat+" found at :"+(i-j)+" in:"+txt);
                flag = 1;
                count = count +1;
                j = lps[j-1];
            }
            else if(i<N && pat.charAt(j)!=txt.charAt(i))
            {
                if(j!=0)
                {
                    j = lps[j-1];
                }
                else
                {
                    i = i+1;
                }
            }
        }
        if(flag==1)
        	return count;
   		else
   			return 0;
        //return temp;
    }
    public static void computeLPSArray(int[] lps,int M,String pat)
    {
        int len = 0;
        int i = 1;
        lps[0] = 0;
        while(i<M)
        {
            if(pat.charAt(i)== pat.charAt(len))
            {
                len++;
                lps[i] = len;
                i++;
            }
            else // pat[i]!= pat[len]
            {
                if(len!=0)
                {
                    len = lps[len - 1];
                }
                else
                {
                    lps[i] = len;
                    i++;
                }
            }
        }
    }
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int q = sc.nextInt();
		int ans = 0;
		int[] arr = new int[n];
		for(int i =0;i<n;i++)
			arr[i] = sc.nextInt();
		String string = "11";
		for(int i = 0;i<q;i++)
		{
			int l = sc.nextInt();
			int r = sc.nextInt();
			for(int j = l;j<=r;j++)
			{
				String txt = Integer.toBinaryString(arr[j]);
				int result = KMPSearch(string,txt);
				ans+=result;
			}
			System.out.println(ans);
			ans = 0;
		} 
		
	}
}