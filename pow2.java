import java.util.Scanner;

public class pow2{
    /*
     

      Check if a number is of power of 2 or not{
         i/p :- 16/27
         o/p :- True/false
    

     */

    static boolean Power(int num) {
    if (num == 1 ) {
    return true;
    }
    if (num % 2 == 0) {
    return Power(num / 2);
    }
    return false;
    }
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number you can check it : ");
        int num=sc.nextInt();
        if (Power(num))
            System.out.println(true);
        else
            System.out.println(false);

    }
}