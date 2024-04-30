package main.algorithms.angeSumQueryImmutable;


class NumArray {

    int[] nums;

    public NumArray(int[] nums) {
        this.nums = nums;
    }

    public int sumRange(int left, int right) {
        int sum = 0;
        while (left <= right) {
            sum += nums[left++];
        }
        return sum;
    }
}

class NumArrayV2 {
    // declare prefix array field
    int[] prefix;

    public NumArrayV2(int[] nums) {
        // initialize prefix sum array with nums length + 1
        prefix = new int[nums.length + 1];
        // iterate over nums array
        for (int i = 0; i < nums.length; i++) {
            // calculate prefix sum on each iteration
            prefix[i + 1] = prefix[i] + nums[i];
        }
    }

    public int sumRange(int left, int right) {
        // return difference between right and left prefix sum
        return prefix[right + 1] - prefix[left];
    }
}

class NumArrayV3 {

    int[] nums;

    public NumArrayV3(int[] nums) {
        this.nums = new int[nums.length + 1];
        for (int i = 1; i <= nums.length; i++) {
            this.nums[i] = nums[i - 1] + this.nums[i - 1];
        }
    }

    public int sumRange(int left, int right) {
        return nums[right + 1] - nums[left];
    }

}

