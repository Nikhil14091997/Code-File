import java.io.*;
import java.util.*;
import java.lang.*;
public class makingAnagram
{
	public static void minDeletion(String s1, String s2)
	{
		int[] freq1 = new int[26];
		int[] freq2 = new int[26];
		Arrays.fill(freq1,0);
		Arrays.fill(freq2,0);
		for(int i =0;i<s1.length();i++)
		{
			freq1[s1.charAt(i)-'a']++;
		}
		for(int i =0;i<s2.length();i++)
		{
			freq2[s2.charAt(i)-'a']++;
		}
		int diff = 0;
		for(int i =0;i<26;i++)
		{
			if(freq1[i] != freq2[i])
			{
				diff += Math.abs(freq2[i]-freq1[i]);
			}
		}
		System.out.println(diff);
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		String str2 = sc.next();
		minDeletion(str1,str2);
	}
}