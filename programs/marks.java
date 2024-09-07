import java.util.*;
//check if a student will pass or fail using ternary operator
public class marks {
    public static void main(String args[])
    {
    int marks;
    System.out.println("Enter Marks ");
    Scanner sc = new Scanner(System.in);
    marks = sc.nextInt();
    String result = marks>=33?"Pass" : "Fail";
    System.out.println(result);
}
}
