import java.io.*;
import java.util.*;
import java.lang.*;
public class Solution {
	public static void find(String str ,int k) {
		TreeSet<String> set = new TreeSet<String>();
		for(int i=0;i<=str.length()-k;i++)
		{
			set.add(str.substring(i,i+k));
		}
		Iterator itr = set.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		Object first = set.first();
		Object last = set.last();
		System.out.println(first);
		System.out.println(last);
	}
	public static void main(String... args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int k = sc.nextInt();
		find(str,k);
	}
}