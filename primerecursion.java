package homeworkrdec;

import java.util.Scanner;

public class primerecursion {
   static int i=2;
   static int m=1;
   public static void main(String[] args) {
    System.out.println("enter the value of range : ");
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    if (isprime(m)){
        System.out.println(m);
    }
    else{
        System.out.println();
    }

}
public static int isprime(int m ){
  if(m<=n){
    if(i==(m/2)+1){
        System.out.println(m);
        
        
    }
    if(n%i==0){
        System.out.println();

    }
i=i+1;
m=m+1;
 isprime(m);
   }}

    
}
