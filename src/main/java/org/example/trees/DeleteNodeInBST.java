package org.example.trees;

public class DeleteNodeInBST {
    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) {
            return null;
        }
        if (key > root.val) {
            root.right = deleteNode(root.right, key);
        } else if (key < root.val) {
            root.left = deleteNode(root.left, key);
        } else {
            if (isLeaf(root)) {
                return null;
            }
            if (root.left == null) {
                return root.right;
            }
            if (root.right == null) {
                return root.left;
            }

            int min = findMin(root.right);
            root.val = min;
            root.right = deleteNode(root.right, min);
        }

        return root;
    }

    public boolean isLeaf(TreeNode root) {
        if (root.left == null && root.right == null) {
            return true;
        }
        return false;
    }

    public int findMin(TreeNode root) {
        TreeNode node = root;
        while (node.left != null) {
            node = node.left;
        }
        return node.val;
    }
}
