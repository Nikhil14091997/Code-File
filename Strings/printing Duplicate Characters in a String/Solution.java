import java.io.*;
import java.util.*;
import java.lang.*;
public class Solution{
	public static void find(String str){
		String testNull = new String();
		Set<Character> set = new HashSet<Character>();
		Set<Character> duplicates = new HashSet<Character>();
		// Condition For checking the null Strings or empty Strings
		if(str.equals(testNull))
		{
			System.out.println("Empty String");
			return;
		}
		// Main  logic of the program
		for(int i = 0;i<str.length();i++){
			if(set.contains(str.charAt(i))){
				duplicates.add(str.charAt(i));
			}
			else{
				set.add(str.charAt(i));
			}
		}
		// Check it has a duplicate value or  not
		if(duplicates.isEmpty())
		{
			System.out.println("String does not have any duplicate value");
		}
		// if it has then print it
		else{
			Iterator itr = duplicates.iterator();
			while(itr.hasNext()){
				System.out.println(itr.next());
			}
		}
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("\n Enter the String to find a duplicate in it :");
		String string = sc.next();
		find(string);
		String nullString = new String();
		find(nullString);
		sc.close();
	}
}