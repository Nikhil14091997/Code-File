import java.util.*;
public class Solution {
	public static void main(String... args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		HashMap<Character,Integer> hashmap = new HashMap<Character,Integer>();
		for(int i =0;i<str.length();i++) {
			if(!hashmap.containsKey(str.charAt(i))) {
				hashmap.put(str.charAt(i),1);
			}
			else {
				int count = hashmap.get(str.charAt(i));
				hashmap.put(str.charAt(i),count+1);
			}
		}
		for(Map.Entry<Character,Integer> entry : hashmap.entrySet())
		{
			System.out.println(entry.getKey()+ "->" +entry.getValue());
		}
	}
}