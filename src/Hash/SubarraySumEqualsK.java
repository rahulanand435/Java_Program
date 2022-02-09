package Hash;

import java.util.HashMap;

public class SubarraySumEqualsK {
    public static void main(String[] args) {
        int[] arr = {10 , 2, -2, -20, 10}; int k = -10;   //prefix sum and hashmap
        System.out.println(countSubarray(arr,k));
    }
    static int countSubarray(int[] nums, int k){
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum = 0;
        int count = 0;
        map.put(0,1);
        for (int i: nums) {
            sum += i;
            int val = map.getOrDefault(sum - k,0);
            count += val;
            map.put(sum, map.getOrDefault(sum,0)+1);
        }
        return count;
    }
}
