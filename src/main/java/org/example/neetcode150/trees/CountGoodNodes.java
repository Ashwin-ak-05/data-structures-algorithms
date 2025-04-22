package org.example.neetcode150.trees;

public class CountGoodNodes {
    int count = 0;

    public int goodNodes(TreeNode root) {
        findNodes(root.left, root.val);
        findNodes(root.right, root.val);
        return count + 1;
    }

    public void findNodes(TreeNode root, int max) {
        if (root == null) {
            return;
        }

        if (root.val >= max) {
            count++;
        }

        findNodes(root.left, Math.max(root.val, max));
        findNodes(root.left, Math.max(root.val, max));
    }
}
