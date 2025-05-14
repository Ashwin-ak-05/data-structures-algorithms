package org.example.LinkedList;

public class ReversedLinkedListTwo {
    ListNode left_prev = new ListNode(-1000);

    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode new_node = new ListNode(-1000);
        new_node.next = head;
        head = new_node;

        ListNode l = getLeft(head, left);
        ListNode r = getRight(head, right);

        if (l == r) {
            return head.next;
        }

        ListNode next_node = r.next;
        r.next = null;

        ListNode reversed = reverseNode(l);
        left_prev.next = r;
        l.next = next_node;

        return head.next;

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

    public ListNode getLeft(ListNode root, int left) {
        ListNode curr = root;

        for (int i = 0; i < left; i++) {
            left_prev = curr;
            curr = curr.next;
        }

        return curr;


    }

    public ListNode getRight(ListNode root, int right) {
        ListNode curr = root;

        for (int i = 0; i < right; i++) {
            //left_prev = curr;
            curr = curr.next;
        }

        return curr;
    }
}
