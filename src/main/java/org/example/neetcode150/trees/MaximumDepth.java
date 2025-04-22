package org.example.neetcode150.trees;

public class MaximumDepth {
    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }

        int leftCount = 1 + maxDepth(root.left);
        int rightCount = 1 + maxDepth(root.right);

        return Math.max(leftCount,rightCount);
    }
}
