package main.algorithms.convertSortedArrayToBinarySearchTree;

public class Solution {
    public static void main(String[] args) {
        int[] numbers = {-10, -3, 0, 5, 9};
        TreeNode treeNode = new Solution().sortedArrayToBST(numbers);
        System.out.println(treeNode);
    }

    public TreeNode sortedArrayToBST(int[] nums) {
        return buildSubTree(nums, 0, nums.length - 1);
    }

    private TreeNode buildSubTree(int[] nums, int start, int end) {
        if (start > end) {
            return null;
        }
        int middle = (start + end) / 2;
        TreeNode node = new TreeNode(nums[middle]);
        node.left = buildSubTree(nums, start, middle - 1);
        node.right = buildSubTree(nums, middle + 1, end);
        return node;
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }

        @Override
        public String toString() {
            return "TreeNode{" +
                    "val=" + val +
                    ", left=" + left +
                    ", right=" + right +
                    '}';
        }
    }
}
