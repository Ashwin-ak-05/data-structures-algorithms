//package org.example.trees;
//
//public class LowestCommonAccesstor {
//    /**
//     * Definition for a binary tree node.
//     * public class TreeNode {
//     *     int val;
//     *     TreeNode left;
//     *     TreeNode right;
//     *     TreeNode(int x) { val = x; }
//     * }
//     */
//    class Solution {
//        List<TreeNode> ancestors_p = new ArrayList<>();
//        List<TreeNode> ancestors_q = new ArrayList<>();
//        public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
//            TreeNode result_node = null;
//            find(ancestors_p,root,p);
//            find(ancestors_q,root,q);
//
//            int n;
//            if(ancestors_p.size() > ancestors_q.size() ){
//                n = ancestors_q.size();
//            }
//            else{
//                n = ancestors_p.size();
//            }
//
//            for(int i = 0; i<n; i++){
//                if(ancestors_p.get(i).val != ancestors_q.get(i).val){
//
//                    break;
//                }
//                else{
//                    result_node = ancestors_p.get(i);
//                }
//            }
//            return result_node;
//
//
//        }
//
//        public boolean find(List<TreeNode> arr,TreeNode root, TreeNode x){
//            if(root == null){
//                return false;
//            }
//            if(root.val == x.val){
//                arr.add(0,root);
//                return true;
//            }
//
//            if(find(arr,root.left,x) || find(arr,root.right,x)){
//                arr.add(0,root);
//                return true;
//            }
//            return false;
//        }
//    }
//}
