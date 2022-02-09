package TwoPointer;

import java.util.Arrays;

public class SortColor {
    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};
        System.out.println(Arrays.toString(new1(nums)));
    }
    static void swap(int i ,int j, int[] nums){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    static int[] new1(int[] nums){
        int s = 0;
        int e = nums.length - 1;
        int i = 0;
        while(i <= e){
            if (nums[i] == 0){
                swap(i,s,nums);
                s++;
                i++;
            }else if (nums[i] == 2){
                swap(e,i,nums);
                e--;
            }else
                i++;
        }
        return nums;
    }
    static int[] sortColor(int[] nums){
        int red = 0;
        int white = 0;
        int blue = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] == 0){
                red++;
            }else if (nums[i] == 1){
                white++;
            }else{
                blue++;
            }
        }
        for (int j = 0; j < nums.length; j++){
            if (red != 0){
                nums[j] = 0;
                red--;
            }else if(white != 0){
                nums[j] = 1;
                white--;
            }else
                nums[j] = 2;
                blue--;
        }
        return  nums;
    }
}
