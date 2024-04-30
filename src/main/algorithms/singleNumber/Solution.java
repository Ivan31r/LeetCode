package main.algorithms.singleNumber;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        int[] nums = {4, 1, 2, 1, 2};
        singleNumberV2(nums);
    }

    public static int singleNumber(int[] nums) {
        Map<Integer, Integer> numsCounter = new HashMap<>(nums.length);
        for (int num : nums) {
            if (numsCounter.containsKey(num)) {
                numsCounter.remove(num);
            } else {
                numsCounter.put(num, 1);
            }
        }
        return numsCounter.keySet().stream().findFirst().get();
    }

    public static int singleNumberV2(int[] nums) {
        int XOR = 0;
        for (int i = 0; i < nums.length; i++) {
            XOR = XOR ^ nums[i];
        }
        return XOR;
    }
}
