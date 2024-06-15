import java.io.*;
import java.lang.*;
import java.util.*;
public class nextPermutation{
	public static String find(char[] arr){
		int i = arr.length - 1;
		// finding p --> (i-1)th  comparision with ith element in the array
		while(i>0 && arr[i-1]>=arr[i]){
			i--;
		}
		// no more permutation
		if(i<=0){
			System.out.println("Pretty much last one!!");
			return "";
		}
		// initializing it to last element
		int j = arr.length-1;
		// finding (q) first element greater than p
		while(arr[j]<= arr[i-1]){
			j--;
		}
		// Swap p and q
		char temp = arr[i-1];
		arr[i-1] = arr[j];
		arr[j] = temp;
		// reinitialize to last to element 
		j = arr.length - 1;
		// reverse the list from ith index to last index j 
		while(i<j)
		{
			char tem = arr[i];
			arr[i] = arr[j];
			arr[j] = tem;
			j--;
			i++;
		}
		String ret = new String(arr);
		return ret;
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("\n Enter the string");
		String str = sc.next();
		char[] arr = str.toCharArray();
		String result = find(arr);
		System.out.println("Next Permutation String --> "+result);
		sc.close();
	}
}