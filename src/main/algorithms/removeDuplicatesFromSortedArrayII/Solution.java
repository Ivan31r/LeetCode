package main.algorithms.removeDuplicatesFromSortedArrayII;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
//        int[] nums = {0, 0, 1, 1, 1, 1, 2, 3, 3};
        int[] nums = {1, 1, 1, 2, 2, 3};
        System.out.println(removeDuplicatesV3(nums));
//        System.out.println(remove(nums));
        System.out.println(Arrays.toString(nums));

    }

    public static int removeDuplicatesV1(int[] nums) {
        int currentIndex = 1;
        int duplicate = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                duplicate++;
            } else {
                duplicate = 1;
            }
            if (duplicate < 3) {
                nums[currentIndex++] = nums[i];
            }
        }

        return currentIndex;
    }

    public static int removeDuplicatesV2(int[] nums) {
        int count = 0;
        for (final int num : nums) {
            if (count < 2 || num > nums[count - 2]) {
                nums[count++] = num;
            }
        }
        return count;
    }

    public static int removeDuplicatesV3(int[] nums) {
        int counter = 0;
        for (int currentIndex = 0; currentIndex < nums.length; currentIndex++) {
            if (counter < 2 || nums[currentIndex] > nums[counter - 2]) {
                nums[counter++] = nums[currentIndex];
            }
        }
        return counter;
    }


}
