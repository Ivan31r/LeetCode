package main.algorithms.binaryTreeInorderTraversal;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {

    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> nodesValue = new ArrayList<>();
        inOrder(root, nodesValue);
        return nodesValue;
    }

    private void inOrder(TreeNode root, List<Integer> nodesValue) {
        if (root == null) {
            return;
        }
        inOrder(root.right, nodesValue);
        nodesValue.add(root.val);
        inOrder(root.left, nodesValue);
        nodesValue.add(root.val);
    }


    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
    }
}
