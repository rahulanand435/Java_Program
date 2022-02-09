package Hash;

import java.util.HashMap;

public class CountPairsInArrayDivisibleByK {
    public static void main(String[] args) {
        int[] arr = {5,7}; int K = 2;//4 2 3 4 4 10 8 7   4,5,6,5,9,4,3
        int n = arr.length;
        System.out.println(countKdivPairs(arr,n,K));
    }
    static int countKdivPairs(int arr[], int n, int k){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0;i < n;i++){
            int rem = arr[i] % k;
            map.put(rem , map.getOrDefault( rem , 0 ) + 1);
        }
        int count = 0;
        for(int i = 0;i <= k / 2;i++){
            if(i == 0 || k % 2 == 0 && i == k / 2){
                int val = map.getOrDefault(i,0);
                count += (val * (val - 1)) / 2;
            }else{
                int pair = k - i;
                int val1 = map.getOrDefault(pair,0);
                int val2 = map.getOrDefault(i,0);
                count += val1 * val2;
            }
        }
        return count;
    }
}
