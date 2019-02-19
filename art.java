import java.util.*;
import java.io.*;
import java.lang.*;
public class art {
	public static void doit(Integer[] targetArray,int count,int len) {
		// CASE 1 : odd Length
		if((len%2)!=0) {
			System.out.println(len-targetArray[count-1]);
			return;
		}
		// CASE 2 even number
		else {
			int noOfChanges = 0;
			// Let i denote the length of partition
			for(int i = 1;i<=len/2;i++)
			{
				if(i==1)
				{
					noOfChanges = len - targetArray[count-i];
				}
				else if(i>1 && ((len%i) == 0))
				{
					int tempChange = 0;
					int innerLoop = Math.min(count,i);
					for(int j = 1;j<=innerLoop;j++)
					{
						int change = Math.abs((len/i) -(targetArray[count-j]));
						tempChange += change;
					}
					if(tempChange<noOfChanges)
					{
						noOfChanges = tempChange;
					}
				}
			}

			int distinctCase = len - count;
			if(distinctCase<noOfChanges)
			{
				noOfChanges = distinctCase;
			}
			System.out.println(noOfChanges);
		}
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int t = 0;
		if(sc.hasNext()) {
			t = sc.nextInt();
		}
		for(int j=0;j<t;j++) {
			String str = sc.next();
			int len = str.length(); // Represents the total number of charcters
			int count = 0; 			// Represents the distinct characters
			// HashMap contains key value pair of character and their occurences
			Map<Character,Integer> hash = new HashMap<Character,Integer>();
			for(int i =0;i<len;i++) {
				if(!hash.containsKey(str.charAt(i))) {
					hash.put(str.charAt(i),1);
					count++;
				}
				else {
					int val = hash.get(str.charAt(i));
					hash.put(str.charAt(i),val+1);
				}
			}
			/*
			for(Map.Entry<Character,Integer> entry : hash.entrySet()) {
				System.out.println(entry.getKey()+"->"+entry.getValue());
			}
			*/
			Collection<Integer> values = hash.values();
			// Target Array with length of distinct character and hence length can never go beyond count
			Integer[] targetArray = values.toArray(new Integer[values.size()]);
			Arrays.sort(targetArray);
			/*
			for(int tar =0;tar<targetArray.length;tar++) {
				System.out.println(targetArray[tar]);
			}
			*/
			doit(targetArray,count,len);
		}
	}
}