package February;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Find All Anagrams in a String
public class Feb2nd2022 {
    public static void main(String[] args) {
        String s = "af", p = "be";
//        Output: [0,6]
        System.out.println((findAnagrams(s,p)));
    }
    static List<Integer> findAnagrams(String s, String p){
        ArrayList<Integer> a = new ArrayList<>();
        int k = p.length();
        int psum = 0;
        for (int i = 0; i < k; i++) {
            psum = psum + ((int)(p.charAt(i)));
        }
        int st = 0,e= 0,sum = 0;
        while(e < s.length()){
            sum = sum + (int)(s.charAt(e));
            if (e - st + 1 < k){
                e++;
            }else {
                if (psum == sum){
                    a.add(st);
                }
                e++;
                sum = sum - (int)(s.charAt(st));
                st++;
            }
        }int count = 0;
        if (s.length() == p.length()){
            for (int i = 0; i < k; i++) {
                if (s.charAt(i) == p.charAt(i)){
                    count++;
                }
            }
            if (count < k){
                a.clear();
            }
        }
        return a;
    }
}
