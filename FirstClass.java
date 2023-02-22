import java.util.Scanner;
import java.io.IOException;

class FirstClass{
    /**
     * @param args
     * @throws IOException
     */
    public static void main(String[]args)throws IOException{
    //----------problem's______________________________________
    // count a number 
   /* int num = 3456;
    int c=0;

    while(num!=0){
        num=num/10;
        c=c+1;
    }
    System.out.println(c);

    }*/
    Scanner scanner = new Scanner(System.in);
    // System.out.println("Enter your rollno: ");
     //int rollno =scanner.nextInt();
    // scanner.nextLine();// ye /n ko buffer me se hta deta h jisse ham bad me bhi input le sakte h 
    // System.out.println("Enter your name ");
    // String name =scanner.nextLine();
    // System.out.println("Enter your age ");
    // byte age =scanner.nextByte();
    // System.out.println("Roll no: "+rollno);52
    // System.out.println(" name :"+name);
     //System.out.println("Age : "+age);
     
     /* 
    // read one character at a time
    int name = System.in.read();
    System.out.println("Name is :"+name ); */
    // Buffre
   
  //  String name = scanner.nextLine();
    //System.out.println("Hello :"+ name);
    //scanner.close();
    System.out.println("enter a number");
    int x=scanner.nextInt();

    if((x&1)==1){
        System.out.println("number is odd");
    }
    else{
        System.out.println("number is even");
    }

    }
}
