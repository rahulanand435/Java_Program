package DSA.Array;

public class MedianofTwoSortedArrays {
    public static void main(String[] args) {
        int[] nums1 = {1,2};int[] nums2 = {3,4};
        System.out.println(findMedianSortedArrays(nums1,nums2));
    }
    static double findMedianSortedArrays(int[] nums1, int[] nums2){
        int[] res = new int[nums1.length + nums2.length];
        int i = 0,j = 0;
        int k = 0;
        while ( k < res.length && i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]){
                res[k] = nums1[i];
                i++;
                k++;
            }else {
                res[k] = nums2[j];
                j++;
                k++;
            }
        }
        while(i < nums1.length)res[k++] = nums1[i++];
        while(j < nums2.length)res[k++] = nums2[j++];
        double median = 0;
        if (res.length % 2 == 1){
            median = (double) res[res.length / 2];
        }else{
            median = (double) ((double)(res[res.length / 2] + (double)res[res.length / 2 - 1]) / (double)2 );
        }
        return median;
    }
}
