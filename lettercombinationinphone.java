package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class lettercombinationinphone {
    public static List<String> letterCombinations(String digits) {
        map.put(0, "");
        map.put(1, "");
        map.put(2,"abc");
        map.put(3,"def");
        map.put(4,"gfi");
        map.put(5,"jkl");
        map.put(6,"mno");
        map.put(7,"pqrs");
        map.put(8,"tuv");
        map.put(9,"wxyz");
        return implement(digits);
    }
    static HashMap<Integer,String> map = new HashMap<>();
    public static ArrayList<String> implement(String digits){
        ArrayList<String> reqlist = new ArrayList<>();
        if(digits.length()==0){
            ArrayList<String> list = new ArrayList<>();
            list.add("");
            return list;
        }
        int index = Integer.parseInt(digits.substring(0,1));
        ArrayList<String> reqlist1=implement(digits.substring(1));
        ArrayList<String> reqlist2=implement1(map.get(index));
        for(int k=0;k<reqlist2.size();k++){
            for(int j=0;j<reqlist1.size();j++){
                reqlist.add(reqlist2.get(k)+reqlist1.get(j));
            }
        }
        return reqlist;
    }
    public static ArrayList<String> implement1(String str){
        ArrayList<String> reqlist = new ArrayList<>();
        for(int i=0;i<str.length();i++){
            reqlist.add(str.substring(i,i+1));
        }
        return reqlist;
    }
    public static void main(String[] args) {
        System.out.println(letterCombinations("45"));
    }

}
    