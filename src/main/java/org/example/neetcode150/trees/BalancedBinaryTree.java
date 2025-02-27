package org.example.neetcode150.trees;

public class BalancedBinaryTree {
    public boolean isBalanced(TreeNode root) {
        if (depth(root) == -1) {
            return false;
        }
        return true;
    }

    public int depth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int left = depth(root.left);
        int right = depth(root.right);

        if (left == -1) {
            return -1;
        }
        if (right == -1) {
            return -1;
        }

        int diff = Math.abs(left - right);
        if (diff > 1) {
            return -1;
        }

        return Math.max(left, right) + 1;
    }
}
