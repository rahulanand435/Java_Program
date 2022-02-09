package February;

import java.util.Arrays;

public class Feb1st2022 {
//    Best Time to Buy and Sell Stock
//    prices = [7,1,5,3,6,4]
//    Output: 5
    public static void main(String[] args) {
    int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit1(prices));
    }
    static int maxProfit1(int[] prices){
        int n = prices.length;
        int max = Integer.MIN_VALUE;
        int maxProfit = 0;
        for (int i = n - 1 ; i >= 0  ; i--) {
            max = Math.max(max,prices[i]);
            maxProfit = Math.max(maxProfit,max - prices[i]);
        }
        return maxProfit;
    }
    static int maxProfit(int[] prices){
        int max = Integer.MIN_VALUE;
        int j;
        int n = prices.length - 1;
        for (int i = 0; i < prices.length; i++) {
            j = n;
            for (j = n;j > i; j--){
                if (prices[j] - prices[i] > max){
                    max = prices[j] - prices[i];
                }
            }
        }
        return max > 0 ? max : 0;
    }
}
