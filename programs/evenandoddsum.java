import java.util.Scanner;
/*write a program to that reads a set of integers, and then
prints the sum of even and odd integers*/
public class evenandoddsum {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int num;
        int choice;
        int oddsum = 0;
        int evensum = 0;
        do{
            System.out.println("Enter a number:");
            num = sc.nextInt();
            if(num%2==0){
                evensum += num;
            }else{
                oddsum += num;
            }
            System.out.println("Do you want to continue?\n press 1 if yes or 0 for no");
            choice = sc.nextInt();
        }while(choice==1);
        System.out.println("sum of odd numbers = "+oddsum);
        System.out.println("sum of even numbers = "+evensum);
        }
    }
