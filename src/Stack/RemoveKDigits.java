package Stack;

import java.util.Stack;

public class RemoveKDigits {
    public static void main(String[] args) {
       String S = "3002983";
       int K = 1;
       System.out.println(removeKdigits(S,K));
    }
    static String removeKdigits(String S, int K) {
        Stack<Character> stk = new Stack<>();
        StringBuilder st = new StringBuilder();
        for (int i = 0; i < S.length(); i++) {
            while(!stk.isEmpty() && K > 0 && stk.peek() > S.charAt(i)){
                stk.pop();
                K--;
            }
            if (stk.isEmpty() && S.charAt(i) == '0'){
                continue;
            }else{
                stk.push(S.charAt(i));
            }
        }
        while(!stk.isEmpty() && K > 0){
            stk.pop();
            K--;
        }
        if (stk.isEmpty()){
            return "0";
        }
        while(!stk.isEmpty()){
            st.append(stk.pop());
        }
        return st.reverse().toString();
    }
}
