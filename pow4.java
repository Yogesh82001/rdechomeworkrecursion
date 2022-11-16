import java.util.Scanner;

public class pow4 {
    /* Check if a number is of power of 4 or not{
       i/p :- 27/16
       o/p :- false/true
  

   */

  static boolean Power(int num) {

    if(num==1){
      return true;
    }
    if (num % 4 == 0) {
    return Power(num / 4);
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
