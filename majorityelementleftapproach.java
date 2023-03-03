import java.util.HashMap;
import java.util.Map;

public class majorityelementleftapproach {

    static int approach_1(int arr[]) {//simple O(n^2)
        int n = arr.length;
        for(int i : arr) {
            int count = 0;
            for(int e : arr) {
                if(i == e) {
                    count+=1;
                }
            }
            if(count > n/2) {
                return i;
            }
        }
        return -1;
    }

    static int approach_2(int arr[]) {//hashmap extar space comlexcity
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < arr.length; i++) {
            if(map.get(arr[i]) == null) {
                map.put(arr[i], 1);
            }
            else {
                map.put(arr[i], map.get(arr[i]) + 1);
            }
        }
        //System.out.println(map);
        for(Map.Entry<Integer,Integer> entry : map.entrySet()) {//loop in hashmap using Entry method
            System.out.println(entry.getKey() + "," + entry.getValue());
        }
        return 0;
    }

    static int approach_3(int arr[]) {//Boyer-Moore Algorithm no extra space and time coplexcity O(1)
        int majority=0;
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(count==0){
                majority=arr[i];

            }
            if(majority==arr[i]){
                count++;

            }
            else{
                count--;

            }

        }
        count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==majority){
                count++;
            }
        }
        int result=count>arr.length/2 ? majority:-1;
        return result;
        
    }

    public static void main(String[] args) {
        int arr[] = {2,2,1,1,1,2,2};
        approach_1(arr);
        approach_2(arr);
        approach_3(arr);
    }
}
