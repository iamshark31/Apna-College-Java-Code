import java.util.Scanner;
public class palindrome{
    //program to check if a number is palindrome or not
    //121 is palindrome and 123 is not
    public static void main(String args[])
    {
        System.out.println("PALINDROME CHECKER!\nEnter a number:");
        Scanner sc = new Scanner(System.in);
        int onum = sc.nextInt();
        int num = onum;
        int rnum=0;
        while(num>0)
        {
            int ld = num%10;
            rnum = (rnum*10)+ld;
            num/=10;
        }
        if(rnum==onum)
        {
            System.out.println("It is palindrome");
        }else{
            System.out.println("it is not palindrome");
        }
    }
}