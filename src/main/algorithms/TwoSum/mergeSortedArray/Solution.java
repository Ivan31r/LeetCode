package main.algorithms.TwoSum.mergeSortedArray;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        /**/
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;
//
//        int[] nums1 = {0};
//        int m = 0;
//        int[] nums2 = {1};
//        int n = 1;
//
//        int[] nums1 = {4, 5, 6, 0, 0, 0};
//        int m = 3;
//        int[] nums2 = {1, 2, 3};
//        int n = 3;

        System.out.println("before " + Arrays.toString(nums1));
        mergeV2(nums1, m, nums2, n);
        System.out.println("after " + Arrays.toString(nums1));
    }

    public static void mergeV2(int[] nums1, int m, int[] nums2, int n) {
        /* через for по итогу так и не вышло */
    }

    /*It's work*/
    public static void mergeV1(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while (j >= 0) {
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }
    }

}
