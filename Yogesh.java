// backtracking question in java array type question

import java.util.Scanner;

public class Yogesh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many number do you want to enter:");
        int numOfElementOfArray = sc.nextInt();
        System.out.println("Enter numbers of array:");
        int arr [] = new  int [numOfElementOfArray];
        for(int i=0;i<numOfElementOfArray;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter number to match: ");
        int num = sc.nextInt();
        backTrackSol(arr, num, 0, "", 0, 0); 
        sc.close(); 
    }
    public static void backTrackSol(int arr[],int element,int index,String reqArr,int i,int sum) {
        if(sum>element){
            return;
        }
        if (element==sum) {
            System.out.println(reqArr);
            return;
        }
        if (index>=arr.length) {
            return;
        }
        backTrackSol(arr, element, index+1, reqArr+index, i+1, sum+arr[index]);
        backTrackSol(arr, element, index+1, reqArr, i, sum);
    }
}