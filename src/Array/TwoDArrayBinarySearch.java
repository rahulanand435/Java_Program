package Array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TwoDArrayBinarySearch {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 4, 5},
                       {6, 7, 8, 9, 10},
                       {11, 12, 13, 14, 15},
                       {16, 17, 18, 19, 20}};
        System.out.println(Arrays.toString(bsMatrix(arr, 14)));
    }
    static int[] bsMatrix(int[][] arr, int target) {
        int[] index = {-1, -1};
        int c = arr[0].length / 2;
        int rS = 0 ;
        int rE = arr.length - 1 ;
        while(rS != rE - 1){
            int mid = rS + (rE - rS) / 2;
            if (arr[mid][c] == target){
                index[0] = mid;
                index[1] = c;
                return index;
            }else if (arr[mid][c] > target){
                rE = mid;
            }else{
                rS = mid;
            }
        }
        if (arr[rS][c] == target){
            index[0] = rS;
            index[1] = c;
            return index;
        }
        if (arr[rE][c] == target) {
            index[0] = rE;
            index[1] = c;
            return index;
        }
        if (binarySearch(arr[rS], target, 0, c-1) != -1){
            int col = binarySearch(arr[rS], target, 0, c-1);
            index[0] = rS;
            index[1] = col;
            return index;
        }
        if (binarySearch(arr[rS], target,c+1, arr[rS].length-1) != -1){
            int col = binarySearch(arr[rS], target, c+1, arr[rS].length-1);
            index[0] = rS;
            index[1] = col;
            return index;
        }
        if (binarySearch(arr[rE], target, 0,c-1) != -1){
            int col = binarySearch(arr[rE], target, 0,c-1);
            index[0] = rE;
            index[1] = col;
            return index;
        }
        if (binarySearch(arr[rE], target, c+1,arr[rE].length -1) != -1){
            int col = binarySearch(arr[rE], target, c+1,arr[rE].length -1);
            index[0] = rE;
            index[1] = col;
            return index;
        }
        return index;
    }
    static  int binarySearch(int[] ar, int target, int s, int e){
        while (s <= e){
            int mid = s + (e-s)/2;
            if (ar[mid] < target){
                s = mid + 1;
            }else if (ar[mid] > target){
                e = mid - 1;
            }else{
                return mid;
            }
        }
        return  -1;
    }
}

