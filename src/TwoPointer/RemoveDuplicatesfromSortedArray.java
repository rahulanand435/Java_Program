package TwoPointer;

import java.util.Arrays;

public class RemoveDuplicatesfromSortedArray {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
//        System.out.println(Arrays.toString(delete(nums)));
//        System.out.println(delete(nums));
        System.out.println(removeDuplicates(nums));
    }
    static int removeDuplicates(int[] nums) {
        int i = 0;
        for (int n : nums)
            if (i == 0 || n > nums[i-1])
                nums[i++] = n;
        return i;
    }
    static int delete(int[] nums){
        int i = 0;
        int j = 1;
        while(j < nums.length && i < nums.length){
            if (nums[i] == nums[j]){
                j++;
            }
            else{
                nums[i + 1] = nums[j];
                i++;
            }
        }
        int x = i + 1;
        return x;
    }

}
