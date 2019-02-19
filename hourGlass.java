import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class hourGlass {

    // Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr) 
    {
        int n = arr.length; // 6
        int max = -9999999;
        
        for(int i = 0;i<4;i++)
        {
            for(int j = 0;j<4;j++)
            {
                int sum = arr[i][j] + arr[i][j+1] +arr[i][j+2]
                                + arr[i+1][j+1]
                        + arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];

                max = Math.max(sum,sum)
            }
        }
        return max;

    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[6][6];
        for(int i = 0;i<6;i++)
        {
            for(int j = 0;j<6;j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        /*System.out.println("MATRIX is:");
        for(int i = 0;i<6;i++)
        {
            for(int j = 0;j<6;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }*/
        int result = hourglassSum(arr);
        System.out.println(result);
        sc.close();
    }
}
