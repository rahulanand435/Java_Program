package TwoPointer.SlidingWindow;

import java.util.ArrayList;
import java.util.Arrays;

public class Maximumofallsubarraysofsizek {
    public static void main(String[] args) {
        int N = 9, K = 3;
       int arr[] = {1,2,3,1,4,5,2,3,6};
        System.out.println(max(arr,N,K));
    }
    static ArrayList<Integer> max1(int arr[], int n, int k){
        int i = 0;
        int j = k - 1;
        int max = Integer.MIN_VALUE;
        ArrayList<Integer> c = new ArrayList<>();
        while(j < n && i <= j){
            if (arr[i] >= arr[j]){
                max = arr[i];
                i++;
            }else{
                max = arr[j];
                i = j - 1;
                j++;
            }
            c.add(max);
            max = Integer.MIN_VALUE;
        }
        return c;
    }
//    Brude Force Method
    static ArrayList<Integer> max(int arr[], int n, int k){
        int max = Integer.MIN_VALUE;
        ArrayList<Integer> c = new ArrayList<>();
        for (int i = 0 ; i < n - k + 1;i++){
            max = Integer.MIN_VALUE;
            for (int j = i;j <= i + k - 1;j++){
                if (arr[j] > max){
                    max = arr[j];
                }
            }
            c.add(max);
        }
        return  c;
    }
}
