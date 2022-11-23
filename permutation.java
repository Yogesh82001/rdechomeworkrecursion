import java.util.Scanner;

public class permutation {

    
    /*static void getperm(String str,int index){
        
        if(index>=str.length()){
            System.out.println(str);
            return;
        }
        for(int i=index;i<=str.length();i++){
        swap(str[index],str[i]);//to swap the value 
        getperm(str,index+1);//call
        swap(str[index],str[i]);//backtracking----> again swap for right permutation
                }
                
        
        
    }
    
    public static void main(String[] args) {
        System.out.println("Enter the string");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println("All permutation's : ");
        getperm(str,0);
        
    }*/
    public static void permutation(String str,String reqStr) {
        if (str.length()==0) {
            System.out.println(reqStr);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            String newStr = str.substring(0, i)+str.substring(i+1);
            permutation(newStr, reqStr+curr);
        }
    }
    public static void main(String[] args) {
        System.out.println("enter the value of String : ");
        Scanner sc =new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println("permutation of given String "+str+" is : ");
        permutation(str,"");
    }
}

