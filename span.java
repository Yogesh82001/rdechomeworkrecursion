package homeworkrdec;

public class span {

    static void spaninarray(int arr[], int n) {
        int max = arr[0];
        int min=arr[0];
        for(int i = 1; i < n; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }

        int spanarray=max-min;
        System.out.println(spanarray);
    }
    public static void main(String[] args) {
        int arr[] = {1,5,2,6,7,12,8};
        int n = arr.length;
        spaninarray(arr, n);
    }
    
}
