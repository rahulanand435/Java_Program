package February;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {3,3};
        int target = 6;
//        Output: [0,1]
        System.out.println(Arrays.toString(result(nums,target)));
    }

    static int[] result(int[] nums, int target) {
        int[] st = new int[nums.length];
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            st[i] = nums[i];
        }
        Arrays.sort(st);
        int s = 0;
        int e = n - 1;
        int[] result = new int[2];
        while (s < e) {
            if (st[s] + st[e] > target) {
                e--;
            }if (st[s] + st[e] < target) {
                s++;
            }if (st[s] + st[e] == target) {
                result[0] = st[s];
                result[1] = st[e];
                break;
            }

        }
        int x = 0, y = 0;

        for (int i = 0; i < n; i++) {
            if (result[0] == nums[i]) {
                x = i;
                break;
            }
        }
        for (int i = n - 1; i >= 0; i--) {
            if (result[1] == nums[i]) {
                y = i;
                break;
            }
        }
        result[0] = x;
        result[1] = y;

        return result;
    }
}