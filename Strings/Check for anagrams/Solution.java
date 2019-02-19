/*

This is good solution with O(nLog(n)) Time Complexity
But, This could be optimisied to O(n) using the character Counting 
i.e. Keeping the Frequencies Array and compare both in Single Iterartion

*/
import java.io.*;
import java.util.*;
import java.lang.*;
public class Solution{
	public static void checkAnagram(String str1,String str2){
		if(str1.length() != str2.length()){
			System.out.println("Different length!!");
			return;
		}
		char[] arr1 = str1.toCharArray();
		Arrays.sort(arr1);
		char[] arr2 = str2.toCharArray();
		Arrays.sort(arr2);
		boolean status = true;
		for(int i =0;i<arr1.length;i++){
			if(arr1[i] == arr2[i])
				status = true;
			else{
				status = false;
				break;
			}
		}
		if(status == true)
			System.out.println("Anagrams!!");
		else
			System.out.println("Not Anagrams!!");
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("\n Enter first string:");
		String string1 = sc.next();
		System.out.println("\n Enter the second string:");
		String string2 = sc.next();
		checkAnagram(string1,string2);
	}
}