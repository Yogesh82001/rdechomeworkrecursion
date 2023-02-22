import java.util.ArrayList;


public class leaderelement {

    static void findleader(int [] arr ,int n){
        // int n=arr.length;
        int max=arr[n];
        ArrayList<Integer> arrlist= new ArrayList<Integer>();
        arrlist.add(max);
        
        for(int i=n-1;i>=0;i--){
            if(max<arr[i]){
                max=arr[i];
                arrlist.add(max);
            }
            }
        System.out.println(arrlist);
    }
    public static void main(String[] args) {
        int arr []={15,18,5,3,6,2};
        int n=arr.length;
        findleader(arr,n);

    }
}

