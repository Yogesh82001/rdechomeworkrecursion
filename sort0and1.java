public class sort0and1 {
    
    public static void main(String[] args) {
        int arr[]={0,1,0,0,1,1,0,0,0,1,1};
        int n=arr.length;
        System.out.println(n);
        int arr1[]=new int[n];
        int count0=0;
        
        for(int i=0;i<n;i++){
            System.out.print(","+arr[i]);
            if(arr[i]==0){
                count0++;
            }
        }
        System.out.println();
        int count1=n-count0;
        for(int i=0;i<n;i++){
            if(i<count0){
                arr1[i]=0;
            }
            if(i>=count0&&i<=n){
                arr1[i]=1;
            }
        }
        for(int i=0;i<arr1.length;i++){
            System.out.print(","+arr1[i]);
        }
    }
    
}
