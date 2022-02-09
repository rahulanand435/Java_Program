package Stack;

import java.util.Stack;

public class RestrictiveCandyCrush {
    public static void main(String[] args) {
        String s = "geegsforgeeeks";
        int k = 2;
        System.out.println(reduced_String(k,s));
    }
    static String reduced_String(int k, String s){
        Stack<Character> stk = new Stack<>();
        StringBuilder st = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            int count = 0;
            while(!stk.isEmpty() && stk.peek() == s.charAt(i)){
                count++;
                stk.pop();
            }
            if (count == 0 && count != k - 1){
                stk.push(s.charAt(i));
            }else{
                while(count < k -1 && count >= 0){
                    stk.push(s.charAt(i));
                    count--;
                }
            }
        }
        while(!stk.isEmpty()){
            st.append(stk.pop());
        }
        return st.reverse().toString();

        }
}
