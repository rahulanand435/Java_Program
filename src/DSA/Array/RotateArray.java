package DSA.Array;

import java.util.Arrays;
import java.util.Stack;

public class RotateArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
//        Output: [5,6,7,1,2,3,4]
        System.out.println(Arrays.toString(rotate(nums, k)));
    }
    static void reverse(int[] nums,int s, int e){
        while(s < e) {
            int temp = nums[s];
            nums[s] = nums[e];
            nums[e] = temp;
            s++;
            e--;
        }
    }

    static int[] rotate(int[] nums, int k) {
        k = k % nums.length;
        int n = nums.length;
        reverse(nums,0,n - k -1);
        reverse(nums,n - k ,n - 1);
        reverse(nums,0,n - 1);
        return  nums;
    }
}

