package TwoPointer.SlidingWindow;

import java.util.ArrayList;

public class MaxSumSubarrayofsizeK {
    public static void main(String[] args) {
        int[] arr = {100, 200, 300, 400};
        int K = 2;
        int N  = arr.length;
        System.out.println(maximumSumSubarray(K,arr,N));
    }
    static int maximumSumSubarray(int K, int[] arr, int N){
       int s = 0,e = 0,sum = 0,maxValue = Integer.MIN_VALUE;
       while (e < N){
           sum += arr[e];
           if (e - s + 1 < K ){
               e++;
           }
           else{
               if (sum > maxValue){
                   maxValue = sum;
               }
               e++;
               sum = sum - arr[s];
               s++;
           }

       }
       return maxValue;
    }
}
