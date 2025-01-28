package org.example.LinkedList;

public class MiddleOfLinkedList {
    public ListNode middleNode(ListNode head) {
        ListNode f = head;
        ListNode s = head;

        if(head == null || head.next==null){
            return head;
        }

        while (f.next !=null ){
            if(f.next.next==null){
                s = s.next;
                break;
            }
            s = s.next;
            f = f.next.next;
        }

        return s;
    }
}
