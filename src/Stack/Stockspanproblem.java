package Stack;

import java.util.Arrays;
import java.util.Stack;

public class Stockspanproblem {
    public static void main(String[] args) {
        int[] price = {100,80,60,70,60,75,85};
        int n = price.length;
//        System.out.println(Arrays.toString(calculateSpan(price,n)));
        System.out.println(Arrays.toString(cal(price,n)));
    }
    static int[] cal(int price[], int n){
        int[] result = new int[n];
        Stack<Integer> s = new Stack<>();
        s.push(0);
        result[0] = 1;
        for (int i = 1; i < n   ; i++) {
            while(!s.isEmpty() && price[s.peek()] <= price[i]){
                s.pop();
            }
            result[i] = s.isEmpty()? i + 1 : i - s.peek();
            s.push(i);

            }
           return result;
        }





//    BruteForce Method
    static int[] calculateSpan(int price[], int n){
        int[] result = new int[n];
        result[0] = 1;
        for (int i = n - 1; i >= 1 ; i--) {
            int j = i - 1;
            while(j < i && j >= 0){
                if (price[j] > price[i]){
                    result[i] = i - j ;
                    break;
                }else if (price[j] < price[i]){
                    if (j >= 0) {
                        j--;
                    }if(j == -1){
                        j++;
                        result[i] = i - j + 1;
                        j--;
                     }
                }
            }
        }
        return result;
    }
}
