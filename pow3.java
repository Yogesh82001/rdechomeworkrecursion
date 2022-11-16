import java.util.Scanner;

public class pow3 {
    /* Check if a number is of power of 3 or not{
       i/p :- 27/16
       o/p :- True/false
  

   */

  static boolean Power(int num) {
  if (num == 2 || num == 0) {
  return false;
  }
  if(num==1){
    return true;
  }
  if (num % 3 == 0) {
  return Power(num / 3);
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
