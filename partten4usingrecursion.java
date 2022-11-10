package homeworkrdec;

import java.util.Scanner;

public class partten4usingrecursion {
    /* 
    
        * 
      * * 
    * * * 
  * * * * 
* * * * * 
              */
    


	static void print_space(int space)
	{
		// base case
		if (space == 0)
		{
			return;
		}
		System.out.print(" " + " ");

		// recursively calling print_space()
		print_space(space - 1);
	}

	// function to print asterisks
	static void print_asterisk(int asterisk)
	{
		// base case
		if (asterisk == 0)
		{
			return;
		}
		System.out.print("* ");

		// recursively calling print_asterisk()
		print_asterisk(asterisk - 1);
	}

	// function to print the pattern
	static void pattern(int n, int num)
	{
		// base case
		if (n == 0)
		{
			return;
		}
		print_space(n - 1);
		print_asterisk(num - n + 1);
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



    

