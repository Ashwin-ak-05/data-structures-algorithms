package org.example.neetcode150.linkedList;

public class CreateNode {
    public static ListNode arrayToListNode(int[] arr) {
        if (arr == null || arr.length == 0) return null; // Handle empty array

        ListNode head = new ListNode(arr[0]); // First node
        ListNode current = head;

        for (int i = 1; i < arr.length; i++) {
            current.next = new ListNode(arr[i]);
            current = current.next;
        }
        return head;
    }
}
