package org.example.neetcode150.trees;

public class LowestCommonAncestor {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        while (root != null) {
            if (p.val < root.val && q.val < root.val) {
                root = root.left; // Move left
            } else if (p.val > root.val && q.val > root.val) {
                root = root.right; // Move right
            } else {
                return root; // Found LCA
            }
        }
        return null;
    }
}
