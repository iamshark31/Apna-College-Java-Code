import java.util.*;
public class primeinrange {
    
    public static boolean prime(int n)
    {
        boolean isprime = true;
       
            for(int i = 2; i<=Math.sqrt(n); i++)
            {
                if(n%i==0)
                {
                    isprime = false;
                }
            }
        return isprime;
    }


    //------------------------------------------------------------------------



    public static void primesinrange(int n)
    {
        for(int i=1;i<=n;i++)
        {
            boolean isprime = prime(i);
            if(isprime == true)
            {
                System.out.println(i);
            }
        }
    }


    //----------------------------------------------------------------------------
    public static void main(String args[])
    {
        System.out.println("enter range to find prime numbers:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        primesinrange(n);
    }
}
