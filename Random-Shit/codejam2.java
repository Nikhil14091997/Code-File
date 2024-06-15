import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class codejam2 
{

    // Complete the angryProfessor function below.
    public static void printArray(String[] nod, int[] a) 
    {
        System.out.print(Integer.parseInt(nod[0])+" "+Integer.parseInt(nod[1])+" "+Integer.parseInt(nod[2]));
        for(int i =0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String[] nod = scanner.nextLine().split(" ");

            int n = Integer.parseInt(nod[0]);

            int o = Integer.parseInt(nod[1]);

            int d = Integer.parseInt(nod[2]);

            int[] a = new int[n];

            String[] arrayString = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int aItem = Integer.parseInt(arrayString[i]);
                a[i] = aItem;
            }

            printArray(nod,a);

            
            
        }

        bufferedWriter.close();

        scanner.close();
    }
}
