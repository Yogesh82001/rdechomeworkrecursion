import java.util.ArrayList;
import java.util.Collections;

public class permutationusingswapapproch {
    static ArrayList <Integer> list=new ArrayList<>();
    /**
     * @param list
     * @param index
     */
    public static void getperm(ArrayList<Integer>list,int index){
        //base case
        if(index>=list.size()){
            
            System.out.println(list);
            return;
        }
        for(int i=index;i<list.size();i++){
            Collections.swap(list,index,i);
            getperm(list, index+1);
            // for backtracking
            Collections.swap(list,index,i);
        }

        }

    
    public static void main(String[] args) {
        System.out.println("enter the list : ");
   list.add(1);
   list.add(2);
   list.add(3);


        getperm(list,0);
    }
 
}
