import java.util.*;
//income tax calculator
public class incometax {
    public static void main(String args[])
    {
        System.out.println("Enter income of user");
        Scanner sc=new Scanner(System.in);
        float incm=sc.nextFloat();
        float tax;
        if(incm<=500000)
        {
            System.out.println("tax = 0");
        }
        else if((incm>500000)&&(incm<1000000)){
            System.out.println("Tax = 20%");
            tax=(0.2f*incm);
            System.out.println("Tax amount = "+ tax);
        }
        else{
            System.out.println("Tax = 30%");
            tax=(0.3f*incm);
            System.out.println("Tax amount = "+ tax);
        }
        }
    }
