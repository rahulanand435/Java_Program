package TwoPointer;

import java.util.Arrays;

public class RemoveDuplicatesfromSortedArrayII {
    public static void main(String[] args) {
        int[] nums = {0,0,0,1,1,1,1,2,3,3,3};
        System.out.println(removeDuplicates(nums));
    }
    static int removeDuplicates(int[] nums) {
       int index = 2;
       if (nums.length < 3){
           return nums.length-1;
       }
       for (int i = 2;i < nums.length; i++){
           if (nums[i] != nums[index - 2]){
               nums[index] = nums[i];
               index++;
           }
       }
       return  index;
    }
}
