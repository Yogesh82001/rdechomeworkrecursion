
//import java.util.Scanner;
//class prtten {
  

    
   // public static void main(String[]args){
       /*  int i,j,n,k;
        // partten 1
        for(i=0;i<5;i++){
            for(j=0;j<5;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        // partten 2
        for(i=0;i<5;i++){
            for(j=0;j<5;j++){
                System.out.print(i);
            }
            System.out.println();
        }System.out.println();
        // partten 3
        for(i=0;i<5;i++){
            for(j=0;j<5;j++){
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println();
        // partten 4
        for(i=0;i<5;i++){
            for(j=0;j<i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        // partten 5
        for(i=0;i<5;i++){
            for(j=0;j<i+1;j++){
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println();
        // partten 6
        for(i=0;i<5;i++){
            for(j=0;j<i+1;j++){
                System.out.print(j+1);
            }
            System.out.println();
        }
        System.out.println();
        // partten 7
        for(i=0;i<5;i++){
            for(j=5;j>i;j--){
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println();
        // partten 8
        n=0;
        for(i=0;i<4;i++){
            for(j=0;j<i+1;j++){
                System.out.print(++n);
                
            }
            System.out.println();
        }
        System.out.println();
        // partten 9--pramid

        for(i=0;i<5;i++){
            for(j=0;j<5-i;j++){
                System.out.print(" ");
            }
                for(k=0;k<i;k++){
                    System.out.print("*");
                }
                System.out.println();


            }
            System.out.println();
        
        
        for(i=0;i<5;i++){
            for(j=0;j<5-i;j++){
                System.out.print(" ");
            }
                for(k=0;k<i;k++){
                    System.out.print("* ");
                }
                System.out.println();
            }
            System.out.println();
        
        for(i=0;i<5;i++){
            for(j=0;j<5-i;j++){
                System.out.print(" ");
            }
            for(k=0;k<(2*i)+1;k++){
                System.out.print("*");
            }
            System.out.println();
        }for(i=0;i<5;i++){
            for(j=0;j<i;j++){
                System.out.print(" ");
            }
            for(k=0;k<(2*(5-i))-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        // partten 10
        //*****
        //*   *
        //*   *
       // *   *
        //*****
        int row=5;
        int col=5;
        for(i=0;i<5;i++){
            for(j=0;j<5;j++){
                if(i==0||j==0||i==4||j==4){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
    
            }
            System.out.println();
    }
        // codeforwin


    //     for(i=0;i<row;i++){
    //         for(j=0;j<col;j++){
    //             if(i==0||j==0||i==row-1||j==col-1||i==row/2||j==col/2){
    //                 System.out.print("*");
    //             }
    //             else{
    //                 System.out.print(" ");
    //             }
    
    //         }
    //         System.out.println();
    // }


    for(i=0;i<row;i++){
        for(j=0;j<col;j++){
            if(i==0||j==0||i==4||j==4||i==2&&j==2){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }

        }
        System.out.println();
}


// problem diamond

for(i=0;i<row;i++){
    for(j=0;j<col;j++){
        if(i==0||j==0||i==4||j==4||i==2&&j==2){
            System.out.print("*");
        }
        else{
            System.out.print(" ");
        }

    }
    System.out.println();
}
*/
// prime number 19/10/22   [prime sieve]
  
 /*&boolean isprime(int num){
    if(num%2==0||num%3==0){
        return false;
    }
}
boolean prime = true;
int iter=0;
for(int i=5;i*i<num;i+=6){
    iter++;
    if(num%i==0||num%(i+2)==0){
        prime = false;
        break;
    }
}
System.out.println(iter + "total iteration");
return prime;


}}*/