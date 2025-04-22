package org.example.neetcode150.trees;

import com.sun.source.tree.Tree;

import java.util.LinkedList;
import java.util.Queue;

public class SerializeAndDeserialize {
    public String serialize(TreeNode root) {
        String ans = "";
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        ans += root.val;

        while (!queue.isEmpty()) {
            TreeNode curr = queue.poll();
            TreeNode curr_left = curr.left;
            TreeNode curr_right = curr.right;

            if (curr_left == null) {
                ans += ",null";
            } else {
                ans += "," + curr_left.val;
                queue.add(curr_left);
            }

            if (curr_right == null) {
                ans += ",null";
            } else {
                ans += "," + curr_right.val;
                queue.add(curr_right);
            }
        }
        return ans;

    }

    public TreeNode deserialize(String data) {
        if (data.equals("")) {
            return null;
        }

        String[] arr = data.split(",");

        Queue<TreeNode> queue = new LinkedList<>();

        TreeNode root = new TreeNode(Integer.parseInt(arr[0]));
        queue.add(root);
        int i = 0;

        while (!queue.isEmpty()) {
            TreeNode newVal = queue.poll();
            // TreeNode newNode = new TreeNode(newVal);

            TreeNode leftNode;
            TreeNode rightNode;

            if (arr[i + 1].equals("null")) {
                leftNode = null;
            } else {

                leftNode = new TreeNode(Integer.parseInt(arr[i + 1]));
                queue.add(leftNode);
            }

            if (arr[i + 2].equals("null")) {
                rightNode = null;
            } else {

                rightNode = new TreeNode(Integer.parseInt(arr[i + 2]));
                queue.add(rightNode);
            }

            newVal.left = leftNode;
            newVal.right = rightNode;


            i = i + 2;


        }
        return root;

    }
}
