package org.example.neetcode150.trees;

public class DiameterBinaryTree {
    int maxDiamater = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        searchDepth(root);
        return maxDiamater;
    }

    public int searchDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int left = searchDepth(root.left);
        int right = searchDepth(root.right);

        maxDiamater = Math.max(maxDiamater, left + right);
        return Math.max(left, right) + 1;

    }
}
