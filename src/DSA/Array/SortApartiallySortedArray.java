package DSA.Array;

import java.util.Arrays;

public class SortApartiallySortedArray {
    public static void main(String[] args) {
        int[] arr = {51,50,22,18,15,1,1,3,5,31,33,48,53,57};
        System.out.println(Arrays.toString(sort(arr)));
    }
    static int[] sort(int[] arr){
        int[] result = new int[arr.length];
        int i = 0;
        int j = arr.length - 1;
        int k = arr.length - 1;
        while(i <= j){
            if (arr[i] <= arr[j]){
                result[k] = arr[j];
                j--;
                k--;
            }else{
                result[k] = arr[i];
                i++;
                k--;
            }
        }
        return result;
    }
}
