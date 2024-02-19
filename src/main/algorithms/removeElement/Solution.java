package main.algorithms.removeElement;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
//        int[] nums = {3, 2, 2, 3};
//        int val = 3;

        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;
        System.out.println("before remove = " + Arrays.toString(nums));
        System.out.println("counter = " + removeElementV2(nums, val));
        System.out.println("after remove = " + Arrays.toString(nums));
    }

    public static int removeElement(int[] nums, int val) {
        int uniqCounter = 0;
        for (int currentIndex = 0; currentIndex < nums.length; currentIndex++) {
            if (nums[currentIndex] != val) {
                nums[uniqCounter] = nums[currentIndex];
                uniqCounter++;
            }
        }
        return uniqCounter;
    } public static int removeElementV2(int[] nums, int val) {
        int uniqCounter = 0;
        for (int currentIndex = 0; currentIndex < nums.length; currentIndex++) {
            if (nums[currentIndex] != val) {
                int temp = nums[uniqCounter];
                nums[uniqCounter] = nums[currentIndex];
                nums[currentIndex] = temp;
                uniqCounter++;
            }
        }
        return uniqCounter;
    }
}
