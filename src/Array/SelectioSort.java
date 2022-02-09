package Array;

import java.util.Arrays;

public class SelectioSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        selectionsort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr,int fisrt,int second){
        int temp = arr[fisrt];
        arr[fisrt] = arr[second];
        arr[second] = temp;
    }
    static int getMaxindex(int[] arr,int start,int end){
        int max = start;
        for (int i = start; i <= end; i++) {
            if (arr[max] < arr[i]){
                max = i;
            }
        }
        return  max;
    }
    static void selectionsort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i - 1;
            int maxIndex = getMaxindex(arr,0,last);
            swap(arr,maxIndex,last);
        }
    }
}
