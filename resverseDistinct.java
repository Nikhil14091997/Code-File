import java.util.*;
class resverseDistinct {
	public static void printreverse(String str){
		int[] present = new int[26];
		for(int i =0;i<str.length();i++){
			present[str.charAt(i)-'a'] = 1;
		}
		for(int i = str.length()-1;i>=0;i--){
			if(present[str.charAt(i)-'a']==1){
				System.out.print(str.charAt(i));
				present[str.charAt(i)-'a'] = 0;
			}
		}
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		printreverse(str);
	}
}