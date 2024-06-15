import java.util.*;
import java.lang.*;
public class bujyu2
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] arr = new int[N][2];
        for(int i =0;i<N;i++)
        {
            for(int j = 0;j<2;j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Printing array::");
        for(int i =0;i<N;i++)
        {
            for(int j = 0;j<2;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}