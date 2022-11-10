package homeworkrdec;

import java.util.Scanner;

public class sumofdigit {
    static int sum_of_digit(int n)
    {
        if (n == 0){
            return 0;
        }
        return (n % 10 + sum_of_digit(n / 10));
    }

    public static void main(String args[])
    {
        System.out.println("enter the digit :");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int result = sum_of_digit(num);
        System.out.println("Sum of digits in " +num + " is " + result);
    }
    
}
