public class oddelement {
    // using XOR apporach 
    public static void main(String[] args) {
        int arr[]={1,1,2,3,3,4,4};
        int n=arr.length;
        int arr1[]=new int[n];
            arr1[0]=arr[0];
            for(int i=1;i<n;i++){
                arr1[i]=arr1[i-1]^arr[i];
            }
            System.out.println(arr1[n-1]);

            
    
    
}
}
