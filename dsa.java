public class dsa {
  /*  static int fact(int n){
    if(n==1){// base case
        return 1;
    }
    int smallproblem=fact(n-1);// smaller problem 
    return n*smallproblem;
   }
   public static void main(String[]args){
    fact(5);*/
   // reverse a string by recursion
/*static String reverse(String str){
    // base case
    if(str.length()==1){
        return str;
    }
    return reverse(str.substring(1))+str.charAt(0);
    



   }*/
   static int fib(int n){
    if(n<=1){
        return n;



    }
    int first=fib(n-1);
    int second=fib(n-2);
    int res=first+second;
    return res;

   }
   public static void main(String[]args){
    /*String str="Hello world";
    String revStr = reverse(str);
    System.out.println(revStr);*/
    int n=fib(5);
    System.out.println(n);

   }
   }



