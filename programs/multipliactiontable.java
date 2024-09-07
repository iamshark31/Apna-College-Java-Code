import java.util.Scanner;
public class multipliactiontable {
    public static void main(String args[])
    {
        int n;
        int mul=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        n = sc.nextInt();
        for(int i = 1; i<=10; i++){
            mul = n*i;
            System.out.println(n +"x"+ i+"="+ mul);
        }
    }
}
