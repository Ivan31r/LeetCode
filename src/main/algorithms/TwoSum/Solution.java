package main.algorithms.TwoSum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class Solution {
    public static void main(String[] args) {
//        int[] sourceArr = { 7, 2, 11, 15};
//        int targetValue = 9;

        int[] sourceArr = {3, 2, 4};
        int targetValue = 6;

        System.out.println(Arrays.toString(twoSumV1(sourceArr, targetValue)));

        System.out.println(Arrays.toString(twoSumV2(sourceArr, targetValue)));

        System.out.println(Arrays.toString(twoSumV3(sourceArr, targetValue)));

    }

    public static int[] twoSumV1(int[] nums, int target) {
        for (int currentElement = 0; currentElement < nums.length; currentElement++) {
            for (int nextElement = currentElement + 1; nextElement < nums.length; nextElement++) {
                if (currentElement == nextElement) {
                    continue;
                }
                if (nums[currentElement] + nums[nextElement] == target) {
                    return new int[]{currentElement, nextElement};
                }
            }
        }
        return new int[]{};
    }

    public static int[] twoSumV2(int[] nums, int target) {
        Map<Integer, Integer> integerMap = new HashMap<>();
        AtomicInteger i = new AtomicInteger();
        Arrays.stream(nums).forEach(v -> integerMap.put(v, i.getAndIncrement()));

        System.out.println(integerMap);


        for (int j = 0; j < nums.length; j++) {
            int addition = target - nums[j];
            if (integerMap.containsKey(addition) && integerMap.get(addition) != j) {
                return new int[]{j, integerMap.get(addition)};

            }

        }
        System.out.println(integerMap);
        return new int[]{};
    }

    public static int[] twoSumV3(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();


        for (int j = 0; j < nums.length; j++) {
            int secondElement = target - nums[j];
            if (map.containsKey(secondElement) && map.get(secondElement) != j) {
                return new int[]{map.get(secondElement), j};
            }
            map.put(nums[j], j);
        }
        return new int[]{};

    }


}

//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//
//        You may assume that each input would have exactly one solution, and you may not use the same element twice.
//
//        You can return the answer in any order.
//
//
//
//        Example 1:
//
//        Input: nums = [2,7,11,15], target = 9
//        Output: [0,1]
//        Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
//        Example 2:
//
//        Input: nums = [3,2,4], target = 6
//        Output: [1,2]
//        Example 3:
//
//        Input: nums = [3,3], target = 6
//        Output: [0,1]