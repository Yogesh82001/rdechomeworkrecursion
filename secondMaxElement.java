package homeworkrdec;

public class secondMaxElement {
    static void Secondmax(int arr[],int n){
        int count=0;
        int max=arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
                count++;
            }
            if(count==1)
            break;
        }
        System.out.println("Second max element is "+max);
    }
    public static void main(String[] args) {
        int arr[]={10,5,20,2,50};
        int n=arr.length;
        Secondmax(arr, n);
    }
    
}
