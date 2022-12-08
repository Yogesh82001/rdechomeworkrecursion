import java.util.ArrayList;
import java.util.List;

class Combinationsum {
    public  List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>>comb=new ArrayList ();
        generatecombination(0,candidates,new ArrayList (),comb,target);
        return comb;
        
    }
    void  generatecombination(int start,int []nums,List<Integer> current,List<List<Integer>>comb,int target){
        if(target==0){
            comb.add(new ArrayList(current));

        }
        if(target<0){
            return;
        }
        for(int i=start;i<nums.length;i++){
            current.add(nums[i]);
            generatecombination(i,nums,current,comb,target-nums[i]);
            current.remove(current.size()-1);
        }
    }
    

    }
