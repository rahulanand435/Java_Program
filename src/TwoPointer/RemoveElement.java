package TwoPointer;

import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {
        int[] nums = {3,2,2,3};
        int val = 3;
        System.out.println(remove(nums,val));
    }
    static void swap(int i ,int j, int[] nums){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    static int remove(int[] nums, int val){
        for (int i = 0;i < nums.length;i++) {
            if (nums[i] == val) {
                nums[i] = -1;
            }
        }
        int i = 0;
        int j = nums.length - 1;
        while(i < j){
            if (nums[i] != -1){
                i++;
            }else if (nums[j] == -1){
                j--;
            }else{
                swap(i,j,nums);
            }
        }
        return i;
    }
}
