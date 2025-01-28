package org.example.trees;

import jdk.dynalink.beans.StaticClass;
import org.example.LinkedList.ListNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Client {
    public static void main(String[] args) {
//        ConstructBinaryTree constructBinaryTree = new ConstructBinaryTree();
//        int[] preorder = {3,9,20,15,7};
//        int[] inorder = {9,3,15,20,7};
//
//        ConstructBinaryTree.TreeNode node = constructBinaryTree.buildTree(preorder,inorder);

//        Integer[] array = {0,1,null,3,2};
//        NodesAtDistanceK nodesAtDistanceK = new NodesAtDistanceK();
//        TreeNode root = createBinaryTreeFromArray(array);
//        TreeNode target = targetNode(root,2);
//        List<Integer> result = nodesAtDistanceK.distanceK(root,target,1);
//        for (int i = 0; i < result.size(); i++) {
//            Integer integer = result.get(i);
//            System.out.print(integer + " ");
//
//        }
        SerializeDeserialize serializeDeserialize = new SerializeDeserialize();
        Integer[] array = {8,2,9,3,6,null,14,null,null,8,null,null,null,null,null};
        TreeNode root = createBinaryTreeFromArray(array);
        String serialized_string = serializeDeserialize.serialize(root);
        System.out.print(serialized_string);
        System.out.println();

        printTree(serializeDeserialize.deserialize(serialized_string));
    }


    public static TreeNode createBinaryTreeFromArray(Integer[] array) {
        if (array == null || array.length == 0) return null;

        TreeNode root = new TreeNode(array[0]);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        int i = 1;
        while (!queue.isEmpty() && i < array.length) {
            TreeNode current = queue.poll();

            if (array[i] != null) {
                current.left = new TreeNode(array[i]);
                queue.add(current.left);
            }
            i++;

            if (i < array.length && array[i] != null) {
                current.right = new TreeNode(array[i]);
                queue.add(current.right);
            }
            i++;
        }
        return root;
    }

    public static void printTree(TreeNode root) {
        if (root == null) return;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode current = queue.poll();
            System.out.print((current != null ? current.val : "null") + " ");
            if (current != null) {
                queue.add(current.left);
                queue.add(current.right);
            }
        }
    }

    public static TreeNode targetNode(TreeNode root, int val){
        TreeNode target =  null;
        if (root == null) {
            return null;
        };
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode current = queue.poll();
            if(current != null && current.val == val){
                return current;
            }
           // System.out.print((current != null ? current.val : "null") + " ");
            if (current != null) {
                queue.add(current.left);
                queue.add(current.right);
            }
        }
        return target;
    }
}
