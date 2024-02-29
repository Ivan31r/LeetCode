package main.algorithms.removeDuplicatesFromSortedArray;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
//        int[] nums = {1, 1, 2};
//        int[] nums = {1, 2};
        System.out.println("unique counter numbers = " + removeDuplicates(nums));
        System.out.println(Arrays.toString(nums));
    }

    public static int removeDuplicates(int[] nums) {
        int uniqueCounterNumber = 1;
        for (int currentIndex = 1; currentIndex < nums.length; currentIndex++) {
            if (nums[currentIndex] != nums[uniqueCounterNumber - 1]) {
                nums[uniqueCounterNumber++] = nums[currentIndex];
            }
        }
        return uniqueCounterNumber;
    }
}
