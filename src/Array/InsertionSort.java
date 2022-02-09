package Array;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 1, 2};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr,int a,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    static void insertion(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1;j > 0;j--){
                if (arr[j] < arr[j-1]){
                    swap(arr,j,j-1);
                }
                else{
                    break;
                }
            }
        }
    }
    static void insertionfor(int[] arr){
        for (int i = 1;i < arr.length; i++){
            int pick = arr[i];
            int j = i-1;
            for (j = i - 1;j >= 0 && arr[j] > pick ; j--){

                    arr[j + 1] = arr[j];
            }
            arr[j + 1] = pick;
        }
    }
//    static void insertion(int[] arr){
//        for (int i = 1; i < arr.length; i++){
//            int pick = arr[i];
//            int j = i - 1;
//            while(j >= 0 && arr[j] > pick){
//                if (arr[j] > pick){
//                    arr[j + 1] = arr[j];
//                    j--;
//                }
//                arr[j + 1] = pick;
//            }
//       }
    }

