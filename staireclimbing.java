package leetcode;
import java.util.Scanner;

public class staireclimbing{
        static int fib(int n)
    {
        if (n <= 1)
            return n;
        return fib(n - 1) + fib(n - 2);
    }
 
    
    static int countWays(int s)
    {
        return fib(s + 1);
    }
    public static void main(String args[])
    {
        System.out.println("enter the value of stair : ");
        Scanner sc=new Scanner(System.in);
        int s = sc.nextInt();
        System.out.println("Number of ways = " + countWays(s));
    }
} 
    

