package Stack;

import java.util.Arrays;
import java.util.Stack;

public class First {
    public static void main(String[] args) {
        long[] arr = {6, 8, 0, 1, 3};
        int n = arr.length;
        System.out.println(Arrays.toString(large(arr,n)));
    }
    static long[] large(long[] arr, int n){
        Stack<Long> s = new Stack<>();
        long[] result = new long[n];
        for (int i = n - 1; i >= 0 ; i--) {
            while(!s.isEmpty() && s.peek() < arr[i]){
                s.pop();
            }
            result[i] = s.isEmpty()? -1 : s.peek();
            s.push(arr[i]);
        }
        return  result;
    }
    static int[] Smallestonleft (int arr[], int n) {
        // Complete the function
        Stack<Integer> s = new Stack<>();
        int[] result = new int[n];
        for (int i = 0;i < n;i++){
            while(!(s.isEmpty()) && s.peek() >= arr[i]){
                s.pop();
            }
            result[i] = s.isEmpty()? -1 : s.peek();
            s.push(arr[i]);
        }
        return result;
    }

    static long[] nextLargerElement(long[] arr, int n){
        Stack<Long> s = new Stack<>();
        long[] result = new long[n];
        for (int i = n - 1;i >= 0;i--){
            while(!s.isEmpty() && s.peek() < arr[i]){
                s.pop();
            }
            result[i] = s.isEmpty()? -1 : s.peek();
            s.push(arr[i]);
        }
        return result;
    }
}