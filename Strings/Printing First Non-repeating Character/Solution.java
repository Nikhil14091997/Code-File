import java.io.*;
import java.util.*;
import java.lang.*;
public class Solution{
	public static void find(String string){
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		for(int i =0;i<string.length();i++)
		{
			if(!map.containsKey(string.charAt(i)))
			{
				map.put(string.charAt(i),1);
			}
			else
			{
				int count = map.get(string.charAt(i));
				map.put(string.charAt(i),count+1);
			}
		}
		for(Map.Entry<Character,Integer> entry : map.entrySet())
		{
			if(entry.getValue() = = 1){
				System.out.println(entry.getKey());
				break;	
			}
			
		}
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("\n Enter the STring:");
		String string = sc.next();
		find(string);
		sc.close();
	}
}