

import java.util.ArrayList;

public class borddice {
    public static void main(String[] args) {
        System.out.println(dicePos(0, 10));  
        
    }
    static ArrayList<String>dicePos(int source,int target){
        if(source==target){
            ArrayList<String> per = new ArrayList<>();
            per.add("");
            return per;
        }
        if (source>target) {
            ArrayList<String> per = new ArrayList<>();
            return per;
        }
        ArrayList<String> finalResult = new ArrayList<>();
        for (int dice = 1; dice <=6; dice++) {
            int currentValue = dice+source;
            ArrayList<String> per = dicePos(currentValue, target);
            for (String temp : per) {
                finalResult.add(temp+dice);
            }
        }
        return finalResult;
    }
}