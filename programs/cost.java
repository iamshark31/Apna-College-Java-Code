//Bill of items including tax
import java.util.*;
public class cost {
    public static void main(String args[])
    {
        System.out.println("Enter the cost of pen\nenter the cost of pencil\nenter the cost of eraser");
        Scanner sc = new Scanner(System.in);
        float pen=sc.nextFloat();
        float pencil=sc.nextFloat();
        float eraser=sc.nextFloat();
        float tc=pen+pencil+eraser;
        System.out.println("Total cost = " + tc);
        float gstamt = (tc*18)/100;
        float ntprc = tc+gstamt;
        System.out.println("GST Amount = " + gstamt);
        System.out.println("Net price = " + ntprc);
        sc.close();
    }
}