import java.util.Scanner;

public class pown {
    /* Check if a number is of power of n or not{
        n=4
       i/p :- 27/16
       o/p :- false/true
       n=5
       i/p:- 25/27/16
       o/p:- true/false/false
  

   */

  static boolean Power(int num,int n) {

    if(num==1){
      return true;
    }
    if (num % n == 0) {
    return Power(num / n, n);
    }
    return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enetr the Base number : ");
        int n=sc.nextInt();
        System.out.println("Enter the number you can check it : ");
        int num=sc.nextInt();
        
        if (Power(num,n))
            System.out.println(true);
        else
            System.out.println(false);
  
    }
    
}
