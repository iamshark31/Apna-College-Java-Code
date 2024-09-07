import java.util.Scanner;
public class pairs_in_array
{
    public static void print_pairs(int num[], int n)
    {
        //total pairs = tp
        int tp =0;
        for(int i=1;i<=n;i++)
        {
            int curr = num[i];
            for(int j=i+1;j<=n;j++)
            {
                System.out.print("("+curr+","+num[j]+")");
                tp++;
            }
            System.out.println(" ");
        }
        System.out.println("total pairs = "+tp);
    }
    public static void main(String args[])
    {
        int num[] = new int [15];
        System.out.println("Enter size of the array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter the array elements");
        for(int i = 1; i<=n;i++)
        {
            num[i] = sc.nextInt();
        }
        
        
        System.out.println("pairs of the given array are: -");
        print_pairs(num,n);
    }
}
