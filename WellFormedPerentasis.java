

import java.util.ArrayList;
import java.util.List;

public class  WellFormedPerentasis {
    public static List<String> generate(int n){
        List<String> output = new ArrayList<>();
        helper(output,"",0,0,n);
        return output;
    }
    public static void helper(List<String> ans,String currentbracket,int open ,int close,int max){
        if(currentbracket.length()==max*2){
            ans.add(currentbracket);
            return;
        }
        if(open<max){
            helper(ans,currentbracket+"(",open+1,close,max);
        }
        if(close<open){
            helper(ans,currentbracket+")",open,close+1,max);
        }
    }
    public static void main(String[] args) {
        System.out.println(generate(3));
    }
    
}