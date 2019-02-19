import java.util.*;
class sqrt
{
	public static double calculateSqrt (int n) {
         
    double rootValue = 1.00;
    double num = n;
     
    for (int i = 0; i < n; i++) {
         
        rootValue = 0.5 * (rootValue + num/rootValue); // newton raphsons method
    }   
    int returnValue = (int)(rootValue * 1000);  
    rootValue = returnValue;
    rootValue /=1000;
     
    System.out.println("Root Value Calculated : " + rootValue);
    System.out.println("Root Value By InBuild Method Method : " + Math.sqrt(n));
     
    return rootValue;
     
    }
     
     
    public static void main (String[] args) {
         
        int n;
         
        Scanner input = new Scanner (System.in);        
         
        System.out.println("Enter Number to find its square root-");
        n = input.nextInt();    
         
        calculateSqrt(n);
    }

}