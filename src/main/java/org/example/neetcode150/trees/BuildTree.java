package org.example.neetcode150.trees;

public class BuildTree {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n = preorder.length;
        return construct(preorder,0,n-1,inorder,0,n-1);
    }

    public TreeNode construct(int[] preorder, int pre_s, int pre_e, int[] inorder, int in_s, int in_e) {

        if (pre_s > pre_e) {
            return null;
        }
        TreeNode newNode = new TreeNode(preorder[pre_s]);

        int mid = -1;
        for (int i = in_s; i <= in_e; i++) {
            if (preorder[pre_s] == inorder[i]) {
                mid = i;
            }
        }

        int count = mid - in_s;


        newNode.left = construct(preorder, pre_s + 1, pre_s+count, inorder, in_s, mid - 1);
        newNode.right = construct(preorder, pre_s+count+1 , pre_e, inorder, mid + 1, in_e);
        return newNode;
    }
}
