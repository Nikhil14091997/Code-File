import java.util.*;
public class PrimeSum {

    /**
     * @param args the command line arguments
     */
    public static int isPrime(int number)
    {
        int flag = 0;
        for(int i = 0;i<number/2;i++)
        {
            if(number%i!=0)
            {
                flag = 1;
            }
        }
        return flag;
    }
    public static int[] primeArray(int n)
    {
        int arr[] = new int[n/2];
        arr[0] = 2;
        int j = 1;
        for(int i =2;i<n/2;i++)
        {
            int flag = isPrime(i);
            if(flag == 1)
            {
                arr[j] = i;
                j++;
            }
        }
        return arr;
    }
    public static int findSum(int n)
    {
        int sum = 0;
        int[] arr = primeArray(n);
        for(int i =0;i<arr.length;i++)
        {
            if(n%arr[i]==0)
            {
                sum = sum + arr[i];
            }
            else
            {
                sum = sum + 0;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = findSum(n);
        System.out.println(result);
    }
    
}
