package homeworkrdec;

import java.util.Arrays;
import java.util.Scanner;

public class checkarraysorted {
    private static boolean isSortedArray(int[] array, int n){
        if(n == 1 || n == 0) return true;
        return array[n-2] <= array[n-1] && isSortedArray(array, n-1);
    }

    
    public static void main(String[] args) {
        System.out.println("Enter the required size of the array :: ");
      Scanner s = new Scanner(System.in);
      int size = s.nextInt();
      int arr[] = new int [size];
      System.out.println("Enter the elements of the array one by one ");
      for(int i=0; i<size; i++) {
         arr[i] = s.nextInt();
      }
      System.out.println("Contents of the array are: "+Arrays.toString(arr));
        
        System.out.println("The array " + Arrays.toString(arr) + " " + (isSortedArray(arr, arr.length)?"is":"is not") + " sorted.");
        System.out.println("--------");
        System.out.println("The array " + Arrays.toString(arr) + " " + (isSortedArray(arr, arr.length)?"is":"is not") + " sorted.");

    }
    
}
