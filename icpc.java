import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
public class icpc{
	public static void find(int n,int m,String[] topics){
		int known,max_known = 0,know_all =0;
		for(int i = 0;i<n-1;i++)
		{
			for(int j =i+1;j<n;j++)
			{
				known = 0;
				for(int k = 0;k<m;k++)
				{
					if(topics[i].charAt(k) == '1' || topics[j].charAt(k) == '1')
					{
						known++;
					}
					if(max_known < known)
					{
						max_known = known;
						know_all = 0;
					}
					if(known == max_known)
					{
						know_all++;
					}
				}
			}
		}
		System.out.println(max_known);
		System.out.println(know_all);
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		String[] topics = new String[n];
		for(int i =0;i<n;i++){
			topics[i] = sc.next();
		}
		find(n,m,topics);
	}
}