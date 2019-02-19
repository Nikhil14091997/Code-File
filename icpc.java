import java.io.*;
import java.util.*;
public class icpc{
	public static void countOnes(char[] array1,char[] array2){
		int count = 0;
		for(int i =0;i<array1.length;i++){
			int a = Character.getNumericValue(array1[i]);
			int b = Character.getNumericValue(array2[i]);
			int c = a|b;
			System.out.println(c);
			//if(a|b == 1){
			//	count++;
			//}
		}
	}
	public static void find(int n,int m,String[] topic){
		// there are n topic elements in string
		Map<Integer,String> map = new HashMap<Integer,String>();
		int integerIndex = 0;
		for(int i =0;i<n;i++){
			for(int j =i+1;j<n;j++){
				char[] array1 = topic[i].toCharArray();
				char[] array2 = topic[j].toCharArray();
				int number = countOnes(array1,array2);
				integerIndex++;
				map.put(integerIndex,number);
			}
		}
		for(Map.Entry<Integer,String> entry : map.entrySet()){
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		String[] topic = new String[n];
		for (int i = 0; i < n; i++){
            String topicItem = scanner.nextLine();
            topic[i] = topicItem;
        }
        find(n,m,topic);
	}
}