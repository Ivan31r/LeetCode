package main.algorithms.majorityElement;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        int[] nums = {2, 2, 2, 2, 1, 1, 1, 3, 3, 3};
//        int[] nums = {2, 2, 9, 9, 3, 3, 4, 4, 5, 6, 9, 2};
//        int[] nums = {1};
        System.out.println(majorityElementV3(nums));

    }

    public static int majorityElementV1(int[] nums) {
        int countMaxMajorityElement = 0;
        int majorityElement = nums[0];
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
            int frequency = map.get(num);
            if (frequency > countMaxMajorityElement) {
                countMaxMajorityElement = frequency;
                majorityElement = num;
            }
        }
        return majorityElement;
    }


    public static int majorityElementV2(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            if (map.get(nums[i]) > n / 2) {
                return nums[i];
            }
        }
        return 1;
    }

    /*
    как показали тесты это работает не во всех случаях
    */
    public static int majorityElementV3(int[] nums) {
        int res = 0;
        int count = 0;
        for (int num : nums) {
            if (count == 0) {
                res = num;
            }
            count += num == res ? 1 : -1;
        }
        return res;
    }
}

