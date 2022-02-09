package Hash;

import java.util.HashMap;

public class CountOccurenceOfAnagrams {
    public static void main(String[] args) {
        String txt = "forxxorfxdofr";
        String pat = "for";
//        Output: 3
    }
    static void countOccurance(String pat, String txt){
        int s = 0;
        int e = 0;
        int k = pat.length();
        int count = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < k; i++) {
            char ch = pat.charAt(i);
            if (map.containsKey(ch)){
                int val = map.get(ch);
                map.put(ch,val + 1);
            }else{
                map.put(ch,1);
            }
        }
        int noOfChar = map.size();
        while(e < txt.length()){
            char ch = txt.charAt(e);
            if (map.containsKey(ch)){
                int val = map.get(ch);
                map.put(ch,val - 1);
            }
            if (e - s + 1 < k){
                e++;
            }else{
                if (noOfChar == 0) count++;
                e++;
                s++;
            }
        }
    }
}
