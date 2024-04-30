package main.algorithms.searchInsertPosition;

public class Solution {
    public static void main(String[] args) {
//        int[] nums = {1, 3, 5, 6};
        int[] nums = {1, 3, 5, 7};
//        int target = 5;
        int target = 6;
        System.out.println(searchInsert(nums, target));
    }

    public static int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int middle;
        if (target < nums[0]) return  0;
        if (target > nums[nums.length - 1]) return nums.length;
        while (left <= right) {
            middle = left + (right - left) / 2;
            if (target == nums[middle]) {
                return middle;
            } else if (nums[middle] < target) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return left;
    }
}
