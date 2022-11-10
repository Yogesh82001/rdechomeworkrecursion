package homeworkrdec;

import java.util.Scanner;

public class partten7usingrecursion {
    /*
A 
B B 
C C C 
D D D D 
E E E E E
           */

static void print_row(int no, int val)
{
	// base case
	if (no == 0)
		return;
	System.out.print((char)(val + 64) + " ");

	// recursively calling print_row()
	print_row(no - 1, val);
}

// function to print the pattern
static void pattern(int n, int num)
{
	// base case
	if (n == 0)
		return;
	print_row(num - n + 1, num - n + 1);
	System.out.println();

	// recursively calling pattern()
	pattern(n - 1, num);
}


public static void main(String[] args)
{
	System.out.println("enter the values of row for creating partten : ");
       Scanner sc=new Scanner(System.in);
       int n = sc.nextInt();
		pattern(n, n);
}
}



    

