package homeworkrdec;

import java.util.Scanner;

public class countzero {
    static int countZerosRec(int input){
		if(input==0) //Just to handle the case when input=0 
		{
			return 1;
		}
		if(input<10)//this is the actual base case
		{
			return 0;			
		}
		else if(input%10==0)
		{
			return 1+countZerosRec(input/10);//small problem
		}
		return countZerosRec(input/10);// small problem

	}
    

        public static void main(String[] args) {
            System.out.println("Enter the Digit :");
            Scanner sc= new Scanner(System.in);
            int input=sc.nextInt();
            System.out.println(countZerosRec(input));//call

    
        }
    
}

