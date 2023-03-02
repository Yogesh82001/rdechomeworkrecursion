public class DutchNationalFlag {
    public static void main(String[] args) {
        int arr[]={0,1,1,1,0,0,2,2,1,0,1,0,2,2};
        int n=arr.length;
        System.out.println(n);
        int arr1[]=new int[n];
        int count0=0;
        int count1=0;
        
        for(int i=0;i<n;i++){
            System.out.print(","+arr[i]);
            if(arr[i]==0){
                count0++;
            }
            else if(arr[i]==1){
                count1++;
            }
        }
        int m=count0+count1;
        System.out.println();
        int count2=n-m;
        for(int i=0;i<n;i++){
            if(i<count0){
                arr1[i]=0;
            }
            else if(i<(count1+count0)&&i>=count0){
                arr1[i]=1;
            }
            else if(i>=(count1+count0)&&i<n){
                arr1[i]=2;
            }
        }
        for(int i=0;i<arr1.length;i++){
            System.out.print(","+arr1[i]);
        }
    }
    
}
