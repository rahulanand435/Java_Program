package com.company.ArrayList;

import java.util.Arrays;

public class Add {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(Arrays.toString(add(arr)));
    }
    static int[] add(int[] arr){
        int[] n = new int[7];
        for (int i = 0;i < arr.length;i++){
            n[i] = arr[i];
        }
        n[5] = 10;
        n[6] = 11;

        return n;
    }

}
