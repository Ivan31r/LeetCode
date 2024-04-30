package main.algorithms.moveZeroes;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 0, 0, 3, 12};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void moveZeroes(int[] nums) {
        int left = 0;
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != 0) {
                int temp = nums[left];
                nums[left] = nums[index];
                nums[index] = temp;
                left++;
            }
        }
    }
}
