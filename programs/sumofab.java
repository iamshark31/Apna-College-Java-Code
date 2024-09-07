import java.util.Scanner;
public class sumofab
{
    public static void main(String args[])
    {

    
    int a,b;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter two numbers");
    a=sc.nextInt();
    b=sc.nextInt();
    int sum = a+b;
    System.out.println("Sum of a and B = "+sum);
    sc.close();
}
}