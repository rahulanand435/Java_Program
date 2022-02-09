package Hash;

import java.util.HashMap;

public class KdiffPairsinanArray {
    public static void main(String[] args) {
        int[] nums = {-1,1,1}; int k = 2;
        System.out.println(findPairs(nums,k));
    }
    static int findPairs(int[] nums, int k){
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i:nums) {
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int count = 0;
        for (int key:map.keySet()) {
            if (k != 0) {
                int pair = key + k;
                int val1 = map.getOrDefault(pair, 0);
                int val2 = map.get(key);
                if (val1 > 0 && val1 > val2) {
                    count += 1;
                } else if (val1 == 0 && val2 != 0) {
                    count += 0;
                }else if(val1 > 0 && val2 > 0){
                    count += 1;
                }
            }
            else{
                int val = map.get(key);
                if (val > 1){
                    count += 1;
                }else {
                    count += 0;
                }
            }
        }
        return  count;
    }
}
