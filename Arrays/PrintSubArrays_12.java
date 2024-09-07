
/*This program prints subArrays of an Array and
evaluates the sum of each subArray and
finds the maximum Sum of subArray as well as Minimum Sum*/ 
public class PrintSubArrays_12
{
    public static void PrintSubArrays(float numbers[])
    {
        float ts=0;
        
        float minsum = Float.MAX_VALUE;
        float maxsum = Float.MIN_VALUE;
        for(int i=0;i<numbers.length;i++)
        {
            int start =i;
            for(int j=i;j<numbers.length;j++)
            {
                float cs=0;
                int end = j;
                for(int k=start;k<=end;k++)
                {
                    System.out.print(numbers[k]+"  ");
                    cs = cs+numbers[k];
                    
                }


                if(cs<minsum)
                {
                    minsum=cs;
                }

                if(cs>maxsum)
                {
                    maxsum=cs;
                }

                ts++;
                System.out.print(" Sum of subArray->("+ts+") = "+cs);
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("total subArray = "+ts);
        System.out.println("Minimum SubArray = "+minsum);
        System.out.println("Maximum SubArray = "+maxsum);
    }
    public static void main(String[] args)
    {
        float numbers[] = {2550.00f,2565.05f,2557.00f,2523.50f,2526.65f,2545.30f,2606,2552.50f,2524.85f,2458.40f,2472.70f,2458,2473.50f,2472.90f,2475,2449,2440,2412.45f,2384.40f,2331.70f,2382};
        PrintSubArrays(numbers);
    }
}
