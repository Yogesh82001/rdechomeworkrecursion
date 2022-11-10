package homeworkrdec;

import java.util.Scanner;

public class rcursionq {
    // POWER OF ANY NUMBER ------->>>>>>>>>
    static int power(int base,int pow){
        if(pow==0){// base case
            return 1;

        }
return(base*power(base,pow-1));//small problem 


}
    public static void main(String[]args){
        System.out.println("Enter the value of number and power :");
        Scanner sc=new Scanner(System.in);
        int base=sc.nextInt();
        int pow=sc.nextInt();
        System.out.println("Required power is :"+power(base,pow));//call

    }
}
    

