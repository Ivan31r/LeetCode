package main.algorithms.isSymmetricTree;

import main.algorithms.sameTree.Solution.TreeNode;

public class Solution {
    public static void main(String[] args) {

    }

    public boolean isSymmetric(TreeNode root) {

        return isSymmetric(root, root);
    }

    private boolean isSymmetric(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        }
        if (left == null || right == null) {
            return false;
        }

        return left.val == right.val && isSymmetric(left.right, right.left) && isSymmetric(left.left, right.right);
    }
}
