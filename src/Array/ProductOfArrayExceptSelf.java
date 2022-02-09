package Array;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int n = nums.length;
        System.out.println(Arrays.toString(productExceptSelf1(nums,n)));
    }
    static int[] productExceptSelf1(int[] nums, int n){
        int[] left = new int[n];
        int[] right = new int[n];
        left[0] = 1;
        right[n - 1] = 1;
        int temp1 = 1;
        for (int i = 1; i < n; i++) {
            left[i] = temp1 * nums[i - 1];
            temp1 *= nums[i - 1];
        }
        int temp2 = 1;
        for (int j = n - 2; j >= 0 ; j--) {
            right[j]  = temp2 * nums[j + 1];
            temp2 *= nums[j + 1];
        }
        for (int i = 0; i < n; i++) {
            nums[i] = left[i] * right[i];
        }
        return  nums;
    }


//    time complexity o(n^2)
    static long[] productExceptSelf(int nums[], int n){
        long[] result = new long[n];
        int j = 0;
        for (int i = 0; i < n; i++) {
            j = 0;
            for ( j = 0; j < n; j++) {
                if (i == j){
                    result[i] *= 1;
                }else {
                    result[i] *= nums[j];
                }
            }

        }
        return result;
    }
}
