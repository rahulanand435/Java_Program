package TwoPointer;

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3};
        int[] nums2 = {2,5,6};
        int m = nums1.length;
        int n = nums2.length;
        merge(nums1,m,nums2,n);
    }
    static void merge(int[] nums1, int m, int[] nums2, int n){
        m = nums1.length ;
        n = nums2.length;
        int[] nums3 = new int[m+n];
        int x = 0;
        int i = 0,j=0;
        while(i < m &&j < n){
            if(nums1[i]<=nums2[j]){
                nums3[x++] = nums1[i++];
            }else
                nums3[x++] = nums2[j++];
        }
        if (i == m || j == n){
            while(x < nums3.length){
                if(i == m){
                    nums3[x++] = nums2[j++];
                }else
                    nums3[x++] = nums1[i++];
            }
        }
        for (int y = 0;y < nums3.length;y++){
            System.out.print(nums3[y]+ " ");
        }
    }
}
