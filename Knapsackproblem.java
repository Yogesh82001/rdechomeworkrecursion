import java.util.*;

public class Knapsackproblem {
    public static int solve(ArrayList<Integer>weight,ArrayList<Integer>value,int index,int capacity,ArrayList<Integer>DP){
        if(index==0){
            if(weight[0]<=capacity){
                return vlaue[0];
            }
            else{
                return 0;
            }
        

        }
        if(DP[index][capacity]!=-1){
            return DP[index][capacity];
        }
            int pick=0;
            if(weight[index]<=capacity){
                pick=value+solve(weight,value,index-1,capacity-weight[index],DP);
                
            }
            int notpick=0+solve(weight,value,index-1,capacity,DP);
            DP[index][capacity]=Collections.max(notpick,pick);
            return DP;
    }
    int knapsack(ArrayList<Integer>weight,ArrayList<Integer>value,int n,int maxweight){
        ArrayList<ArrayList<Integer>>DP(n,ArrayList<Integer>(maxweight+1,-1));
        return solve(weight,value,n-1,maxweight,DP);
    }
    public static void main(String[] args) {
       System.out.print( knapsack({1,2,4,5},{5,4,8,6},4,5));
    }

}

