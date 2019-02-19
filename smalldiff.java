import java.util.*;
class smalldiff
{
    public static void findNearest(int[] arr1,int[] arr2,int x)
    {
        int n = arr1.length;
        int m = arr2.length;
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int arr[] = new int[n*m];
        int result = Integer.MAX_VALUE;
        int index =0;
        for(int i =0;i<n;i++)
        {
            for(int j =0;j<m;j++)
            {
                arr[index] = Math.abs(arr1[i]+arr2[j]-x);
                index++;
            }
        }
        int min = 0;
        for(int i:arr)
        {
            if(arr[i]<min)
                min = arr[i];
        }
        System.out.println(min);


    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int x = sc.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[m];
        System.out.println("Enter Array1:");
        for(int i =0;i<n;i++)
        {
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter Array2:");
        for(int i =0;i<m;i++)
        {
            arr2[i] = sc.nextInt();
        }
        findNearest(arr1,arr2,x);
    }
}