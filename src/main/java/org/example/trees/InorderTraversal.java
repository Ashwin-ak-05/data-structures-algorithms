//package org.example.trees;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Stack;
//
//public class InorderTraversal {
//    List<Integer> list = new ArrayList<>();
//    public List<Integer> inorderTraversal(TreeNode root) {
//        //Queue<Integer> queue = new LinkedList<>();
//        Stack<TreeNode> stack = new Stack<>();
//        TreeNode curr = root;
//
//        while(stack.size()>0 || curr != null){
//            while(curr != null){
//                stack.push(curr);
//                curr = curr.left;
//            }
//            curr = stack.peek();
//            stack.pop();
//            list.add(curr.val);
//            curr = curr.right;
//        }
//        return list;
//
//
//
//
//
//        // traversal(root);
//        // return list;
//    }
//}
