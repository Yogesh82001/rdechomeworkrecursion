public class Runningsum {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        int n=arr.length;
        int arr1[]=new int[n];
            arr1[0]=arr[0];
            for(int i=1;i<n;i++){
                arr1[i]=arr1[i-1]+arr[i];
            }
            for(int i=0;i<n;i++){
                System.out.print(" "+arr1[i]);

            }
    
}

    
}
