#include<stdio.h>
#include<conio.h>
#include<stdbool.h>
void main()
{
    int year;
    bool x,y,z;
    printf("Enter year:\n");
    scanf("%d",&year);
    x = year%4==0;
    y = year%100!=0;
    z = ((year%100==0) && (year%400==0));

    if(x && (y || z))
    {
        printf("%d is a Leap year\n",year);
    }
    else
    {
        printf("%d is not a Leap year\n",year);
    }
    getch();
}