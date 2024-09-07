import java.util.*;
public class bintodec {
    //program to convert binary number to decimal
    public static int binntodecn(int binn)
    {
        int pow = 0;
        int decn=0;
        while(binn>0)
        {
            int ld = binn%10;
            decn = decn + (ld*(int)Math.pow(2,pow));
            pow ++;
            binn = binn/10;
        }
        return decn;
    }

    public static void main(String args[])
    {
        System.out.println("Enter a binary number:");
        Scanner sc = new Scanner(System.in);
        int binn = sc.nextInt();
        int decn = binntodecn(binn);
        System.out.println("Decimal number = "+decn);
    }
    
}
