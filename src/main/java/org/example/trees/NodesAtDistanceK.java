package org.example.trees;

import java.util.ArrayList;
import java.util.List;

public class NodesAtDistanceK {
//    public class TreeNode {
//        int val;
//        TreeNode left;
//        TreeNode right;
//
//        TreeNode(int x) {
//            val = x;
//        }
//    }

//    List<TreeNode> list = new ArrayList<>();
//    List<Integer> result = new ArrayList<>();
//    //int ans = 0;
//
//
//    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
//        findNodes(root, target);
//        below(list.get(0), k);
//
//        for (int i = 1; i < list.size(); i++) {
//            int val = k - i;
//            if (list.get(i).left.val == list.get(i - 1).val) {
//                below(list.get(i).right, val - 1);
//            } else {
//                below(list.get(i).left, val - 1);
//            }
//        }
//        return result;
//    }
//
//    public boolean findNodes(TreeNode root, TreeNode target) {
//
//        if (root == null) {
//            return false;
//        }
//
//        if (target == null) {
//            return false;
//        }
//
//        if (root.val == target.val) {
//            list.add( root);
//            return true;
//        }
//
//        if (findNodes(root.left, target) || findNodes(root.right, target)) {
//            list.add( root);
//            return true;
//        }
//
//        return false;
//    }
//
//
//    public int below(TreeNode root, int k) {
//        if (root == null) {
//            return 0;
//        }
//        if (k < 0) {
//            return 0;
//        }
//        if (k == 0) {
//            result.add(root.val);
//            return 1;
//        }
//
//        int left = below(root.left, k - 1);
//        int right = below(root.right, k - 1);
//
//        return left + right;
//    }

    List<TreeNode> list = new ArrayList<>();
    List<Integer> result = new ArrayList<>();
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        findNodes(root, target);
        below(list.get(0), k);

        for (int i = 1; i < list.size(); i++) {
            int val = k - i;
            if(val == 0){
                result.add(list.get((i)).val);
                break;
            }
            if (list.get(i).left != null && list.get(i).left.val == list.get(i - 1).val) {
                below(list.get(i).right, val - 1);
            } else {
                below(list.get(i).left, val - 1);
            }
        }
        return result;
    }

    public boolean findNodes(TreeNode root, TreeNode target) {

        if (root == null) {
            return false;
        }

        if (target == null) {
            return false;
        }

        if (root.val == target.val) {
            list.add(root);
            return true;
        }

        if (findNodes(root.left, target) || findNodes(root.right, target)) {
            list.add(root);
            return true;
        }

        return false;
    }

    public int below(TreeNode root, int k) {
        if (root == null) {
            return 0;
        }
        if (k < 0) {
            return 0;
        }
        if (k == 0) {
            result.add(root.val);
            return 1;
        }

        int left = below(root.left, k - 1);
        int right = below(root.right, k - 1);

        return left + right;
    }
}
