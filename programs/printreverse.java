import java.util.*;
//program to reverse a number
public class printreverse {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to reverse:");
        int num = sc.nextInt();
        while(num>0){
        int lastdigit = num%10;
        System.out.print(lastdigit);
        num = num/10;
        }
    }
}
