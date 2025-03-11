package org.example.neetcode150.trees;

public class KthSmallestElement {
    int val = 0;
    int count = 0;

    public int kthSmallest(TreeNode root, int k) {
        dfs(root, k);
        return val;
    }

    public int dfs(TreeNode root, int k) {
        if (root == null) {
            return 0;
        }

        if (root.left != null) {
            count = 1 + dfs(root.left, k);
        }

        if (root.left == null && root.right != null) {
            count = 1 + dfs(root.right, k);
        }

        if (count == k) {
            val = root.val;
        }

        return count;

    }
}
