package main.algorithms.containsDuplicate;

import java.util.HashMap;
import java.util.HashSet;

public class Solution {
    public static void main(String[] args) {
//        int[] nums = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        int[] nums = {1, 2, 3, 4};
        System.out.println(containsDuplicate(nums));
    }

    public static boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int num : nums) {
            if (hashMap.containsKey(num)) {
                return true;
            } else {
                hashMap.put(num, 1);
            }
        }
        return false;
    }

    public static boolean containsDuplicateV2(int[] nums) {
        HashSet<Integer> integers = new HashSet<>();
        for (int num : nums) {
            if (integers.contains(num)) {
                return true;
            } else {
                integers.add(num);
            }
        }
        return false;
    }
}
