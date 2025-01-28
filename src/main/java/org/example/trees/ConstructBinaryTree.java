package org.example.trees;

public class ConstructBinaryTree {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }


    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n = preorder.length;
        return construct(preorder,0,n-1,inorder,0,n-1);
    }

    public TreeNode construct(int[] preorder, int s1, int e1, int[] inorder, int s2, int e2){

        while(s1 > e1){
            return null;
        }
        TreeNode root = new TreeNode(preorder[s1]);
        int index = -1;
        for(int i = s2; i<=e2; i++){
            if(preorder[s1] == inorder[i]){
                index = i;
                break;
            }
        }

        int count = index - s2;

        root.left = construct(preorder,s1+1,s1+count,inorder,s2,index-1);
        root.right = construct(preorder,s1+count+1,e1,inorder,index+1,e2 );
        return root;



    }


}
