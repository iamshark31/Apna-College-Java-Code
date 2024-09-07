import java.util.*;
public class linearmenusearch {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String menu[] = new String[15];
        System.out.println("enter the menu");
        for(int i=0;i<=menu.length;i++)
        {
            menu[i]=sc.nextLine();
        }
        System.out.println("enter Element to be searched:");
        String key = sc.nextLine();
        //to search
        for(int i=0;i<=menu.length;i++)
        {
            if(menu[i]==key)
            {
                System.out.println("Element is found at position "+i+1);
            }
            else{
                System.out.println("Element not found");
            }
        }
    }
}
