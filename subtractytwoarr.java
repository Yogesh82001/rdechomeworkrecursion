public class subtractytwoarr {



    public static void main(String[] args) {
        int first[]={10,8,3,4,5};
        int second[]={4,5,7,8};
        int result[]=new int[first.length>second.length?first.length:second.length];
        int i=first.length-1;
        int j=second.length-1;
        int k=result.length-1;
        int sub=0;
        while(k>=0){
        if(i<0 && j>=0){
                sub=second[j];
            }
            else if(i>=0 && j<0){
        sub=first[i];
            }
            else if(first[i]>second[j] && i>=0 && j>=0){
                sub=first[i]-second[j];
            }
            else if(first[i]<second[j] && i>=0 && j>=0){
                first[i]=first[i]+10;
                sub=first[i]-second[j];
                first[i-1]=first[i-1]-1; 
            }
        
            result[k]=sub;
            i--;
            j--;
            k--;
            
        }
        for(int z=0;z<result.length;z++){
            System.out.print(result[z]+" ");
        }
    }
}