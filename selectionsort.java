import java.util.*;
class selectionsort
{
	public static void selectionSort(int[] arr)
	{
		for(int i =0;i<arr.length;i++)
		{
			int minIndex = i;
			for(int j = i+1;j<arr.length;j++)
			{
				if(arr[j]<=arr[minIndex])
				{
					minIndex = j;
				}

				// swap the elemets of both the index
				int temp = arr[minIndex];
				arr[minIndex] =  arr[i];
				arr[i] = temp;
			}	
		}
		
	}
	public static void main(String args[])
	{
		Scanner sc  = new Scanner(System.in);
		System.out.println("\n Enter the number of elements in the array:");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("\n Enter the array elements");
		for(int i =0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		selectionSort(arr);
		System.out.println("\n Sorted array is::");
		for(int i =0;i<arr.length;i++)
		{
			System.out.print(arr[i]+"\t");
		}
	}
}