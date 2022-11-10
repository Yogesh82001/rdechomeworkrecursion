package homeworkrdec;

import java.util.Scanner;

public class partten2byusingrecursion {
    // function to print a row
static void printn(int num)
{
    // base case
    if (num == 0)
        return;
    System.out.print ("* ");
 
    //  calling 
    printn(num - 1);
}
 
// function to print the pattern
static void pattern(int n, int i)
{
    // base case
    if (n == 0)
        return;
    printn(i);
    System.out.println();
 
    // recursively calling pattern()
    pattern(n - 1, i - 1);
}
 

public static void main (String[] args)
{
 System.out.println("enter the values of row for creating partten : ");
 Scanner sc=new Scanner(System.in);
 int n = sc.nextInt();
    pattern(n, n);
}
    
}

    
