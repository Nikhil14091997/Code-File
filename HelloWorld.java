import java.math.*;
public class HelloWorld
{
    public static void find(String query,String[] arr)
    {
        int count = 0;
        for(int i =0;i<arr.length;i++)
        {
            if(arr[i]==query)
            count++;
        }
        System.out.println(count);
    }
    public static void main(String []args)
     {
        String[] arr ={"aba","xzxb","aba","ab"};
        find("xzxb",arr);
     }
}