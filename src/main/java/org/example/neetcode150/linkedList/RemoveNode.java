package org.example.neetcode150.linkedList;


import java.util.List;

public class RemoveNode {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode s = head;
        ListNode f = head;
        if(head.next==null){
            return null;
        }

        for (int i = 1; i <= n; i++) {
            f = f.next;
        }

        if (f == null) {
            return head.next;
        }

        while (f.next != null) {
            s = s.next;
            f = f.next;
        }

        s.next = s.next.next;
        return head;
    }
}
