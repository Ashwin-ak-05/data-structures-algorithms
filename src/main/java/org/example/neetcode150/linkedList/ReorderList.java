package org.example.neetcode150.linkedList;

public class ReorderList {

    public void reorderList(ListNode head) {
        if (head == null || head.next.next == null) {
            return;
        }

        ListNode slow = head;
        ListNode fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode second = reverseList(slow.next);
        slow.next = null;
        ListNode first = head;

        while (second != null) {
            ListNode temp1 = first.next;
            ListNode temp2 = second.next;

            first.next = second;
            second.next = temp1;
            second = temp2;
            first = temp1;

        }

    }

    public ListNode reverseList(ListNode head) {
        ListNode rh = null;

        ListNode curr = head;

        while (curr != null) {
            ListNode t = curr;
            curr = curr.next;
            t.next = rh;
            rh = t;
        }

        return rh;
    }

}
