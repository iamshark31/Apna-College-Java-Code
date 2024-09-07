import java.util.*;
public class functions {
    public static int multiply(int a,int b)
    {
        int result = a*b;
        return result;
    }
    public static int factorial(int n)
    {
        int fact=1;
        for(int i = 1; i<=n;i++)
        {
            fact *=i;
        }
        return fact;
    }
    public static int binocoef(int n, int r)
    {
        int nfact = factorial(n);
        int rfact = factorial(r);
        int nmrfact = factorial(n-r);
        int bc = nfact/(rfact*nmrfact);
        return bc;
    }
    public static void main(String args[])
    {
        /*System.out.println("Enter the values of A & B: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result =multiply(a,b);
        System.out.println(result);*/

        System.out.println("enter the value of n and r");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        int bc = binocoef(n,r);
        System.out.println("binomial coefficient = " + bc );
    }
}
