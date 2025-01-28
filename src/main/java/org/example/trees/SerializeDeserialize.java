package org.example.trees;

import com.sun.source.tree.Tree;

import java.lang.invoke.MutableCallSite;
import java.util.LinkedList;
import java.util.Queue;

public class SerializeDeserialize {
    public String serialize(TreeNode root) {
        String result = "";
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        result += root.val;
        while (!queue.isEmpty()) {
            TreeNode temp = queue.peek();
            queue.poll();

            if (temp.left == null) {
                result += ",null";
            } else {
                queue.add(temp.left);
                result += "," + temp.left.val;
            }

            if (temp.right == null) {
                result += ",null";
            } else {
                queue.add(temp.right);
                result += "," + temp.right.val;
            }
        }

        return result;
    }


    public TreeNode deserialize(String data) {
        String[] arr = data.split(",");

        TreeNode root = new TreeNode(Integer.parseInt(arr[0]));
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int i = 1;

        while (!queue.isEmpty()) {
            TreeNode temp = queue.peek();
            queue.poll();

            if (arr[i].equals("null")) {
                temp.left = null;
            } else {
                TreeNode newNode = new TreeNode(Integer.parseInt(arr[i]));
                temp.left = newNode;
                queue.add(newNode);
            }

            if (arr[i + 1].equals("null")) {
                temp.right = null;
            } else {
                TreeNode newNode = new TreeNode(Integer.parseInt(arr[i+1]));
                temp.right = newNode;
                queue.add(newNode);
            }

            i += 2;
        }

        return root;
    }
}
