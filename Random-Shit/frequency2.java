import java.util.*;
class frequency2{
	public static void print(String str){
		int length = str.length();
		int[] freq = new int[26];
		for(int i =0;i<length;i++)
			freq[str.charAt(i)-'a']++;
		for(int i =0;i<length;i++){
			if(freq[str.charAt(i)-'a']!=0){
				System.out.print(str.charAt(i)+""+freq[str.charAt(i)-'a']);
				freq[str.charAt(i)-'a'] = 0;
			}
		}
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		print(str);
	}
}