package org.example.LinkedList;

public class SwapNodes {
    public ListNode swapPairs(ListNode head) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return head;
        }

        ListNode t1 = head;
        ListNode t2 = head.next;

        ListNode prev = null;

        while (t1 != null && t2 != null) {
            ListNode next_node = t2.next;
            t1.next = next_node;
            t2.next = t1;

            if (t1 == head) {
                head = t2;
            } else {
                prev.next = t2;
            }
            prev = t1;
            t1 = next_node;

            if (t1 != null) {
                t2 = t1.next;
            }
        }

        return head;

    }
}
