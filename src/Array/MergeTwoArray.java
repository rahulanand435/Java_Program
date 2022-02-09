package Array;

import java.util.Arrays;

public class MergeTwoArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {1, 1, 3, 4};
//        Spacecomplex(arr1,arr2);
//        System.out.println(Arrays.toString(arr1));
//        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(twoPointerMethod(arr1,arr2,4,4)));
    }

    static int[] merge(int[] a, int[] b) {
        int[] c = new int[a.length + b.length];
        int x = 0;
        for (int i = 0; i < a.length; i++) {
            c[x++] = a[i];
        }
        for (int j = 0; j < b.length; j++) {
            c[x++] = b[j];
        }
        Arrays.sort(c);
        return c;
    }

    static int[] twoPointerMethod(int[] nums1, int[] nums2, int m, int n) {
        int[] c = new int[m + n];
        int x = 0;
        int i = 0;
        int j = 0;
        while (i < m && j < n) {
            if (nums1[i] <= nums2[j]) {
                c[x++] = nums1[i++];
            } else {
                c[x++] = nums2[j++];
            }

        }
        if (i == m || j == n) {
            while (x < c.length) {

                if (i == m) {
                    c[x++] = nums2[j++];
                } else if (j == n)
                    c[x++] = nums1[i++];
            }

        }

        return c;
    }

    static void swap(int[] a, int[] b, int i,int j) {
       int c = a[i];
        a[i] = b[j];
        b[j] = c;
    }

    static void Spacecomplex(int[] arr1, int[] arr2) {
        int i = arr1.length - 1;
        int j = 0;
        while (i >= 0 && j < arr2.length) {
            if (arr1[i] >= arr2[j]) {
                swap(arr1,arr2,i,j);
                i--;
                j++;
                }
                else {
                break;
            }

            }
        Arrays.sort(arr1);
        Arrays.sort(arr2);


        }
    }
