import java.util.*;
// print if number is odd or even
public class oddeven {
    public static void main(String args[])
    {
        System.out.println("Enter a numbers");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a%2==0)
        {
            System.out.println("Given number is Even");
        }
        else{
            System.out.println("Given number is Odd");
        }
    }
}
