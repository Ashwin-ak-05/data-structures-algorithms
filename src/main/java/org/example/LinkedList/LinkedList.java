package org.example.LinkedList;

import java.util.List;

public class LinkedList {
    public static void main(String[] args) {
        // Create 5 nodes
//        Node node1 = new Node(1);
//        Node node2 = new Node(2);
//        Node node3 = new Node(3);
//        Node node4 = new Node(4);
//        Node node5 = new Node(5);
//
//        // Link the nodes
//        node1.next = node2;
//        node2.next = node3;
//        node3.next = node4;
//        node4.next = node5;


        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        ListNode node6 = new ListNode(6);

        ListNode node7 = new ListNode(7);
        ListNode node8 = new ListNode(8);
        ListNode node9 = new ListNode(9);
        ListNode node10 = new ListNode(10);
        ListNode node11 = new ListNode(11);



        // Link the nodes
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;

        node7.next = node8;
        node8.next = node9;
       // node9.next = node4;

//        InsertNode insertNode = new InsertNode();
//
//        printLinkedList(insertNode.m(node1,4,7));
//        MiddleOfLinkedList middleOfLinkedList = new MiddleOfLinkedList();
//        System.out.println(middleOfLinkedList.middleNode(node1).data);
//
//        ReorderList reorderList = new ReorderList();
//        reorderList.reorderList(node1);
        //printLinkedList(middleOfLinkedList.middleNode(node1).data);

        // Traverse and print the linked list
        //printLinkedList(node1);

        IntersectingNodes intersectingNodes = new IntersectingNodes();
//        ListNode result = intersectingNodes.getIntersectionNode(node1,node7);
//        System.out.println(result.data);

    }

    // Method to print the linked list
    public static void printLinkedList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }


    public static ListNode createNode(int[] list){
        int[] arr = list;

        ListNode head = new ListNode(0);
        ListNode temp = head;
        for(int i : arr){
            ListNode nn = new ListNode(i);
            temp.next = nn;
            temp = temp.next;
        }
        printLinkedList(head);
        return head;
    }




}
