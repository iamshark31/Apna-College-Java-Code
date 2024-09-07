import java.util.Scanner;
public class getLargest {
    public static int largestofnum(int num[])
    {
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<num.length;i++)
        {
            if(num[i]>largest)
            {
                largest = num[i];
            }

        }
        return largest;
    }
    public static void main(String args[])
    {
        int num[] = {1,22,11,33,37,98,91,64};
        System.out.println("want to execute?\n1 for yes");
        Scanner sc = new Scanner(System.in);
        int condition = sc.nextInt();
        if(condition==1)
        {
            System.out.println("Largest of all numbers is " +largestofnum( num));
        }
        else
        {
            System.exit(0);
        }
    }
}
