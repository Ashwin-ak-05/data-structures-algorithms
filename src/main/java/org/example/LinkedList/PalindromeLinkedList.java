package org.example.LinkedList;

public class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null)
            return true;

        // Step 1: Find middle using slow and fast pointers
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }


        ListNode secondHalf = reverseNode(slow);


        ListNode firstHalf = head;
        while (secondHalf != null) {
            if (firstHalf.val != secondHalf.val) {
                return false;
            }
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }

        return true;

    }

    public ListNode reverseNode(ListNode root) {
        ListNode rh = null;

        while (root != null) {
            ListNode temp = root.next;
            root.next = rh;
            rh = root;
            root = temp;
        }
        return rh;
    }
}
