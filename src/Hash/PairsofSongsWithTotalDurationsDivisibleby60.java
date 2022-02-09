package Hash;

import java.util.HashMap;

public class PairsofSongsWithTotalDurationsDivisibleby60 {
    public static void main(String[] args) {
        int[] time = {30, 20, 150, 100, 40};
        System.out.println(numPairsDivisibleBy60(time));
    }

    static int numPairsDivisibleBy60(int[] time) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < time.length; i++) {
            int rem = time[i] % 60;
            map.put(rem, map.getOrDefault(rem, 0) + 1);
        }
        int count = 0;
        for (int i = 0; i <= 30; i++) {
            if (i == 0 || i == 30) {
                int val = map.getOrDefault(i,0);
                count += (val * (val - 1)) / 2;
            }else{
                int pair = 60 - i;
                int val1 = map.getOrDefault(pair,0);
                int val2 = map.getOrDefault(i,0);
                count += val1 * val2;
            }
        }
        return count;
    }
}