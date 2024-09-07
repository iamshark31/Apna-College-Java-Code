import java.util.*;
public class prime {
    public static void main(String args[])
    {
        System.out.println("Enter a number:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n==2){
            System.out.println("it is a prime number");
        } 
        else{
            boolean isprime = true;
            for(int i=2;i<=Math.sqrt(n);i++)
            {
                if(n%i==0)
                {
                    isprime = false;
                }
            }
            if(isprime==true){
                System.out.println("it is a prime number");
            }
            else{
                System.out.println("it is not a prime number");
            }
        }
    }
}
