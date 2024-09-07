import java.util.Scanner;
public class sub_array 
{
    public static void subArray(int arr[],int n)
    {
        int sum=0;
        int ts =0;
        int minSum = Integer.MAX_VALUE;
        int maxSum = Integer.MIN_VALUE;
        int minSumArrNum=1;
        int maxSumArrNum=1;
        for(int i =1;i<=n;i++)
        {
            int start = i;
            for(int j=i;j<=n;j++)
            {
                int end = j; 
                int arrNum = ts+1;
                System.out.println("Array No."+arrNum);
                for(int k = i; k<=j;k++)
                {
                    
                    System.out.print(arr[k]+" ");
                    sum+=arr[k];
                }
                System.out.println(" ");
                System.out.println("Sum of above array = "+sum);
                
                if(sum<minSum)
                {
                    minSum = sum;
                    minSumArrNum = arrNum;
                }
                if(sum>maxSum)
                {
                    maxSum = sum;
                    maxSumArrNum = arrNum;
                }
                sum =0;
                System.out.println(" ");
                ts++;
            }
            System.out.println(" ");
        }
        System.out.println("Total subArrays are: "+ts);
        System.out.println("maximum Sum = "+maxSum+" ("+maxSumArrNum+"th Array)");
        System.out.println("minimum Sum = "+minSum+" ("+minSumArrNum+"th Array)");
    }   
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int arr[] = new int[15];
        System.out.println("Enter the array elements");
        for(int i=1;i<=n;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Sub arrays are: -");
        subArray(arr , n);
    } 
}
