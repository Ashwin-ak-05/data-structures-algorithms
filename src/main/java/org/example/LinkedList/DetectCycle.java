package org.example.LinkedList;

public class DetectCycle {
    public ListNode detectCycle(ListNode head) {
        if(head == null || head.next==null){
            return head;
        }

        ListNode s = head;
        ListNode f = head;

        while(f.next != null && f.next.next != null){
            s = s.next;
            f = f.next;

            if(s == f){
                break;
            }
        }

        if(f.next ==  null || f.next.next == null){
            return null;
        }

        ListNode p1 = head;
        ListNode p2 = s;

        if(p1 == p2){
            return p1;
        }

        while(p1 != p2){
            p1 = p1.next;
            p2 = p2.next;

            if(p1 == p2){
                return p1;
            }
        }

        return null;
    }
}
