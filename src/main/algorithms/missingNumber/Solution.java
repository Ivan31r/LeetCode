package main.algorithms.missingNumber;

import java.util.Arrays;
import java.util.HashSet;

public class Solution {
    public static void main(String[] args) {
        int[] nums = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        System.out.println(missingNumber(nums));
    }

    public static int missingNumber(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i) {
                return i;
            }
        }
        return nums.length;
    }

    public static int missingNumberV4(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        for (int i = 0; i <= nums.length; i++) {
            if (!set.contains(i)) {
                return i;
            }
        }
        return -1;
    }

    public static int missingNumberV2(int[] nums) { //brute
        int n = nums.length;
        int[] v = new int[n + 1];
        Arrays.fill(v, -1);
        for (int i = 0; i < nums.length; i++) {
            v[nums[i]] = nums[i];
        }
        for (int i = 0; i < v.length; i++) {
            if (v[i] == -1) return i;
        }
        return 0;
    }


    public static int missingNumberV3(int[] nums) {  //formula
        int n = nums.length;
        int Tsum = (n * (n + 1)) / 2;
        int actualSum = Arrays.stream(nums).sum();
        return Tsum - actualSum;
    }


}
