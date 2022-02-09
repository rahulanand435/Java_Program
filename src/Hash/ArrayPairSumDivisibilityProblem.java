package Hash;

import java.util.HashMap;

public class ArrayPairSumDivisibilityProblem {
    public static void main(String[] args) {
        int[] arr = {6, 6, 6};
        int k = 6;
        System.out.println(canPair(arr,k));
    }
    static boolean canPair(int[] nums, int k){
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int rem = nums[i] % k;
            if (rem < 0) rem += k;
            map.put(rem,map.getOrDefault(rem,0) + 1);
        }
        for (int key : map.keySet()){
            if (key == 0 ||k % 2 == 0 && key == k/2){
                int val = map.get(key);
                if (val % 2 != 0) return false;
            }else {
                int pair = k - key;
                int val1 = map.getOrDefault(pair, 0);
                int val2 = map.get(key);
                if (val1 != val2) return false;
            }
        }
        return true;
    }
}
