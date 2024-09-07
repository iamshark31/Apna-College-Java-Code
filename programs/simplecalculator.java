import java.util.*;
public class simplecalculator {
    public static void main(String args[])
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a = scn.nextInt();
        int b = scn.nextInt();
        float res=0;
        System.out.println("1=addition\n2=substraction\n3=multiplication\n4=divide\n5=remainder");
        System.out.println("Enter your choice");
        int ch = scn.nextInt();
        switch(ch){
            case 1 :  res=a+b;
                        break;
            case 2 :  res=a-b;
            break;
            case 3 :  res=a*b;
            break;
            case 4 :  res=a/b;
            break;
            case 5 : res=a%b;
            break;
            default : System.out.println("Entered wrong choice");            
        }
        System.out.println("Result = " + res);

    }
}
