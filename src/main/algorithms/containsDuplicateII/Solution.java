package main.algorithms.containsDuplicateII;

import java.util.HashMap;

public class Solution {
    public static void main(String[] args) {
        int[] nums = {1, 0, 1, 1};
//        int[] nums = {1, 2, 3, 1, 2, 3};
//        int[] nums = {1, 2, 3, 1};
        int k = 1;
//        int k = 3;
        System.out.println(containsNearbyDuplicate(nums, k));
    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> values = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (values.containsKey(nums[i]) && Math.abs(values.get(nums[i]) - i) <= k) {
                return true;
            } else {
                values.put(nums[i], i);
            }
        }
        return false;
    }
}
