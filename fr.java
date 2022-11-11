package classinrdec; // 11/11/2022  hash map type question  print the frequency of any element in array 

import java.util.HashMap;
import java.util.Scanner;

class Fr{

    static HashMap<Character, Integer> 
    fr(String str, int index, int len ){
        // Termination Case
        if(index == len){
            HashMap<Character, Integer> map = new HashMap<>();
            return map;
        }
            // Small Problem (Char by Char Traverse)
            HashMap<Character, Integer> map = fr(str, index+1, len);
            char singleChar = str.charAt(index);
            if(map.get(singleChar) == null){
                map.put(singleChar, 1);
            }
            else{
                int count  = map.get(singleChar);
                map.put(singleChar, count+1);
            }
            return map;
    }
    public static void main(String[] args) {
        System.out.println("enter the value of String : ");
        Scanner sc=new Scanner(System.in);
        String str = sc.nextLine();
        HashMap<Character, Integer> map = fr(str, 0, str.length());
        System.out.println(map);
        /*HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i<str.length(); i++){
            char singleChar = str.charAt(i);
            if(singleChar == ' '){
                continue;
            }
            if(map.get(singleChar) == null){
                map.put(singleChar, 1);
            }
            else{
                int count = map.get(singleChar);
                map.put(singleChar, count+1);
            }

        }
        System.out.println(map);
        */
    }
}
