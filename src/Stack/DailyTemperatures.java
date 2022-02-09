package Stack;

import java.util.Arrays;
import java.util.Stack;

public class DailyTemperatures {
    public static void main(String[] args) {
        int[] temp = {73,74,75,71,69,72,76,73};
        System.out.println(Arrays.toString(dailyTemperatures(temp)));
    }
   static int[] dailyTemperatures(int[] temperatures){
       Stack<Integer> s = new Stack<>();
       int[] answer = new int[temperatures.length];
       for (int i = temperatures.length - 1; i >= 0 ; i--) {
           while(!s.isEmpty() && temperatures[s.peek()] <= temperatures[i]){
               s.pop();
           }
           answer[i] = s.isEmpty()? 0 : s.peek() - i;
           s.push(i);
       }
       return answer;
    }
}
