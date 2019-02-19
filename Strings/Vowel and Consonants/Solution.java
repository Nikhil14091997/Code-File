import java.io.*;
import java.lang.*;
import java.util.*;
public class Solution {
	public static void vowelsConsonants(String str) {
		int vowel = 0;
		int conso = 0;
		for(int i =0;i<str.length();i++) {
			if(str.charAt(i)=='a' || str.charAt(i) == 'e' || str.charAt(i)=='o' || str.charAt(i) == 'i' || str.charAt(i) == 'u') {
				vowel++;
			}
			else {
				conso++;
			}
		}
		System.out.println("There are "+vowel+" vowels and "+conso+" consonants in the string -> "+str);
	}
	public static void main(String... args) {
		Scanner sc = new Scanner(System.in);
		String string = sc.next();
		vowelsConsonants(string);
	}
}