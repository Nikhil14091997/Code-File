import java.io.*;
import java.util.*;
import java.lang.*;
public class anagram
{
	public static void checkAnagram(String s)
	{
		if(s.length()%2!=0)
		{
			System.out.println("-1");
		}
		else
		{
			int[] freq1 = new int[26];
			int[] freq2 = new int[26];
			Arrays.fill(freq1,0);
			Arrays.fill(freq2,0);
			String str1 = s.substring(0,s.length()/2);
			String str2 = s.substring(s.length()/2,s.length());
			//System.out.println(str1+"\n"+str2);
			for(int i = 0;i<str1.length();i++)
			{
				freq2[str2.charAt(i)-'a']++;
				freq1[str1.charAt(i)-'a']++;
			}
			int diff = 0;
			for(int j =0;j<26;j++)
			{
				int localDiff = Math.max(0,freq2[j]-freq1[j]);
				diff += localDiff;
			}
			System.out.println(diff);
		}
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i =0;i<t;i++)
		{
			String s = sc.next();
			checkAnagram(s);
		}
	}
}