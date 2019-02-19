import java.util.*;
class barclay12
{
	public static String[] SubString(String s,int n,int length)
	{
		int len = 0;
		String strArray[] = new String[length];
		for (int i = 0; i < n; i++) 
		{
			for (int j = i+1; j <= n; j++)
			{
            	strArray[len] = s.substring(i, j);
            	len++;
			}
		}
		return strArray;
    }
    public static void KMPSearch1(String pat,String txt,int len)
    {
    	int[] arr = new int[len];
    	int temp = Integer.MIN_VALUE;
        int M = pat.length();
        int N = txt.length();
        int[] lps = new int[M];
        int j = 0;
        computeLPSArray1(lps,M,pat);
        int i =0;
        while(i<N)
        {
            if(pat.charAt(j)==txt.charAt(i))
            {
                i++;
                j++;
                
            }
            if(j==M)
            {
                System.out.println("\n Element: "+pat+" found at :"+(i-j)+" in:"+txt);
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
        //return temp;
    }
    public static void computeLPSArray1(int[] lps,int M,String pat)
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
    public static void KMPSearch2(String pat,String txt,int len)
    {
        int[] arr = new int[len];
        int temp = Integer.MIN_VALUE;
        int M = pat.length();
        int N = txt.length();
        int[] lps = new int[M];
        int j = 0;
        computeLPSArray1(lps,M,pat);
        int i =0;
        while(i<N)
        {
            if(pat.charAt(j)==txt.charAt(i))
            {
                i++;
                j++;
                
            }
            if(j==M)
            {
                System.out.println("\n Element: "+pat+" found at :"+(i-j)+" in:"+txt);
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
        //return temp;
    }
    public static void computeLPSArray2(int[] lps,int M,String pat)
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
		int count = 0;
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		String s = sc.next();
		int n = s.length();
		int len = (n*(n+1))/2;
		String[] strArray = new String[len];
		strArray = SubString(s ,s.length(),len);
		/*for(int i =0;i<len;i++)
		{
			System.out.println(strArray[i]+" ");
		}*/
		int[] arr1 = new int[len];
		int[] arr2 = new int[len];
		for(int i = 0;i<len;i++)
		{
			 KMPSearch1(a,strArray[i],len);
			
			//KMPSearch2(b,strArray[i],len);
		}
	}
}
