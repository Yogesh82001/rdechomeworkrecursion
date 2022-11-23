import java.util.ArrayList;

public class subsequence {
    public static ArrayList<String> subSeq(String Str) {
        if(Str.length()==0){
            ArrayList<String> newStr = new ArrayList<>();
            newStr.add("");
            return newStr;
        }
        char singleChar = Str.charAt(0);
        String subString = Str.substring(1);
        ArrayList<String> newStr = subSeq(subString);
        ArrayList<String> reqStr = new ArrayList<>();
        for (int i = 0; i < newStr.size(); i++) {
            reqStr.add(newStr.get(i));
            reqStr.add(singleChar+newStr.get(i));
        }
        return reqStr;
    }
    public static void main(String[] args) {
    
        System.out.println(subSeq("Yogi"));
    }    
}
