package org.example.neetcode150.trees;

public class MaximumPathSum {
    int maxCount = 0;

    public int maxPathSum(TreeNode root) {
        findMax(root);
        return maxCount;
    }

    public int findMax(TreeNode root) {
        if (root == null) {
            return 0;
        }
        maxCount = Math.max(root.val, maxCount);

        int left = findMax(root.left);
        int right = findMax(root.right);


        maxCount = Math.max(maxCount, left + right + root.val);
        maxCount = Math.max(maxCount, right + root.val);
        maxCount = Math.max(maxCount, left + root.val);

        int maxleft = Math.max(left + root.val, root.val);
        int maxright = Math.max(right + root.val, root.val);

        return Math.max(maxleft, maxright);

    }
}
