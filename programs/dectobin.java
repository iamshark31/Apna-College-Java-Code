import java.util.*;
public class dectobin {
    //program to convert decimal to binary
    public static int decntobinn(int decn)
    {
        int pow =0;
        int binn = 0;
        while(decn>0)
        {
            int rem = decn%2;
            binn = binn + (rem * (int)Math.pow(10,pow));
            pow++;
            decn = decn/2;
        }
        return binn;
    }
    public static void main(String args[])
    {
        System.out.println("Enter a decimal number: ");
        Scanner sc = new Scanner(System.in);
        int decn = sc.nextInt();
        int binn = decntobinn(decn);
        System.out.println("Binary number = "+binn);
    }    
}
