import java.util.Scanner;
//program to print inverted and rotated half pyramid
public class patterns{
    public static void hollow_rectangle(int totRows, int totColumns)
    {
        for(int i=1;i<=totRows;i++)
        {
            for(int j=1;j<=totColumns;j++)
            {
                if(i==1||i==totRows||j==1||j==totColumns)
                {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
    }
    //-----x-------x--------x---------------x---------x------
    public static void inverted_rotated_half_pyramid(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
    //---x---------------x----x------x----x-------x----
    public static void inverted_half_pyramid_numbers(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j =1;j<=n-i+1;j++)
            {
                System.out.print(j);
            }
            System.out.println("");
        }
    }
    //--------x--------x----------x-----------x------

    public static void floyds_triangle(int n)
    {
        int num=1;
        for(int i = 1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(" "+num);
                num++;
            }
            System.out.println(" ");
        }
    }
    //-----x----------x----------x--------x----------x------

    public static void Triangle_1_0(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for( int j=1;j<=i;j++)
            {
                if(((i+j)%2)==0)
                {
                    System.out.print(1+" ");
                }else{
                    System.out.print(0+" ");
                }
            }
            System.out.println(" ");
        }
    }

    //-------x-----------x----------x-----------x-------

    public static void butterfly(int n)
    {
        for(int i=1;i<=n;i++)
        {
            //for stars
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            //for space
            for(int j=1;j<=2*(n-i);j++)
            {
                System.out.print(" ");
            }
            //for stars
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        //2nd half
        for(int i=n;i>=1;i--)
        {
            //for stars
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            //for space
            for(int j=1;j<=2*(n-i);j++)
            {
                System.out.print(" ");
            }
            //for stars
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        
    }

    //-----x-------x-----------x----------------x------------x-----


    public static void solid_rhombus(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=(n-i);j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    //-----x-------x-----------x----------------x------------x-----

    public static void hollow_rhombus(int rows, int colms)
    {
        //spaces

        for( int i=1;i<=rows;i++)
        {
            for(int j=1;j<=(rows-i);j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=colms;j++)
            {
                if(i==1||i==rows||j==1||j==colms)
                {
                    System.out.print("*");

                }else{
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }

    //-----x-------x-----------x----------------x------------x-----

    public static void diamond(int n)
    {
        // 1st half
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=(n-i);j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        //2nd half
        for(int i=n;i>=1;i--)
        {
            for(int j=1;j<=(n-i);j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

     //-----x-------x-----------x----------------x------------x-----

    public static void main(String args[])
    {
       System.out.println("1. hollow rectangle");
       System.out.println("2. inverted_rotated_half_pyramid");
       System.out.println("3. inverted_half_pyramid_numbers");
       System.out.println("4. floyds_triangle");
       System.out.println("5. Triangle_1_0");
       System.out.println("6. butterfly");
       System.out.println("7. solid_rhombus");
       System.out.println("8. hollow_rhombus");
       System.out.println("9. Diamond");
       Scanner sc = new Scanner(System.in);
       System.out.println("enter your choice:");
       int ch=sc.nextInt();
       int rows;
       int colms;
       if(ch==1||ch==8)
       {
        System.out.println("Enter number of rows and columns:");
       }
       else
       {
        System.out.println("Enter number of rows and any random number:");
       }
       rows = sc.nextInt();
       colms = sc.nextInt();
       
       switch(ch)
       {
        case 1: hollow_rectangle(rows, colms);
        break;
        case 2: 
                inverted_rotated_half_pyramid(rows);
        break;
        case 3: 
                inverted_half_pyramid_numbers(rows);
        break;
        case 4: 
                floyds_triangle(rows);
        break;
        case 5:
                Triangle_1_0(rows);
        break;
        case 6: 
                butterfly(rows);
        break;
        case 7: 
                solid_rhombus(rows);
        break;
        case 8: 
                hollow_rhombus(rows, colms);
        break;
        case 9:
                diamond(rows);
        break;
        default: System.out.println("entered wrong choice");
       }

    }
}
   