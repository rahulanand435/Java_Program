package TwoPointer;

import java.util.Arrays;

public class NextGreaterElementII {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,3};   //[2,3,4,-1,4]
        System.out.println(Arrays.toString(nextGreaterElements(nums)));
    }

   static int[] nextGreaterElements(int[] nums){
       int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
           int j = i + 1;
           while(j <= nums.length){
               if (j == nums.length){
                   j--;
               }
               if (nums[j] > nums[i]){
                   result[i] = nums[j];
                   break;
               }else{
                   j++;
                   }
               if (j == nums.length){
                   j = 0;
               }
               if (i == j){
                   result[i] = -1;
                   break;
               }

           }
       }
        return result;
   }

}
