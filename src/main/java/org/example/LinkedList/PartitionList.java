package org.example.LinkedList;

public class PartitionList {
    public ListNode partition(ListNode head, int x) {
        ListNode before = new ListNode(0);
        ListNode after = new ListNode(0);

        ListNode beforeHead = before;
        ListNode afterHead = after;

        ListNode p = head;

        while (p != null) {
            if (p.data < x) {
                before.next = p;
                before = before.next;

            } else {
                after.next = p;
                after = after.next;
            }
            p = p.next;
        }

        after.next = null;

        before.next = afterHead.next;
        return beforeHead.next;

    }
}
