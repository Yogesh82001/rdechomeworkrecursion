
public class rotatearrbyk {


    public static void Rotate(int arr[], int k) {
    int temp=arr[arr.length-1];
    if(k==0){
        for(int j=0;j<arr.length;j++){
            System.out.print(arr[j]+" ");
        }
        return;
    }
    for(int i=arr.length-2;i>=0;i--){
        arr[i+1]=arr[i];
    }
    arr[0]=temp;
        Rotate(arr, k - 1);
    }


    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
    
        Rotate(arr, 3);

    }
}
    

