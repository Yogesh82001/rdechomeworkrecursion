public class Trappingrainwater {
    public static void main(String[] args) {
        int arr[]={2,0,3,1,5,2,5};
        int n=arr.length;
        int pmax[]=new int[n];
        int smax[]=new int[n];
pmax[0]=arr[0];
for(int i=1;i<n;i++){
    pmax[i]=Math.max(pmax[i-1],arr[i]);
}
smax[n-1]=arr[n-1];
for(int i=n-2;i>=0;i--){
    smax[i]=Math.max(smax[i+1],arr[i]);
}

        int total=0;
        for(int i=0;i<n;i++){
            int current=arr[i];
            int left=pmax[i];
            int right=smax[i];
            int min_height=Math.min(left, right);
            if(min_height>current){
                total+=min_height-current;
            }
        }
        System.out.println(total);
    
    }
    
}
